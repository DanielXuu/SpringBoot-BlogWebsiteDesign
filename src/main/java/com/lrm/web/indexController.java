package com.lrm.web;

import com.lrm.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("The Blog Doesn't Exist");
//        }
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {

        return "blog";
    }

}
