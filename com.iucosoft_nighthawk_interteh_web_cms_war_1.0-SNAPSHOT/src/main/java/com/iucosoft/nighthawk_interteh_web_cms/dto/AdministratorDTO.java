package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dorina
 */
public class AdministratorDTO implements Serializable {

    private Integer idAdministrator;
    private NWUser user;
    private String administratorName;
    private String administratorEmail;

    public AdministratorDTO() {
    }

    public Integer getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(Integer idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    public NWUser getUser() {
        return user;
    }

    public void setUser(NWUser user) {
        this.user = user;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getAdministratorEmail() {
        return administratorEmail;
    }

    public void setAdministratorEmail(String administratorEmail) {
        this.administratorEmail = administratorEmail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idAdministrator);
        hash = 29 * hash + Objects.hashCode(this.administratorName);
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
        final AdministratorDTO other = (AdministratorDTO) obj;
        if (!Objects.equals(this.administratorName, other.administratorName)) {
            return false;
        }
        if (!Objects.equals(this.idAdministrator, other.idAdministrator)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdministratorDTO{" + "idAdministrator=" + idAdministrator + ", user=" + user + ", administratorName=" + administratorName + ", administratorEmail=" + administratorEmail + '}';
    }

}
