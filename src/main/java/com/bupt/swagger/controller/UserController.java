package com.bupt.swagger.controller;

import com.bupt.swagger.VO.GenericResult;
import com.bupt.swagger.VO.ResultEnum;
import com.bupt.swagger.VO.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "用户管理", description = "用户管理", value = "用户管理")
@RestController
public class UserController {

    @ApiOperation("创建用户")
    @PostMapping("/users")
    public User create(@RequestBody @Valid User user) {
        return user;
    }

    @ApiOperation(value = "用户详情")
    @GetMapping("/users/{id}")
    public GenericResult<User> findById(@PathVariable Long id) {
        //测试返回异常
        if (id.equals(0l)){
            return ResultEnum.RET_JSON_NOEXISTS;
        }
        User user =new User("bbb", 21, "上海", "aaa@bbb.com");
        return ResultEnum.success(user);
    }

    @ApiOperation(value = "用户详情")
    @GetMapping("/users/name/{name}")
    public GenericResult<String> findUserName(@PathVariable String name) {
        return ResultEnum.success(name);
    }


    @ApiOperation("用户列表")
    @GetMapping("/users")
    public GenericResult<List<User>> list(@ApiParam("查看第几页")  @RequestParam(required = false) int pageIndex,
                           @ApiParam("每页多少条") @RequestParam int pageSize) {
        List<User> result = new ArrayList<>();
        result.add(new User("aaa", 50, "北京", "aaa@ccc.com"));
        result.add(new User("bbb", 21, "广州", "aaa@ddd.com"));
        //返回列表
        return ResultEnum.success(result);
    }

    @ApiIgnore
    @DeleteMapping("/users/{id}")
    public String deleteById(@PathVariable Long id) {
        return "delete user : " + id;
    }

}