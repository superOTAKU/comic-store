package org.sky.comic.core.service.model.comicChapter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sky.comic.common.pagination.IPageCriteria;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChapterPageCriteria implements IPageCriteria {
    private Integer page;
    private Integer rows;
    private Long comicId;
}
