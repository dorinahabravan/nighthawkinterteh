
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ProjectDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.ProjectServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("projectService")
public class ProjectServiceImpl 
        extends GenericServiceAbstractImpl<Project, Integer> 
                 implements ProjectServiceIntf{
    
    
    
    @Autowired
    ProjectDaoIntf projectDao;

    @Autowired
    public ProjectServiceImpl(@Qualifier("projectDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.projectDao = (ProjectDaoIntf) genericDao;
    }
    
   
}
