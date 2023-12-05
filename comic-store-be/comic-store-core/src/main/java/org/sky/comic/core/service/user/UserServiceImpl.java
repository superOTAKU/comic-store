package org.sky.comic.core.service.user;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sky.comic.common.pagination.PageResult;
import org.sky.comic.core.domain.User;
import org.sky.comic.core.infrastructure.mapper.UserMapper;
import org.sky.comic.core.service.user.exception.DuplicatedEmailException;
import org.sky.comic.core.service.user.model.UserPageCriteria;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    private final UserMapper mapper;

    @Override
    public Optional<User> getByEmail(String email) {
        var user = mapper.selectOne(Wrappers.lambdaQuery(User.class).eq(User::getEmail, email));
        return Optional.ofNullable(user);
    }

    @Override
    public void insert(User user) throws DuplicatedEmailException {
        try {
            mapper.insert(user);
        } catch (DuplicateKeyException e) {
            throw new DuplicatedEmailException("email duplicated", "email", user.getEmail());
        }
    }

    @Override
    public PageResult<User> getPage(UserPageCriteria criteria) {
        return null;
    }
}
