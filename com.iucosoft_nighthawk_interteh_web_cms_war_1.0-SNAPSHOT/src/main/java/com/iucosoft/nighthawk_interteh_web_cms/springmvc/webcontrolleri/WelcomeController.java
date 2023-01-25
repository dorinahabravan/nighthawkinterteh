package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    ModelAndView welcome() {

        ModelAndView mv = new ModelAndView("showlogin.def");

        return mv;
    
    }
        
        
        
   

}
