package org.sky.comic.common.pagination;

import java.util.List;

public class PageResult<T> {
    private Integer page;
    private Integer rows;
    private Long total;
    private List<T> list;
}
