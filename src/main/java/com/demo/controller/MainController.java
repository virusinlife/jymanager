package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
 
@Controller
public class MainController {
 
	
	
	@RequestMapping(value="main.do")
    public ModelAndView main(User user){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("main");
        return mav;
    }
    
    
    @RequestMapping(value="ys_whf_frames.do")
    public ModelAndView ys_whf_frames(User user){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("ys_whf_frames");
        return mav;
    }   

    
    
}