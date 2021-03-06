package com.szy.controller;

import com.szy.model.UserLoginReq;
import com.szy.model.UserUpdatePasswordReq;
import com.szy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shizhouyong on 2017/1/4.
 */
@RestController
@RequestMapping("/jg")
public class UserController {


    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/user/login", method = {RequestMethod.POST})
    public Object login(@RequestBody UserLoginReq req) {
        return userService.login(req);
    }

    @RequestMapping(value = "/user/logout/{number}", method = {RequestMethod.POST})
    public Object logout(@PathVariable long number) {
        return userService.logout(number);
    }

    @RequestMapping(value = "/v/user/password/update", method = {RequestMethod.POST})
    public Object updatePasswd(@RequestBody UserUpdatePasswordReq req) {
        return userService.updatePassward(req);
    }

}
