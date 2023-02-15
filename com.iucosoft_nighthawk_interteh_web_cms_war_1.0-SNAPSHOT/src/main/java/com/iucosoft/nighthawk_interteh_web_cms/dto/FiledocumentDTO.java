
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.Account;
import com.iucosoft.nighthawk_interteh_service.entities.Filecontent;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Dorina
 */
public class FiledocumentDTO  implements Serializable{
    
    private Integer documentId;
     private Account account;
     private String fileName;
     private String fileExtenstion;
     private String documentContent;
//     private Date lastTimeModified;
     private Set<Filecontent> filecontents = new HashSet<Filecontent>(0);
     
     
     

     

    public FiledocumentDTO() {
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtenstion() {
        return fileExtenstion;
    }

    public void setFileExtenstion(String fileExtenstion) {
        this.fileExtenstion = fileExtenstion;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

//    public Date getLastTimeModified() {
//        return lastTimeModified;
//    }
//
//    public void setLastTimeModified(Date lastTimeModified) {
//        this.lastTimeModified = lastTimeModified;
//    }

    public Set<Filecontent> getFilecontents() {
        return filecontents;
    }

    public void setFilecontents(Set<Filecontent> filecontents) {
        this.filecontents = filecontents;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.documentId);
        hash = 29 * hash + Objects.hashCode(this.fileName);
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
        final FiledocumentDTO other = (FiledocumentDTO) obj;
        if (!Objects.equals(this.fileName, other.fileName)) {
            return false;
        }
        if (!Objects.equals(this.documentId, other.documentId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FiledocumentDTO{" + "documentId=" + documentId + ", account=" + account + ", fileName=" + fileName + ", fileExtenstion=" + fileExtenstion + ", documentContent=" + documentContent + ", filecontents=" + filecontents + '}';
    }

 

   
     
     
   
    
    
}
