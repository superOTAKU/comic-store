package org.sky.comic.core.domain;

import java.time.LocalDateTime;

public interface ICreatedTimeHolder {

    LocalDateTime getCreatedTime();

    void setCreatedTime(LocalDateTime createdTime);

}
