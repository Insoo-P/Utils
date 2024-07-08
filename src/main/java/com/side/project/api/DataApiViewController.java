package com.side.project.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class DataApiViewController {

    @GetMapping("dataApi")
    public String viewDataApi(){
        return "apiExample";
    }
}
