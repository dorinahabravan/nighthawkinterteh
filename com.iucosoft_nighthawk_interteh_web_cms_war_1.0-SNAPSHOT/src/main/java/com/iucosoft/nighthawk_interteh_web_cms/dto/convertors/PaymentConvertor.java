package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Payment;
import com.iucosoft.nighthawk_interteh_web_cms.dto.PaymentDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class PaymentConvertor {

    public Payment convert(PaymentDTO paymentDTO) {

        Payment payment = new Payment();

        payment.setIdPayment(paymentDTO.getIdPayment());
        payment.setContract(paymentDTO.getContract());
        payment.setPaymentDate(paymentDTO.getPaymentDate());
        payment.setPaymentBill(paymentDTO.getPaymentBill());
        payment.setPaymentType(paymentDTO.getPaymentType());
        payment.setPaymentDescription(paymentDTO.getPaymentDescription());
       
        return payment;
    }

    public PaymentDTO convert(Payment payment) {
        PaymentDTO paymentDTO = new PaymentDTO();

        paymentDTO.setIdPayment(payment.getIdPayment());
        paymentDTO.setContract(payment.getContract());
        paymentDTO.setPaymentDate(payment.getPaymentDate());
        paymentDTO.setPaymentBill(payment.getPaymentBill());
        paymentDTO.setPaymentType(payment.getPaymentType());
        paymentDTO.setPaymentDescription(payment.getPaymentDescription());
        
        return paymentDTO;
    }

    public List<PaymentDTO> convert(List<Payment> paymentList) {
        List<PaymentDTO> paymentDTOList = new ArrayList<PaymentDTO>();
        for (Payment payment : paymentList) {
            PaymentDTO paymentDTO = convert(payment);
            paymentDTOList.add(paymentDTO);

        }

        return paymentDTOList;
    }

}
