
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.ContractServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("contractService")
public class ContractServiceImpl 
        extends GenericServiceAbstractImpl<Contract, Integer> 
                 implements ContractServiceIntf{
    
    
    
    @Autowired
    ContractDaoIntf contractDao;

    @Autowired
    public ContractServiceImpl(@Qualifier("contractDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.contractDao = (ContractDaoIntf) genericDao;
    }
    
   
    
}
