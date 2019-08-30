package top.blogcode.user.service.service.impl;

import com.alibaba.fastjson.JSONArray;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.blogcode.user.service.UserServiceApplicationTests;
import top.blogcode.user.service.entity.User;
import top.blogcode.user.service.service.UserService;
import java.util.List;

@Slf4j
public class UserServiceImplTest extends UserServiceApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void getList() {
        List<User> userList = userService.getList();
        log.info(JSONArray.toJSONString(userList));
    }

    @Test
    public void add() {
    }
}