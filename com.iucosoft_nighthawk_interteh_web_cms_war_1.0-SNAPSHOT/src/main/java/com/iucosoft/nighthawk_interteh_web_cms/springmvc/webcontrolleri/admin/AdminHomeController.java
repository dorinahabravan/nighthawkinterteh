package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@PreAuthorize("hasRole('ADMIN')")
//@Secured("ADMIN")
@RequestMapping(value = "/admin")
//    @ResponseBody  
//    @PreAuthorize("hasRole('ROLE_ADMIN')")  

public class AdminHomeController {

    /**
     *
     * @return
     */
 
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView("admin.home.def");

        return mv;
    }

}
