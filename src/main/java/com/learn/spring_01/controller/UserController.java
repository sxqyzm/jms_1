package com.learn.spring_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangmeng on 2016/1/8.
 */
@Controller
public class UserController {
    @RequestMapping("test/login.do")  // ����url��ַӳ��
    public ModelAndView testLogin() {
       System.out.println("SpringMvc���ʳɹ�");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }


}
