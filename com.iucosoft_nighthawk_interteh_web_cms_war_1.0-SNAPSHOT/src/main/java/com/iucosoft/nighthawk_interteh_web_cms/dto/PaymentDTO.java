
package com.iucosoft.nighthawk_interteh_web_cms.dto;

import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Dorina
 */
public class PaymentDTO {
    
    
      private Integer idPayment;
     private Contract contract;
     private Date paymentDate;
     private String paymentBill;
     private String paymentType;
     private String paymentDescription;

    public PaymentDTO() {
    }

    public Integer getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Integer idPayment) {
        this.idPayment = idPayment;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentBill() {
        return paymentBill;
    }

    public void setPaymentBill(String paymentBill) {
        this.paymentBill = paymentBill;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idPayment);
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
        final PaymentDTO other = (PaymentDTO) obj;
        if (!Objects.equals(this.idPayment, other.idPayment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" + "idPayment=" + idPayment + ", contract=" + contract + ", paymentDate=" + paymentDate + ", paymentBill=" + paymentBill + ", paymentType=" + paymentType + ", paymentDescription=" + paymentDescription + '}';
    }

    
}
