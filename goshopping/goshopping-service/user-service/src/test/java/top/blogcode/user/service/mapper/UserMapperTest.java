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

    /**
     * 插入User对象
     */
    @Test
    public void insert() {
        User user = new User();
        user.setUser_account("tom2");
        userMapper.insert(user);
    }

    /**
     * 根据id更新后插入更新时间
     */
    @Test
    public void update(){
        User user = new User();
        user.setUser_id(Long.parseLong("1168355844740861954"));
        user.setUser_pass("998998");
        userMapper.updateById(user);
    }

    /**
     * 根据账户名查询User对象
     */
    @Test
    public void selectByAccount(){
        log.info(userMapper.selectByAccount("tom2").toString());
    }
}