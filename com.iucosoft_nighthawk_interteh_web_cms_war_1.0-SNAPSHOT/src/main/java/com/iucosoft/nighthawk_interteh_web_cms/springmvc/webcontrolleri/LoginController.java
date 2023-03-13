package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.NWUserConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.PasswordValidator;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.UsernameValidator;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dorina
 */
@Controller
public class LoginController {

    @Autowired
    NWUserServiceIntf nwuserService;

    @Autowired
    NWUserConvertor nwUserConvertor;

    @Autowired
    PasswordValidator passwordValidator;

    @Autowired
    @Qualifier("usernameValidator")
    UsernameValidator usernameValidator;

 
    
    @RequestMapping(value = "/showlogin", method = RequestMethod.GET)
    ModelAndView showLogin() {

        ModelAndView mv = new ModelAndView("showlogin.def");
        mv.addObject("msg", "Please Enter Your Login Details");

        return mv;
    }
//    Login si logout
//    Metoda login in depdendenta de reusita authentificarii si a rolului ne redirectioneaza: admin(pagina principala din cms pentru admin), user, inapoi in login cu error

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String login(@ModelAttribute("user") @Validated NWUser user, BindingResult result, Map model) {

        try {
            
            /*
            Am verificat daca username si parola exista
            */
            if (user.getUsername() != null || user.getPassword() != null) {
                System.out.println("The user is valid");
            } else {
                System.out.println("The user doesn't exist");
            }

            
             /*
            Redirectionarea userului pe paginile corespunzatoare
            */
            switch (user.getUsername()) {

                case ("admin"):
                    return "admin.home.def";

                case ("subcontractor"):
                    return "usersubcontractor.home.def";

                case ("payroll"):
                    return "userpayroll.home.def";

        }

              /*
            Redirectionarea userului pe paginile corespunzatoare daca este valid iar daca nu merge inapoi la pagina showlogin.def
            */
            int count = 0;
            while (result.equals(count)) {
                count++;
            }
            if (count > 0) {
                System.out.println("welcome " + user);
            } else {
                return "showlogin.def";
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        model.put("user", user.getRole());

        return "user";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    ModelAndView logout() {

        ModelAndView mv = new ModelAndView("showlogin.def");

        return mv;
    }
}



