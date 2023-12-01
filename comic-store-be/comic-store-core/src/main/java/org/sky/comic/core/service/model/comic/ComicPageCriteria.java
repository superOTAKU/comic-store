package org.sky.comic.core.service.model.comic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sky.comic.common.pagination.IPageCriteria;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ComicPageCriteria implements IPageCriteria {
    private Integer page;
    private Integer rows;
}
