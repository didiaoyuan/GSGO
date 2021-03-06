package top.blogcode.user.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.blogcode.user.service.entity.User;
import top.blogcode.user.service.mapper.UserMapper;
import top.blogcode.user.service.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getList() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public boolean add(User user) {
        if (userMapper.insert(user) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 登录判断
     * @param user
     * @return
     */
    @Override
    public boolean login(User user) {
        try {
            User baseUser = userMapper.selectByAccount(user.getUser_account());
            if (baseUser.getUser_account().equals(user.getUser_account())) {
                if (baseUser.getUser_pass().equals(user.getUser_pass())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
