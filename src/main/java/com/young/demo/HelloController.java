package com.young.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Young
 * @Description:
 * @Date: Created at 1/9 0009 15:27
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlModule girlModule;

//    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId){
        return "id: " + myId;
    }



}
