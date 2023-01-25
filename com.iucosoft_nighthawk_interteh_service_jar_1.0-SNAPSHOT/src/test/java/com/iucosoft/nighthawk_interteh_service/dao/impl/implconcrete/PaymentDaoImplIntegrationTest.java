package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PaymentDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Payment;
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
public class PaymentDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Payment payment;

    @Autowired
    private PaymentDaoIntf paymentDao;

    @Before
    public void setUp() {

        this.paymentDao.save(this.payment);
    }

    @After
    public void tearDown() {
        this.paymentDao.delete(payment.getIdPayment());
    }

    @Test
    public void testSomeMethod() {

        Payment paymentDB = this.paymentDao.findById(this.payment.getIdPayment());
        Assert.assertEquals(this.payment, paymentDB);

    }

}
