package org.sky.comic.core.service.model.comicChapterPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sky.comic.common.pagination.IPageCriteria;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChapterPagePageCriteria implements IPageCriteria {
    private Integer page;
    private Integer rows;
    private Long comicId;
    private Long chapterId;
}
