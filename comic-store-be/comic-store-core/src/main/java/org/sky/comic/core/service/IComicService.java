package org.sky.comic.core.service;

import org.sky.comic.common.pagination.PageResult;
import org.sky.comic.core.domain.Comic;
import org.sky.comic.core.service.model.comic.ComicPageCriteria;

import java.util.Optional;

public interface IComicService {

    PageResult<Comic> getPage(ComicPageCriteria criteria);

    void save(Comic comic);

    void deleteById(Long id, String operator);

    Optional<Comic> findById(Long id);

}
