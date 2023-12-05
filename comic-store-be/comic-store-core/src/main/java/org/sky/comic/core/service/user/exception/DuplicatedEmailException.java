package org.sky.comic.core.service.user.exception;

import org.sky.comic.common.exception.ServiceException;

public class DuplicatedEmailException extends ServiceException {

    public DuplicatedEmailException() {
    }

    public DuplicatedEmailException(String message, Throwable cause, Object... detailPairs) {
        super(message, detailPairs);
    }

    public DuplicatedEmailException(String message, Object... detailPairs) {
        super(message, detailPairs);
    }

}
