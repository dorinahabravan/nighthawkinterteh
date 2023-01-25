package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import com.iucosoft.nighthawk_interteh_web_cms.dto.EmployercompanyDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.SubcontractorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class EmployercompanyFormValidator implements Validator {

    @Autowired
    @Qualifier("i18NNameValidator")
    I18NNameValidator i18NNameValidator;

   

    @Override
    public boolean supports(Class<?> clazz) {
        return EmployercompanyDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        EmployercompanyDTO employercompanyDTO = (EmployercompanyDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "clientCompanyName", "NotEmpty.employercompanyForm.clientCompanyName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "clientCompanyAddress", "NotEmpty.employercompanyForm.clientCompanyAddress");

        if (!i18NNameValidator.valid(employercompanyDTO.getClientCompanyName())) {
            errors.rejectValue("clientCompanyName", "Pattern.employercompanyForm.clientCompanyName");
        }

        if (employercompanyDTO.getClientCompanyName()== null || employercompanyDTO.getClientCompanyName().length() < 3) {
            errors.rejectValue("clientCompanyName", "Pattern.employercompanyForm.clientCompanyName.length");
        }
        if (employercompanyDTO.getClientCompanyAddress()== null || employercompanyDTO.getClientCompanyAddress().isEmpty()) {
            errors.rejectValue("clientCompanyAddress", "Pattern.employercompanyForm.clientCompanyAddress.isEmpty");
        }

    }

}
