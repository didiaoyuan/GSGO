package top.blogcode.user.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.blogcode.user.service.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
