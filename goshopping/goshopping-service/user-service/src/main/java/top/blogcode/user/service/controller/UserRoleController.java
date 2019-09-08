package top.blogcode.user.service.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.blogcode.common.core.Result;
import top.blogcode.user.service.service.IUserRoleService;
import top.blogcode.user.service.service.IUserService;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 9999
 * @since 2019-09-08
 */
@RestController
@RequestMapping("/user-role")
@Slf4j
public class UserRoleController extends BaseController{
    @Autowired
    private IUserRoleService iUserRoleService;

    @GetMapping
    public Result getRoleList(@RequestBody ){

    }
}
