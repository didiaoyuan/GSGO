package top.blogcode.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.blogcode.common.core.Result;
import top.blogcode.user.service.entity.User;
import top.blogcode.user.service.service.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
    /**
     * 注入用户服务操作
     */
    @Autowired
    private UserService userService;

    /**
     * 获取全部用户结果列表端口
     * @return
     */
    @GetMapping
    public Result getList(){
        return Result.ok("成功获取所有列表",userService.getList());
    }

    /**
     * 添加用户信息,并返回结果
     * @param user
     * @return
     */
    @PostMapping
    public Result add(@RequestBody User user){
        if(userService.add(user)){
            return Result.ok("添加成功");
        }
        return Result.fail("添加失败");
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        if(userService.login(user)){
            return Result.ok("登录成功");
        }
        return Result.fail("登录失败");
    }
}
