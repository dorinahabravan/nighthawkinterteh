package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import com.iucosoft.nighthawk_interteh_web_cms.dto.NWUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class NWUserFormValidator implements Validator {

    @Autowired
    @Qualifier("i18NNameValidator")
    I18NNameValidator i18NNameValidator;

   

    @Override
    public boolean supports(Class<?> clazz) {
        return NWUserDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        NWUserDTO nwUserDTO = (NWUserDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty.nwUserForm.username");

        if (!i18NNameValidator.valid(nwUserDTO.getUsername())) {
            errors.rejectValue("username", "Pattern.nwUserForm.nwUserForm");
        }

        if (nwUserDTO.getUsername() == null || nwUserDTO.getUsername().length() < 4) {
            errors.rejectValue("nwUserForm", "Pattern.nwUserForm.username.length");
        }

    }

}
