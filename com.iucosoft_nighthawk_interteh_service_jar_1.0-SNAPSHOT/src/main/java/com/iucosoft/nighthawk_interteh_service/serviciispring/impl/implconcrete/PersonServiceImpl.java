
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PersonDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Person;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PersonServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("personService")
public class PersonServiceImpl 
        extends GenericServiceAbstractImpl<Person, Integer> 
                 implements PersonServiceIntf{
    
    
    
    @Autowired
    PersonDaoIntf personDao;

    @Autowired
    public PersonServiceImpl(@Qualifier("personDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.personDao = (PersonDaoIntf) genericDao;
    }
    
   
}
