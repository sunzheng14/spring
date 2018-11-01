package com.sun.zq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.HEAD)
    public String test(){
        return "/WEB-INF/page/hello.jsp";
    }
}
