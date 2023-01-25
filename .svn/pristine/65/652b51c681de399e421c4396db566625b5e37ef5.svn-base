
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Dorina
 */
public class PayrollDTO implements Serializable {

    private Integer idPayroll;
    private NWUser user;
    private String payrollName;
    private String payrollEmail;
    private Date payrollDateOfBirth;
    private String payrollAddress;

    public PayrollDTO() {
    }

    public Integer getIdPayroll() {
        return idPayroll;
    }

    public void setIdPayroll(Integer idPayroll) {
        this.idPayroll = idPayroll;
    }

    public NWUser getUser() {
        return user;
    }

    public void setUser(NWUser user) {
        this.user = user;
    }

    public String getPayrollName() {
        return payrollName;
    }

    public void setPayrollName(String payrollName) {
        this.payrollName = payrollName;
    }

    public String getPayrollEmail() {
        return payrollEmail;
    }

    public void setPayrollEmail(String payrollEmail) {
        this.payrollEmail = payrollEmail;
    }

    public Date getPayrollDateOfBirth() {
        return payrollDateOfBirth;
    }

    public void setPayrollDateOfBirth(Date payrollDateOfBirth) {
        this.payrollDateOfBirth = payrollDateOfBirth;
    }

    public String getPayrollAddress() {
        return payrollAddress;
    }

    public void setPayrollAddress(String payrollAddress) {
        this.payrollAddress = payrollAddress;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idPayroll);
        hash = 97 * hash + Objects.hashCode(this.payrollName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PayrollDTO other = (PayrollDTO) obj;
        if (!Objects.equals(this.idPayroll, other.idPayroll)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PayrollDTO{" + "idPayroll=" + idPayroll + ", user=" + user + ", payrollName=" + payrollName + ", payrollEmail=" + payrollEmail + ", payrollDateOfBirth=" + payrollDateOfBirth + ", payrollAddress=" + payrollAddress + '}';
    }

}
