package org.sky.comic.core.service;

import org.sky.comic.core.domain.Attach;

import java.util.Optional;

public interface IAttachService {

    Attach upload();

    Optional<Attach> getById(Long id);

}
