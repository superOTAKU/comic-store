package org.sky.comic.core.service;

import org.sky.comic.common.pagination.PageResult;
import org.sky.comic.core.domain.ComicChapter;
import org.sky.comic.core.service.model.comicChapter.ChapterPageCriteria;

public interface IComicChapterService {

    PageResult<ComicChapter> getPage(ChapterPageCriteria criteria);

    void deleteByComicId(Long comicId);

}
