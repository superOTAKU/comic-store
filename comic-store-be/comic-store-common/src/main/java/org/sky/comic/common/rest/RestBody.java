package org.sky.comic.common.rest;

import lombok.Data;

@Data
public class RestBody {
    private String code;
    private String msg;
    private Object data;
}
