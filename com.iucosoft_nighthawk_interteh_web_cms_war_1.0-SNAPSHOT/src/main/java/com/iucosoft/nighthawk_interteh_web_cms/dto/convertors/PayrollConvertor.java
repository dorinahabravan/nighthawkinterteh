package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_service.entities.Payroll;
import com.iucosoft.nighthawk_interteh_web_cms.dto.AdministratorDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.PayrollDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class PayrollConvertor {

    public Payroll convert(PayrollDTO payrollDTO) {

        Payroll payroll = new Payroll();

        payroll.setIdPayroll(payrollDTO.getIdPayroll());
        payroll.setUser(payrollDTO.getUser());
        payroll.setPayrollName(payrollDTO.getPayrollName());
        payroll.setPayrollEmail(payrollDTO.getPayrollEmail());
        payroll.setPayrollDateOfBirth(payrollDTO.getPayrollDateOfBirth());
        payroll.setPayrollAddress(payrollDTO.getPayrollAddress());
        return payroll;

    }

    public PayrollDTO convert(Payroll payroll) {
        PayrollDTO payrollDTO = new PayrollDTO();

        payrollDTO.setIdPayroll(payroll.getIdPayroll());
        payrollDTO.setUser(payroll.getUser());
        payrollDTO.setPayrollName(payroll.getPayrollName());
        payrollDTO.setPayrollEmail(payroll.getPayrollEmail());
        payrollDTO.setPayrollDateOfBirth(payroll.getPayrollDateOfBirth());
        payrollDTO.setPayrollAddress(payroll.getPayrollAddress());

        return payrollDTO;

    }

    public List<PayrollDTO> convert(List<Payroll> payrollList) {
        List<PayrollDTO> payrollDTOList = new ArrayList<PayrollDTO>();

        for (Payroll payroll : payrollList) {
            PayrollDTO payrollDTO = convert(payroll);
            payrollDTOList.add(payrollDTO);

        }

        return payrollDTOList;

    }

}
