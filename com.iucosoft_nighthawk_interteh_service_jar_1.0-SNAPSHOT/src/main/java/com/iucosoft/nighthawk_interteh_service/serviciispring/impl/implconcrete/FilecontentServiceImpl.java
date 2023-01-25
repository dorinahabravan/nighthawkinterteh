
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.FilecontentDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Filecontent;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.FilecontentServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("fileContentService")
public class FilecontentServiceImpl 
        extends GenericServiceAbstractImpl<Filecontent, Integer> 
                 implements FilecontentServiceIntf{
    
    
    
    @Autowired
    FilecontentDaoIntf fileContentDao;

    @Autowired
    public FilecontentServiceImpl(@Qualifier("fileContentDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.fileContentDao = (FilecontentDaoIntf) genericDao;
    }
    
    
    
}
