package org.sky.comic.core.service;

import org.sky.comic.common.pagination.PageResult;
import org.sky.comic.core.domain.User;
import org.sky.comic.core.service.model.user.UserPageCriteria;

import java.util.Optional;

public interface IUserService {

    Optional<User> getByEmail(String email);

    void save(User user);

    PageResult<User> getPage(UserPageCriteria criteria);
}
