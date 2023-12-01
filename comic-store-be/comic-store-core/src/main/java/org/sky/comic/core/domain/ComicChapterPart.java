package org.sky.comic.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ComicChapterPart {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long chapterId;
    private Integer order;
    private Long attachId;
}
