package org.sky.comic.common.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ServiceRuntimeException extends RuntimeException {
    private final Map<String, Object> details = new HashMap<>();

    public ServiceRuntimeException() {
        this(null);
    }

    public ServiceRuntimeException(String message, Object ... detailPairs) {
        this(message, null, detailPairs);
    }

    public ServiceRuntimeException(String message, Throwable cause, Object ... detailPairs) {
        super(message, cause);
        for (int i = 0; i < detailPairs.length; i = i + 2) {
            this.details.put((String)detailPairs[0], detailPairs[1]);
        }
    }

    @Override
    public String getMessage() {
        String populatedMsg = Optional.ofNullable(super.getMessage()).orElse("");
        if (!this.details.isEmpty()) {
            populatedMsg += ", details: ";
            populatedMsg += this.details.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining(", "));
        }
        return populatedMsg;
    }

    public Map<String, Object> getDetails() {
        return details;
    }
}
