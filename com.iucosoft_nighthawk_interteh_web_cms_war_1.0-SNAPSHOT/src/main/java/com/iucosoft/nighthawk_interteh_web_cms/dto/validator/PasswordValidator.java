package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component("passwordValidator")
public class PasswordValidator {

   

    private Pattern pattern;
    private Matcher matcher;

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";//It contains at least 8 characters and at most 20 characters.
                                  //It contains at least one digit.
                                 //It contains at least one upper case alphabet.
                                 //It contains at least one lower case alphabet.
                                //It contains at least one special character which includes !@#$%&*()-+=^.
                               //It doesn’t contain any white space.

    public PasswordValidator() {
        pattern = Pattern.compile(PASSWORD_PATTERN);

    }

    public boolean valid(final String password) {
        matcher = pattern.matcher(password);
        return matcher.matches();

    }

}
