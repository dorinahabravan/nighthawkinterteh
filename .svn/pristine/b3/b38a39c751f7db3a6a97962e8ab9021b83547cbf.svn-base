
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.FiledocumentDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.FiledocumentServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("fileDocumentService")
public class FiledocumentServiceImpl 
        extends GenericServiceAbstractImpl<Filedocument, Integer> 
                 implements FiledocumentServiceIntf{
    
    
    
    @Autowired
    FiledocumentDaoIntf fileDocumentDao;

    @Autowired
    public FiledocumentServiceImpl(@Qualifier("fileDocumentDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.fileDocumentDao = (FiledocumentDaoIntf) genericDao;
    }
    
    
    
}
