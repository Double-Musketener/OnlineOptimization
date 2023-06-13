package com.dmk.yx.acl.controller;

import com.dmk.yx.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "登入接口")
@RestController
@RequestMapping("/admin/acl/index")
@Slf4j
@CrossOrigin
public class IndexController {

    /**
     *
     * 用户登入
     * @return
     */
    @ApiOperation("用户登入")
    @PostMapping("login")
    public Result login() {
        Map<String,Object> map = new HashMap<>();
        map.put("token","admin-token");
        return Result.ok(map);
    }


    /**
     * 收取用户信息
     * @return
     */
    @ApiOperation("获取用户信息")
    @GetMapping("info")
    public Result info(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","atguigu");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }


    /**
     *
     *用户退出
     * @return
     */
    @ApiOperation("用户退出")
    @PostMapping("logout")
    public Result logout(){
        return Result.ok(null);
    }
}


