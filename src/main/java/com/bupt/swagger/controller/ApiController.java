package com.bupt.swagger.controller;

import com.bupt.swagger.VO.ApiInfo;
import com.bupt.swagger.VO.GenericResult;
import com.bupt.swagger.VO.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "api管理", description = "api管理", value = "api管理")
@RestController
public class ApiController {

    @ApiOperation(value = "api详情")
    @GetMapping("/api/{id}")
    public GenericResult<ApiInfo> findById(@PathVariable Long id) {
        //测试返回异常
        if (id.equals(0l)){
            return ResultEnum.RET_JSON_NOEXISTS;
        }
        ApiInfo user =new ApiInfo("bbb", "上海", "aaa@bbb.com");
        return ResultEnum.success(user);
    }
}
