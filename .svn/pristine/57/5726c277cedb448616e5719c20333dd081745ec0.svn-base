
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.EmployercompanyDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.EmployercompanyServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("employerCompanyService")
public class EmployercompanyServiceImpl 
        extends GenericServiceAbstractImpl<Employercompany, Integer> 
                 implements EmployercompanyServiceIntf{
    
    
    
    @Autowired
    EmployercompanyDaoIntf employerCompanyDao;

    @Autowired
    public EmployercompanyServiceImpl(@Qualifier("employerCompanyDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.employerCompanyDao = (EmployercompanyDaoIntf) genericDao;
    }
    
  
    
}
