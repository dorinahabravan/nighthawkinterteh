
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dorina
 */
public class NWUserDTO implements Serializable {

    private Integer idUser;
    private NWRole role;
    private String username;
    private String password;
    private boolean active;

    public NWUserDTO() {
    }

    public NWUserDTO(Integer idUser, NWRole role, String username, String password, boolean active) {
        this.idUser = idUser;
        this.role = role;
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public NWRole getRole() {
        return role;
    }

    public void setRole(NWRole role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.idUser);
        hash = 31 * hash + Objects.hashCode(this.role);
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
        final NWUserDTO other = (NWUserDTO) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.idUser, other.idUser)) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "NWUserDTO{" + "idUser=" + idUser + ", role=" + role + ", username=" + username + ", password=" + password + ", active=" + active + '}';
    }
    
    
    

}
