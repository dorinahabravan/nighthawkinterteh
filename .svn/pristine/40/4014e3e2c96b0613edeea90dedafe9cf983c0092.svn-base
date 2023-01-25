package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author
 */
@Service("nwuserService")
public class NWUserServiceImpl
        extends GenericServiceAbstractImpl<NWUser, Integer>
        implements NWUserServiceIntf {

    @Autowired
    NWUserDaoIntf nwuserDao;

    @Autowired
    public NWUserServiceImpl(@Qualifier("nwuserDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.nwuserDao = (NWUserDaoIntf) genericDao;
    }

   
//      @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//        public NWUser loginUser(NWUser user){
//        userDao.loginUser(loginUser(user));
//        return user;
//
//    }

    

}

