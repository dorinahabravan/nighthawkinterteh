/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.concrete.AdministratorDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.impl.GenericDaoHibernateAbstractImpl;
import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dorina
 */
@Repository("administratorDao")
public class AdministratorDaoImpl extends GenericDaoHibernateAbstractImpl<Administrator, Integer> implements AdministratorDaoIntf{
    
}
