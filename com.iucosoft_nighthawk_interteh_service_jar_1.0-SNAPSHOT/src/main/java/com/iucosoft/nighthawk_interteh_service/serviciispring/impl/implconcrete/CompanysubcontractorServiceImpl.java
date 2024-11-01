
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.CompanysubcontractorDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Companysubcontractor;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.CompanysubcontractorServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("companySubcontractorService")
public class CompanysubcontractorServiceImpl 
        extends GenericServiceAbstractImpl<Companysubcontractor, Integer> 
                 implements CompanysubcontractorServiceIntf{
    
    
    
    @Autowired
    CompanysubcontractorDaoIntf companySubcontractorDao;

    @Autowired
    public CompanysubcontractorServiceImpl(@Qualifier("companySubcontractorDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.companySubcontractorDao = (CompanysubcontractorDaoIntf) genericDao;
    }
    
   
    
}
