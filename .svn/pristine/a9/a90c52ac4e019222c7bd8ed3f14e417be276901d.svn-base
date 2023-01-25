package com.iucosoft.nighthawk_interteh_web_cms.dto.validator;

import com.iucosoft.nighthawk_interteh_web_cms.dto.ContractDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.EmployercompanyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class ContractsFormValidator implements Validator {

    @Autowired
    @Qualifier("i18NNameValidator")
    I18NNameValidator i18NNameValidator;

    @Override
    public boolean supports(Class<?> clazz) {
        return ContractDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ContractDTO contractDTO = (ContractDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contractName", "NotEmpty.contractsForm.contractName");

        if (!i18NNameValidator.valid(contractDTO.getContractName())) {
            errors.rejectValue("contractName", "Pattern.contractsForm.contractName");
        }

        if (contractDTO.getContractName() == null || contractDTO.getContractName().length() < 3) {
            errors.rejectValue("contractName", "Pattern.contractsForm.contractName.length");
        }

    }

}
