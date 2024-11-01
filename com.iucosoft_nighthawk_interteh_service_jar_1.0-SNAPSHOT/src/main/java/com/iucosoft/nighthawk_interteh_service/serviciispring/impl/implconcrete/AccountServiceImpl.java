
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.AccountDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Account;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.AccountServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Setter
@Slf4j
@Service("accountService")
public class AccountServiceImpl 
        extends GenericServiceAbstractImpl<Account, Integer> 
                 implements AccountServiceIntf{
    
    
    
    @Autowired
    AccountDaoIntf accountDao;

    @Autowired
    public AccountServiceImpl(@Qualifier("accountDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.accountDao = (AccountDaoIntf) genericDao;
    }
    
    // aici s-ar implemnta alte metode declarate in interfata Service , 
    // suplimentare la crele din Interfata Generica

    @Override
    public void addProject(Project project, Account account) {
        accountDao.addProject(project, account);
//        account.getProjects().add(project);
        
    }
    
}
