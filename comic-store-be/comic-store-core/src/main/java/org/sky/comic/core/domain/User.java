package org.sky.comic.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User implements ICreatedByHolder, ICreatedTimeHolder {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String createdBy;
    private LocalDateTime createdTime;
}
