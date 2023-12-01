package org.sky.comic.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ComicChapter {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long comicId;
    private Integer chapterNo;
    private String title;
}
