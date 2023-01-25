package com.iucosoft.nighthawk_interteh_service.entities;
// Generated 22-Jan-2022 16:56:06 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name="project"
    ,catalog="nighthawk_interteh"
)
public class Project  implements java.io.Serializable {


     private Integer idProject;
     private Account account;
     private String projectStatus;
     private String projectName;
     private String projectType;
     private String projectDescription;
     private Date projectStartDate;
     private Integer projectCompanyId;
     private String listOfContracts;
     private Set<ContractProject> contractProjects = new HashSet<ContractProject>(0);

    public Project() {
    }

	
    public Project(Account account) {
        this.account = account;
    }
    public Project(Account account, String projectStatus, String projectName, String projectType, String projectDescription, Date projectStartDate, Integer projectCompanyId, String listOfContracts, Set<ContractProject> contractProjects) {
       this.account = account;
       this.projectStatus = projectStatus;
       this.projectName = projectName;
       this.projectType = projectType;
       this.projectDescription = projectDescription;
       this.projectStartDate = projectStartDate;
       this.projectCompanyId = projectCompanyId;
       this.listOfContracts = listOfContracts;
       this.contractProjects = contractProjects;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="account"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="ID_Project", unique=true, nullable=false)
    public Integer getIdProject() {
        return this.idProject;
    }
    
    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

@ManyToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }

    
    @Column(name="Project_Status", length=45)
    public String getProjectStatus() {
        return this.projectStatus;
    }
    
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    
    @Column(name="Project_Name", length=45)
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    
    @Column(name="Project_Type", length=45)
    public String getProjectType() {
        return this.projectType;
    }
    
    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    
    @Column(name="Project_Description", length=45)
    public String getProjectDescription() {
        return this.projectDescription;
    }
    
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Project_Start_Date", length=10)
    public Date getProjectStartDate() {
        return this.projectStartDate;
    }
    
    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    
    @Column(name="Project_Company_ID")
    public Integer getProjectCompanyId() {
        return this.projectCompanyId;
    }
    
    public void setProjectCompanyId(Integer projectCompanyId) {
        this.projectCompanyId = projectCompanyId;
    }

    
    @Column(name="List_Of_Contracts", length=100)
    public String getListOfContracts() {
        return this.listOfContracts;
    }
    
    public void setListOfContracts(String listOfContracts) {
        this.listOfContracts = listOfContracts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="project")
    public Set<ContractProject> getContractProjects() {
        return this.contractProjects;
    }
    
    public void setContractProjects(Set<ContractProject> contractProjects) {
        this.contractProjects = contractProjects;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.idProject);
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
        final Project other = (Project) obj;
        if (!Objects.equals(this.idProject, other.idProject)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Project{" + "idProject=" + idProject + ", account=" + account + ", projectStatus=" + projectStatus + ", projectName=" + projectName + ", projectType=" + projectType + ", projectDescription=" + projectDescription + ", projectStartDate=" + projectStartDate + ", projectCompanyId=" + projectCompanyId + ", listOfContracts=" + listOfContracts + ", contractProjects=" + contractProjects + '}';
    }




}

