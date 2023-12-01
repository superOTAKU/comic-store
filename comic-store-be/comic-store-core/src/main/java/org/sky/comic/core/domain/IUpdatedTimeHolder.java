package org.sky.comic.core.domain;

import java.time.LocalDateTime;

public interface IUpdatedTimeHolder {

    LocalDateTime getUpdatedTime();

    void setUpdatedTime(LocalDateTime updatedTime);

}
