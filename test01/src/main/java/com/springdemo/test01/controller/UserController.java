package com.springdemo.test01.controller;

import com.springdemo.test01.Base.Result;
import com.springdemo.test01.Base.ResultBase;
import com.springdemo.test01.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springdemo.test01.service.UserService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value ="/api/user/test", produces = "application/json")
    public ResponseEntity<Result> test(){
        Result result = new Result();
        result.setStatus("ok");
        return ResponseEntity.ok(result);
    }

    @RequestMapping("/user/add")
    public Object addUser(@RequestBody User request){
        try {
            User user = new User();
            user.setId(request.getId());
            user.setName(request.getName());
            user.setEmail(request.getEmail());

            userService.addUser(user);
        } catch (Exception ex) {
            return ex.getMessage();
        }

        return "OK";
    }

    @RequestMapping("/api/user/find")
    public ResponseEntity<ResultBase<User>> getUserName(@RequestBody User user) {
        ResultBase result = new ResultBase();
        try {
            User tmp = userService.getName(user.getId());
            result.setResultObj(tmp);
        } catch (Exception ex) {
            result.setMessage(ex.getMessage());
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.ok(result);
    }
}
