package top.blogcode.user.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import top.blogcode.user.service.entity.User;
import top.blogcode.user.service.mapper.UserMapper;
import top.blogcode.user.service.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getList() {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public boolean add(User user) {
        if(userMapper.insert(user)>0){
            return true;
        }
        return false;
    }
}
