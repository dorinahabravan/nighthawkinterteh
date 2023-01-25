
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.ContractProject;
import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_service.entities.Nighthawkinterteh;
import com.iucosoft.nighthawk_interteh_service.entities.Payment;
import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Dorina
 */
public class ContractDTO implements Serializable{
    
    private Integer idContract;
     private Employercompany employercompany;
     private Nighthawkinterteh nighthawkinterteh;
     private Subcontractor subcontractor;
     private String contractType;
     private String contractName;
     private String contractDescription;
     private Integer contractProjectId;
     private Set<ContractProject> contractProjects = new HashSet<ContractProject>(0);
     private Set<Payment> payments = new HashSet<Payment>(0);

    public ContractDTO() {
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public Employercompany getEmployercompany() {
        return employercompany;
    }

    public void setEmployercompany(Employercompany employercompany) {
        this.employercompany = employercompany;
    }

    public Nighthawkinterteh getNighthawkinterteh() {
        return nighthawkinterteh;
    }

    public void setNighthawkinterteh(Nighthawkinterteh nighthawkinterteh) {
        this.nighthawkinterteh = nighthawkinterteh;
    }

    public Subcontractor getSubcontractor() {
        return subcontractor;
    }

    public void setSubcontractor(Subcontractor subcontractor) {
        this.subcontractor = subcontractor;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractDescription() {
        return contractDescription;
    }

    public void setContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
    }

    public Integer getContractProjectId() {
        return contractProjectId;
    }

    public void setContractProjectId(Integer contractProjectId) {
        this.contractProjectId = contractProjectId;
    }

    public Set<ContractProject> getContractProjects() {
        return contractProjects;
    }

    public void setContractProjects(Set<ContractProject> contractProjects) {
        this.contractProjects = contractProjects;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idContract);
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
        final ContractDTO other = (ContractDTO) obj;
        if (!Objects.equals(this.contractName, other.contractName)) {
            return false;
        }
        if (!Objects.equals(this.idContract, other.idContract)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ContractDTO{" + "idContract=" + idContract + ", employercompany=" + employercompany + ", nighthawkinterteh=" + nighthawkinterteh + ", subcontractor=" + subcontractor + ", contractType=" + contractType + ", contractName=" + contractName + ", contractDescription=" + contractDescription + ", contractProjectId=" + contractProjectId + ", contractProjects=" + contractProjects + ", payments=" + payments + '}';
    }
    
}
