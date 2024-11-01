
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NighthawkintertehDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Nighthawkinterteh;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NighthawkintertehServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("nighthawkintertehService")
public class NighthawkintertehServiceImpl 
        extends GenericServiceAbstractImpl<Nighthawkinterteh, Integer> 
                 implements NighthawkintertehServiceIntf{
    
    
    
    @Autowired
    NighthawkintertehDaoIntf nighthawkintertehDao;

    @Autowired
    public NighthawkintertehServiceImpl(@Qualifier("nighthawkintertehDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.nighthawkintertehDao = (NighthawkintertehDaoIntf) genericDao;
    }
    
    
    
}
