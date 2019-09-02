package top.blogcode.user.service.mapper.handler;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 当执行插入操作自动添加
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setInsertFieldValByName("createTime", LocalDateTime.now(), metaObject);//@since 快照：3.0.7.2-SNAPSHOT， @since 正式版暂未发布3.0.7
//        this.setInsertFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }
    /**
     * 当执行更新操作自动添加
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setUpdateFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }
}
