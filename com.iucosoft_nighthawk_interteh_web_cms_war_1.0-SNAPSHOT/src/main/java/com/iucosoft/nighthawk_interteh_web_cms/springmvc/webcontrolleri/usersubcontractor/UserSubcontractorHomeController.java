package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.usersubcontractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
 @RequestMapping(value = "/usersubcontractor")
public class UserSubcontractorHomeController {
     
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    ModelAndView home() {

        ModelAndView mv = new ModelAndView("usersubcontractor.home.def");

        return mv;
    }

    
 
    

}
