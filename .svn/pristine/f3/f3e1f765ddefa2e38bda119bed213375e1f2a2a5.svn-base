package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component("usernameValidator")
public class UsernameValidator {

    @Autowired
    NWUserServiceIntf nwuserService;

    private Pattern pattern;
    private Matcher matcher;
    
    
    

    /**
     * Expression that matches all valid usernames 
     */
    public static final String USERNAME_PATTERN = "/^[a-zA-Z0-9_-]{4,16}$/";

    public UsernameValidator() {
        pattern = Pattern.compile(USERNAME_PATTERN);

    }

    public boolean valid(final String username) {
        matcher = pattern.matcher(username);
        return matcher.matches();
    }

}
