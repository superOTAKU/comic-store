package org.sky.comic.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Attach {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String filename;
    private String mimeType;
    private Long size;
    private String storageProtocol;
    private String storageUrl;
}
