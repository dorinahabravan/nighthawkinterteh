package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PortofolioDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Portofolio;
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
public class PortofolioDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Portofolio portofolio;

    @Autowired
    private PortofolioDaoIntf portofolioDao;

    @Before
    public void setUp() {

        this.portofolioDao.save(this.portofolio);

    }

    @After
    public void tearDown() {

        this.portofolioDao.delete(portofolio.getDocumentId());
    }

    @Test
    public void testSomeMethod() {
        Portofolio portofolioDB = this.portofolioDao.findById(this.portofolio.getDocumentId());
        Assert.assertEquals(this.portofolio, portofolioDB);
    }

}
