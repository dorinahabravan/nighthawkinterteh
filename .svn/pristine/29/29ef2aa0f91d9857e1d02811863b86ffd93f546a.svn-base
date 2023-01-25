package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import com.iucosoft.nighthawk_interteh_web_cms.dto.NWRoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class NWRoleFormValidator implements Validator {

    @Autowired
    @Qualifier("i18NNameValidator")
    I18NNameValidator i18NNameValidator;

   

    @Override
    public boolean supports(Class<?> clazz) {
        return NWRoleDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        NWRoleDTO nwRoleDTO = (NWRoleDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userRoleName", "NotEmpty.nwRoleForm.userRoleName");

        if (!i18NNameValidator.valid(nwRoleDTO.getUserRoleName())) {
            errors.rejectValue("userRoleName", "Pattern.nwRoleForm.userRoleName");
        }

        if (nwRoleDTO.getUserRoleName() == null || nwRoleDTO.getUserRoleName().length() < 4) {
            errors.rejectValue("userRoleName", "Pattern.nwRoleForm.userRoleName.length");
        }

    }

}
