package com.sdu.software.goingmerry.controller;

import com.sdu.software.goingmerry.core.Result;
import com.sdu.software.goingmerry.core.ResultGenerator;
import com.sdu.software.goingmerry.model.User;
import com.sdu.software.goingmerry.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Liyp
 * @data 2020/04/10.
 */
@RestController
@RequestMapping("/user")
@Api(value = "User控制类", description = "控制类接口测试")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result
<PageInfo<User>> list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @PostMapping
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "待添加的user实例",paramType = "body",dataType = "User",required = true)
    })
    public Result add(@RequestBody User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer"),
    })
    public Result delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "更新的user实例",paramType = "body",dataType = "User",required = true)
    })
    public Result update(@RequestBody User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
    })
    public Result detail(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }


}
