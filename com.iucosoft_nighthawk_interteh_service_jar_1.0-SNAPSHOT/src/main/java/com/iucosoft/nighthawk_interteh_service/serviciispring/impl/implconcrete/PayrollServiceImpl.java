
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PayrollDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Payroll;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PayrollServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("payrollService")
public class PayrollServiceImpl 
        extends GenericServiceAbstractImpl<Payroll, Integer> 
                 implements PayrollServiceIntf{
    
    
    
    @Autowired
    PayrollDaoIntf payrollDao;

    @Autowired
    public PayrollServiceImpl(@Qualifier("payrollDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.payrollDao = (PayrollDaoIntf) genericDao;
    }
    
   
}
