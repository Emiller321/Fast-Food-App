package com.enterprise.fastfoodapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FastFoodController {
    @RequestMapping("/")
    public String index() {
        return "start";
    }
}
