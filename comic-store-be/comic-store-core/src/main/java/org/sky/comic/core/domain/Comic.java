package org.sky.comic.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Comic {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long authorId;
    private String name;
}
