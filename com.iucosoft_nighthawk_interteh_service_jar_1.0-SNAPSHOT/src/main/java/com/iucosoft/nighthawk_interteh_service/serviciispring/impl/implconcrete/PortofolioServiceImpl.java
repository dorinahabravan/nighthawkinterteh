
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PortofolioDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Portofolio;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PortofolioServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("portofolioService")
public class PortofolioServiceImpl 
        extends GenericServiceAbstractImpl<Portofolio, Integer> 
                 implements PortofolioServiceIntf{
    
    
    
    @Autowired
    PortofolioDaoIntf portofolioDao;

    @Autowired
    public PortofolioServiceImpl(@Qualifier("portofolioDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.portofolioDao = (PortofolioDaoIntf) genericDao;
    }
    
   
}
