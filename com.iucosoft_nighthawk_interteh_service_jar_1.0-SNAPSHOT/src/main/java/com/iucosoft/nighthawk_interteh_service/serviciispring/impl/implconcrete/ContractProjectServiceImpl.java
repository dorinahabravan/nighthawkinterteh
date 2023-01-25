
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractProjectDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.ContractProject;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.ContractProjectServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("contractProjectService")
public class ContractProjectServiceImpl 
        extends GenericServiceAbstractImpl<ContractProject, Integer> 
                 implements ContractProjectServiceIntf{
    
    
    
    @Autowired
    ContractProjectDaoIntf contractProjectDao;

    @Autowired
    public ContractProjectServiceImpl(@Qualifier("contractProjectDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.contractProjectDao = (ContractProjectDaoIntf) genericDao;
    }
    
   
    
}
