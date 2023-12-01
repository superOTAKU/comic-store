package org.sky.comic.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ComicChapterComment {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long comicId;
    private Long chapterId;
    private Long userId;
    private String comment;
}
