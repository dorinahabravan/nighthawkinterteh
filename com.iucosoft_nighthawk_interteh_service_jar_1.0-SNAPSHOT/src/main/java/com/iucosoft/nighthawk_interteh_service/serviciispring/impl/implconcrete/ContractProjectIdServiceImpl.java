
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractProjectIdDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.ContractProjectId;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.ContractProjectIdServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("contractProjectIdService")
public class ContractProjectIdServiceImpl 
        extends GenericServiceAbstractImpl<ContractProjectId, Integer> 
                 implements ContractProjectIdServiceIntf{
    
    
    
    @Autowired
    ContractProjectIdDaoIntf contractProjectIdDao;

    @Autowired
    public ContractProjectIdServiceImpl(@Qualifier("contractProjectIdDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.contractProjectIdDao = (ContractProjectIdDaoIntf) genericDao;
    }
    
   
    
}
