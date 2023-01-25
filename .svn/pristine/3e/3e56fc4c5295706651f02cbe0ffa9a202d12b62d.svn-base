
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.concrete.AccountDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.impl.GenericDaoHibernateAbstractImpl;
import com.iucosoft.nighthawk_interteh_service.entities.Account;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dorina
 */
@Repository("accountDao")
public class AccountDaoImpl extends GenericDaoHibernateAbstractImpl<Account, Integer> implements AccountDaoIntf{

    @Override
    public void addProject(Project project, Account account) {
        
        account.getProjects().add(project);
        
    }

//    @Override
//    public void addProject(Project project, Account account) {
//        //Setul de proiecte din account si sa adaug setului.
////        get account -> get Set<Projects>-> add Project
////Testarea metodei in AccountTest
//    }
    
}
