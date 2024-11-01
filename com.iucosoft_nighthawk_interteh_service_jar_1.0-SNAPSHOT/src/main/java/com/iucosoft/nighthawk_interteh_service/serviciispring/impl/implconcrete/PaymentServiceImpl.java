
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PaymentDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Payment;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PaymentServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("paymentService")
public class PaymentServiceImpl 
        extends GenericServiceAbstractImpl<Payment, Integer> 
                 implements PaymentServiceIntf{
    
    
    
    @Autowired
    PaymentDaoIntf paymentDao;

    @Autowired
    public PaymentServiceImpl(@Qualifier("paymentDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.paymentDao = (PaymentDaoIntf) genericDao;
    }
    
   
}
