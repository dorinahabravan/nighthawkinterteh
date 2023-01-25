package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import com.iucosoft.nighthawk_interteh_web_cms.dto.SubcontractorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class SubcontractorFormValidator implements Validator {

    @Autowired
    @Qualifier("i18NNameValidator")
    I18NNameValidator i18NNameValidator;

   

    @Override
    public boolean supports(Class<?> clazz) {
        return SubcontractorDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        SubcontractorDTO subcontractorDTO = (SubcontractorDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subcontractorName", "NotEmpty.subcontractorForm.subcontractorName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subcontractorEmail", "NotEmpty.subcontractorForm.subcontractorEmail");

        if (!i18NNameValidator.valid(subcontractorDTO.getSubcontractorName())) {
            errors.rejectValue("subcontractorName", "Pattern.subcontractorForm.subcontractorName");
        }

        if (subcontractorDTO.getSubcontractorName() == null || subcontractorDTO.getSubcontractorName().length() < 3) {
            errors.rejectValue("subcontractorName", "Pattern.subcontractorForm.subcontractorName.length");
        }
        if (subcontractorDTO.getSubcontractorEmail()== null || subcontractorDTO.getSubcontractorEmail().isEmpty()) {
            errors.rejectValue("subcontractorEmail", "Pattern.subcontractorForm.subcontractorEmail.isEmpty");
        }

    }

}
