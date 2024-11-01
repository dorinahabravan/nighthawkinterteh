package com.iucosoft.nighthawk_interteh_service.entities;
// Generated 22-Jan-2022 16:56:06 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment",
         catalog = "nighthawk_interteh"
)
public class Payment implements java.io.Serializable {

    private Integer idPayment;
    private Contract contract;
    private Date paymentDate;
    private String paymentBill;
    private String paymentType;
    private String paymentDescription;

    public Payment() {
    }

    public Payment(Contract contract) {
        this.contract = contract;
    }

    public Payment(Contract contract, Date paymentDate, String paymentBill, String paymentType, String paymentDescription) {
        this.contract = contract;
        this.paymentDate = paymentDate;
        this.paymentBill = paymentBill;
        this.paymentType = paymentType;
        this.paymentDescription = paymentDescription;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_Payment", unique = true, nullable = false)
    public Integer getIdPayment() {
        return this.idPayment;
    }

    public void setIdPayment(Integer idPayment) {
        this.idPayment = idPayment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Contract", nullable = false)
    public Contract getContract() {
        return this.contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Payment_Date", length = 19)
    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Column(name = "Payment_Bill", length = 45)
    public String getPaymentBill() {
        return this.paymentBill;
    }

    public void setPaymentBill(String paymentBill) {
        this.paymentBill = paymentBill;
    }

    @Column(name = "Payment_Type", length = 45)
    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Column(name = "Payment_Description", length = 45)
    public String getPaymentDescription() {
        return this.paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idPayment);
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
        final Payment other = (Payment) obj;
        if (!Objects.equals(this.idPayment, other.idPayment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Payment{" + "idPayment=" + idPayment + ", contract=" + contract + ", paymentDate=" + paymentDate + ", paymentBill=" + paymentBill + ", paymentType=" + paymentType + ", paymentDescription=" + paymentDescription + '}';
    }

  

}
