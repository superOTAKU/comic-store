package org.sky.comic.common.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {
    private HttpStatus status;

    private ResponseEntityBuilder() {
    }

    private RestBodyBuilder setStatus(HttpStatus status) {
        this.status = status;
        return new RestBodyBuilder();
    }

    public class RestBodyBuilder {
        private final RestBody body = new RestBody();

        public RestBodyBuilder code(String code) {
            body.setCode(code);
            return this;
        }

        public RestBodyBuilder msg(String msg) {
            body.setMsg(msg);
            return this;
        }

        public RestBodyBuilder data(Object data) {
            body.setData(data);
            return this;
        }

        public ResponseEntity<RestBody> build() {
            return new ResponseEntity<RestBody>(body, ResponseEntityBuilder.this.status);
        }
    }

    public static RestBodyBuilder status(HttpStatus status) {
        return new ResponseEntityBuilder().setStatus(status);
    }

    public static RestBodyBuilder notFound() {
        return status(HttpStatus.NOT_FOUND);
    }

    public static RestBodyBuilder ok() {
        return status(HttpStatus.OK);
    }

}
