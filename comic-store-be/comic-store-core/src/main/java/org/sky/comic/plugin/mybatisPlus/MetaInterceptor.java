package org.sky.comic.plugin.mybatisPlus;

import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.sky.comic.core.domain.ICreatedByHolder;
import org.sky.comic.core.domain.ICreatedTimeHolder;
import org.sky.comic.core.domain.IUpdatedByHolder;
import org.sky.comic.core.domain.IUpdatedTimeHolder;

import java.time.LocalDateTime;
import java.util.Map;

// TODO 从上下文获取编辑者
public class MetaInterceptor implements InnerInterceptor {

    public void beforeUpdate(Executor executor, MappedStatement ms, Object parameter) {
        switch (ms.getSqlCommandType()) {
            case INSERT -> fillInsert(parameter);
            case UPDATE -> fillUpdate(parameter);
        }
    }

    private void fillInsert(Object parameter) {
        if (parameter instanceof ICreatedTimeHolder createdTimeHolder && createdTimeHolder.getCreatedTime() == null) {
            createdTimeHolder.setCreatedTime(LocalDateTime.now());
        }
        if (parameter instanceof IUpdatedTimeHolder updatedTimeHolder && updatedTimeHolder.getUpdatedTime() == null) {
            updatedTimeHolder.setUpdatedTime(LocalDateTime.now());
        }
        if (parameter instanceof ICreatedByHolder createdByHolder && createdByHolder.getCreatedBy() == null) {
        }
        if (parameter instanceof IUpdatedByHolder updatedBy && updatedBy.getUpdatedBy() == null) {
        }
    }

    private void fillUpdate(Object parameter) {
        if (parameter instanceof IUpdatedTimeHolder updatedTimeHolder ) {
            updatedTimeHolder.setUpdatedTime(LocalDateTime.now());
        }
        if (parameter instanceof IUpdatedByHolder updatedByHolder) {
        }
        if (parameter instanceof Map<?, ?> map) {
            if(map.containsKey("et")){
                Object entity = map.get("et");
                if (entity instanceof IUpdatedTimeHolder updatedTimeHolder ) {
                    updatedTimeHolder.setUpdatedTime(LocalDateTime.now());
                }
                if (entity instanceof IUpdatedByHolder updatedByHolder) {
                }
            }

        }
    }

}
