
package com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf;


import com.iucosoft.nighthawk_interteh_service.entities.Account;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import com.iucosoft.nighthawk_interteh_service.serviciispring.GenericServiceIntf;



/**
 *
 * @author 
 */
public interface AccountServiceIntf extends GenericServiceIntf<Account, Integer>{
    
    void addProject(Project project, Account account);
    
    
}
