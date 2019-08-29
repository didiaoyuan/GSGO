package top.blogcode.user.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.blogcode.user.service.entity.User;

@Mapper
public interface UserMapper {
    boolean insert(User user);
}
