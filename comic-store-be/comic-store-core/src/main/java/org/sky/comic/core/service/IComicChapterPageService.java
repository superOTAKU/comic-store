package org.sky.comic.core.service;

import org.sky.comic.common.pagination.PageResult;
import org.sky.comic.core.domain.ComicChapterPart;
import org.sky.comic.core.service.model.comicChapterPage.ChapterPagePageCriteria;

public interface IComicChapterPageService {

    PageResult<ComicChapterPart> getPage(ChapterPagePageCriteria criteria);

}
