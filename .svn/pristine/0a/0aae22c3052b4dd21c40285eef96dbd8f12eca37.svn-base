
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NighthawkintertehDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Nighthawkinterteh;
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
public class NighthawkintertehDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Nighthawkinterteh nighthawkinterteh;

    @Autowired
    private NighthawkintertehDaoIntf nighthawkintertehDao;

    @Before
    public void setUp() {
        this.nighthawkintertehDao.save(this.nighthawkinterteh);
    }

    @After
    public void tearDown() {
        
        this.nighthawkintertehDao.delete(nighthawkinterteh.getIdCompany());
    }

    @Test
    public void testSomeMethod() {
      Nighthawkinterteh nighthawkintertehDB = this.nighthawkintertehDao.findById(nighthawkinterteh.getIdCompany());
      Assert.assertEquals(this.nighthawkinterteh,nighthawkintertehDB);
    }

}
