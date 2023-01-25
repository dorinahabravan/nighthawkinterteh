
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.UnitTestBase;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.SubcontractorServiceIntf;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dorina
 */
@Slf4j
public class SubcontractorServiceImplUnitTest extends UnitTestBase {
    

     @Autowired
     private Subcontractor subcontractor;

    @Autowired
    private SubcontractorServiceIntf subcontractorService;

    
     @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserServiceIntf nwuserService;
    
    
    
      @Before
    public void before()
    {
        this.nwuserService.save(this.nWUser);
        this.subcontractorService.save(this.subcontractor);
    }
    
      @Test
    public void update()
    {
        this.subcontractorService.update(this.subcontractor);
        this.nwuserService.update(this.nWUser);
    }
}
