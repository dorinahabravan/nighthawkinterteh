
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PersonDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dorina
 */
@Slf4j
public class PersonDaoImplIntegrationTest  extends IntegrationTestBase{
    
  @Autowired
    private Person person;
  
  @Autowired
  private PersonDaoIntf personDao;
  
    
    @Before
    public void setUp() {
        
        this.personDao.save(this.person);
    }
    
    @After
    public void tearDown() {
        
        this.personDao.delete(person.getIdPerson());
    }

    @Test
    public void testSomeMethod() {
        
        Person personDB = this.personDao.findById(this.person.getIdPerson());
        Assert.assertEquals( this.person, personDB);
       
    }
    
}
