package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
 @RequestMapping(value = "/admin")
public class AdminHomeController {
     
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    ModelAndView home() {

        ModelAndView mv = new ModelAndView("admin.home.def");

        return mv;
    }

    
 
    

}