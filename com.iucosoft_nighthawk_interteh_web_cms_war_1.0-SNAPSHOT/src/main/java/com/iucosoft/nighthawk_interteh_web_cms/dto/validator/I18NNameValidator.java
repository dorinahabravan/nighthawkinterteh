package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component("i18NNameValidator")
public class I18NNameValidator {

    private Pattern pattern;
    private Matcher matcher;

    public static final String NAME_PATTERN = "[a-zA-ZșțîăâȘȚÎĂÂàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð -]+"; //// Validation of international names with Unicode support

    public I18NNameValidator() {
        pattern = Pattern.compile(NAME_PATTERN);

    }

//     Pattern p = Pattern.compile("a*b");
// Matcher m = p.matcher("aaaaab");
// boolean b = m.matches();
    public boolean valid(final String name) {

        matcher = pattern.matcher(name);
        return matcher.matches();

    }

    public static void main(String[] args) {
        I18NNameValidator aI18NNameValidator = new I18NNameValidator();
        System.out.println(aI18NNameValidator.valid("Jora"));

    }
}
