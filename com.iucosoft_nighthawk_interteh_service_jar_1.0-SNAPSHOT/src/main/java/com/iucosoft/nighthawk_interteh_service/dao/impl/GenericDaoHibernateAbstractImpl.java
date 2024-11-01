/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.nighthawk_interteh_service.dao.impl;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;

/**
 *
 * @author
 *
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Customer
 */
//@Transactional

//@Repository
//@Scope( BeanDefinition.SCOPE_PROTOTYPE )
@SuppressWarnings("unchecked")
//@Repository("genericDAO")
public abstract class GenericDaoHibernateAbstractImpl<E, K extends Serializable> 
        implements GenericDaoIntf<E, K> {

    private static final Logger LOG = Logger.getLogger(GenericDaoHibernateAbstractImpl.class.getName());

    @Autowired
    private SessionFactory sessionFactory;
    protected Class<? extends E> daoType;
    protected Class<E> clazz;

    @Override
    @SuppressWarnings("unchecked")
    public E init() {
        try {
            return (E) ((Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            /*Nu-s sigura cu rindul de mai jos...
            Modificat: 04-10-2018 - cind am pus Hibernate 5*/
            Logger.getLogger(ParameterizedType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public GenericDaoHibernateAbstractImpl() {
        daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional
    public K save(E entity) {
        // currentSession().saveOrUpdate(entity);
        return (K) currentSession().save(entity);
    }

    @Override
    @Transactional
    public void update(E entity) {
        // currentSession().saveOrUpdate(entity);
        currentSession().update(entity);
    }

    @Override
    @Transactional
    public void saveOrUpdate(E entity) {
        currentSession().saveOrUpdate(entity);

    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void delete(K key) {
        E entity = (E) currentSession().get(daoType, key);
        if (entity != null) {
            currentSession().delete(entity);
        }

    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public E findById(K key) {

        return (E) currentSession().get(daoType, key);

    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<E> list() {
        Session currentSession = currentSession();
        String hql= "from "+daoType.getName();
        return currentSession.createQuery(hql).list();
    }

}
