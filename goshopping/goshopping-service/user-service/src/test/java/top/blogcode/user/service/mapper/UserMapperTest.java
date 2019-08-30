package top.blogcode.user.service.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import top.blogcode.user.service.UserServiceApplicationTests;
import top.blogcode.user.service.entity.User;

import javax.annotation.Resource;

import java.util.UUID;

import static org.junit.Assert.*;
@Slf4j
public class UserMapperTest extends UserServiceApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Test
    public void insert() {
        User user = new User();
//        String uuid = UUID.randomUUID().toString();
//        uuid.replace("-","");
//        user.setUser_id(1L);
        user.setUser_account("tom998");
        userMapper.insert(user);
    }
}