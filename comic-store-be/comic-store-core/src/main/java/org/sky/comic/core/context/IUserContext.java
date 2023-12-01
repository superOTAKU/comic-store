package org.sky.comic.core.context;

import org.sky.comic.core.domain.User;

import java.util.Optional;

public interface IUserContext {

    Optional<User> currentUser();

}
