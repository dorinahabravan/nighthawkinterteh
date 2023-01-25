
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.AdministratorDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.AdministratorServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("administratorService")
public class AdministratorServiceImpl 
        extends GenericServiceAbstractImpl<Administrator, Integer> 
                 implements AdministratorServiceIntf{
    
    
    
    @Autowired
    AdministratorDaoIntf administratorDao;

    @Autowired
    public AdministratorServiceImpl(@Qualifier("administratorDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.administratorDao = (AdministratorDaoIntf) genericDao;
    }
    
    
}
