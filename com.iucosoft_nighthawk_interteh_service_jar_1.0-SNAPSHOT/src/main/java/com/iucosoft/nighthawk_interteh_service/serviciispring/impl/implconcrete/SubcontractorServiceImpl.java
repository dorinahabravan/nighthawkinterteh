
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.SubcontractorDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.SubcontractorServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
//@Setter
//@Slf4j
@Service("subcontractorService")
public class SubcontractorServiceImpl 
        extends GenericServiceAbstractImpl<Subcontractor, Integer> 
                 implements SubcontractorServiceIntf{
    
    
    
    @Autowired
    SubcontractorDaoIntf subcontractorDao;

    @Autowired
    public SubcontractorServiceImpl(@Qualifier("subcontractorDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.subcontractorDao = (SubcontractorDaoIntf) genericDao;
    }
    
   
}
