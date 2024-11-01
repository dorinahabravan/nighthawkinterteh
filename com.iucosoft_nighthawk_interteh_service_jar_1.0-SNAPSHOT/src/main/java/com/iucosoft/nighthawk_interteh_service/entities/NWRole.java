package com.iucosoft.nighthawk_interteh_service.entities;
// Generated 22-Jan-2022 16:56:06 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * NWRole generated by hbm2java
 */
@Entity
@Table(name = "nwrole",
        catalog = "nighthawk_interteh"
)
public class NWRole implements java.io.Serializable {

    private Integer userRoleId;
    private String userRoleName;
    private boolean enabled;
    private Set<NWUser> users = new HashSet<NWUser>(0);

    public NWRole() {
    }

    public NWRole(Integer userRoleId, String userRoleName, boolean enabled, Set<NWUser> users) {
        this.userRoleId = userRoleId;
        this.userRoleName = userRoleName;
        this.enabled = enabled;
        this.users = users;
    }

//     @Id @GeneratedValue(strategy=IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "User_Role_ID", unique = true, nullable = false)
    public Integer getUserRoleId() {
        return this.userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Column(name = "User_Role_Name", length = 45)
    public String getUserRoleName() {
        return this.userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "role")
    public Set<NWUser> getUsers() {
        return this.users;
    }

    public void setUsers(Set<NWUser> users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.userRoleId);
        hash = 41 * hash + Objects.hashCode(this.userRoleName);
        hash = 41 * hash + (this.enabled ? 1 : 0);
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
        final NWRole other = (NWRole) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
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
        return "NWRole{" + "userRoleId=" + userRoleId + ", userRoleName=" + userRoleName + ", enabled=" + enabled + ", users=" + users + '}';
    }
@Column(name = "Enabled")
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void delete(Integer userRoleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
