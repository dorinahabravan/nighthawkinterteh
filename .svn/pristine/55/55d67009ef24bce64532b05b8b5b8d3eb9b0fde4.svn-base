
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Dorina
 */
public class EmployercompanyDTO {
     private Integer idClientCompany;
     private String clientCompanyAddress;
     private String clientCompanyName;
     private String clientCompanyType;
     private String clientCompanyDescription;
     private Set<Contract> contracts = new HashSet<Contract>(0);

    public EmployercompanyDTO() {
    }

    public Integer getIdClientCompany() {
        return idClientCompany;
    }

    public void setIdClientCompany(Integer idClientCompany) {
        this.idClientCompany = idClientCompany;
    }

    public String getClientCompanyAddress() {
        return clientCompanyAddress;
    }

    public void setClientCompanyAddress(String clientCompanyAddress) {
        this.clientCompanyAddress = clientCompanyAddress;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getClientCompanyType() {
        return clientCompanyType;
    }

    public void setClientCompanyType(String clientCompanyType) {
        this.clientCompanyType = clientCompanyType;
    }

    public String getClientCompanyDescription() {
        return clientCompanyDescription;
    }

    public void setClientCompanyDescription(String clientCompanyDescription) {
        this.clientCompanyDescription = clientCompanyDescription;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.idClientCompany);
        hash = 73 * hash + Objects.hashCode(this.clientCompanyName);
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
        final EmployercompanyDTO other = (EmployercompanyDTO) obj;
        if (!Objects.equals(this.clientCompanyName, other.clientCompanyName)) {
            return false;
        }
        if (!Objects.equals(this.idClientCompany, other.idClientCompany)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmployercompanyDTO{" + "idClientCompany=" + idClientCompany + ", clientCompanyAddress=" + clientCompanyAddress + ", clientCompanyName=" + clientCompanyName + ", clientCompanyType=" + clientCompanyType + ", clientCompanyDescription=" + clientCompanyDescription + ", contracts=" + contracts + '}';
    }

    
     
     
}
