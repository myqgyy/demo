package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by uyiqgyy on 21/08/2017.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/hi")
    public @ResponseBody
    String hiThere() {
        return "Hello, World!";
    }
}
