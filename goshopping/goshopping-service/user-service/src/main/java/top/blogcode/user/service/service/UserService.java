package top.blogcode.user.service.service;

import org.springframework.stereotype.Service;
import top.blogcode.user.service.entity.User;

import java.util.List;


public interface UserService {
    List<User> getList();
    boolean add(User user);
}
