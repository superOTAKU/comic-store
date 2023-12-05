package org.sky.comic.core.service.user;

import org.sky.comic.common.pagination.PageResult;
import org.sky.comic.core.domain.User;
import org.sky.comic.core.service.user.exception.DuplicatedEmailException;
import org.sky.comic.core.service.user.model.UserPageCriteria;

import java.util.Optional;

public interface IUserService {

    Optional<User> getByEmail(String email);

    void insert(User user) throws DuplicatedEmailException;

    PageResult<User> getPage(UserPageCriteria criteria);
}
