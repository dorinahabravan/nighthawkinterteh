package com.iucosoft.nighthawk_interteh_web_cms.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dorina
 */
public class NWRoleDTO implements Serializable {

    private Integer userRoleId;
    private String userRoleName;
    private boolean enabled;

    public NWRoleDTO() {
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.userRoleId);
        hash = 97 * hash + Objects.hashCode(this.userRoleName);
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
        final NWRoleDTO other = (NWRoleDTO) obj;
        if (!Objects.equals(this.userRoleName, other.userRoleName)) {
            return false;
        }
        if (!Objects.equals(this.userRoleId, other.userRoleId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NWRoleDTO{" + "userRoleId=" + userRoleId + ", userRoleName=" + userRoleName + ", enabled=" + enabled + '}';
    }

}
