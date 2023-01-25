/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.Account;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dorina
 */
public class PortofolioDTO  implements Serializable{
    
    private Integer documentId;
     private Account account;
     private String fileName;
     private String fiileExtension;
     private String documentContent;

    public PortofolioDTO() {
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

    public String getFiileExtension() {
        return fiileExtension;
    }

    public void setFiileExtension(String fiileExtension) {
        this.fiileExtension = fiileExtension;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.documentId);
        hash = 37 * hash + Objects.hashCode(this.fileName);
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
        final PortofolioDTO other = (PortofolioDTO) obj;
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
        return "PortofolioDTO{" + "documentId=" + documentId + ", account=" + account + ", fileName=" + fileName + ", fiileExtension=" + fiileExtension + ", documentContent=" + documentContent + '}';
    }

    
}
