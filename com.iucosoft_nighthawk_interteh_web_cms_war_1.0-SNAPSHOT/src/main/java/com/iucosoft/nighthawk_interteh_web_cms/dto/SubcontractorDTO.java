package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Dorina
 */

public class SubcontractorDTO implements Serializable {

    private Integer idSubcontractor;
    private NWUser user;
    private String subcontractorName;
    private String subcontractorEmail;
    private Date subcontractorDateOfBirth;
    private String subcontractorAddress;

    public SubcontractorDTO() {
    }

    public Integer getIdSubcontractor() {
        return idSubcontractor;
    }

    public void setIdSubcontractor(Integer idSubcontractor) {
        this.idSubcontractor = idSubcontractor;
    }

    public NWUser getUser() {
        return user;
    }

    public void setUser(NWUser user) {
        this.user = user;
    }

    public String getSubcontractorName() {
        return subcontractorName;
    }

    public void setSubcontractorName(String subcontractorName) {
        this.subcontractorName = subcontractorName;
    }

    public String getSubcontractorEmail() {
        return subcontractorEmail;
    }

    public void setSubcontractorEmail(String subcontractorEmail) {
        this.subcontractorEmail = subcontractorEmail;
    }

    public Date getSubcontractorDateOfBirth() {
        return subcontractorDateOfBirth;
    }

    public void setSubcontractorDateOfBirth(Date subcontractorDateOfBirth) {
        this.subcontractorDateOfBirth = subcontractorDateOfBirth;
    }

    public String getSubcontractorAddress() {
        return subcontractorAddress;
    }

    public void setSubcontractorAddress(String subcontractorAddress) {
        this.subcontractorAddress = subcontractorAddress;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idSubcontractor);
        hash = 37 * hash + Objects.hashCode(this.subcontractorName);
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
        final SubcontractorDTO other = (SubcontractorDTO) obj;
        if (!Objects.equals(this.subcontractorName, other.subcontractorName)) {
            return false;
        }
        if (!Objects.equals(this.idSubcontractor, other.idSubcontractor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubcontractorDTO{" + "idSubcontractor=" + idSubcontractor + ", user=" + user + ", subcontractorName=" + subcontractorName + ", subcontractorEmail=" + subcontractorEmail + ", subcontractorDateOfBirth=" + subcontractorDateOfBirth + ", subcontractorAddress=" + subcontractorAddress + '}';
    }

}
