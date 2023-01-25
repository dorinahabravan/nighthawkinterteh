package com.iucosoft.nighthawk_interteh_service.serviciispring.impl;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.GenericServiceIntf;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author
 */
//@Service
public abstract class GenericServiceAbstractImpl<E, K> implements GenericServiceIntf<E, K> {

    //  @Autowired
    public GenericDaoIntf<E, K> genericDao;

    public GenericServiceAbstractImpl() {
    }

    public GenericServiceAbstractImpl(GenericDaoIntf<E, K> genericDao) {
        this.genericDao = genericDao;
    }

    @Override
    public E init() {
        return genericDao.init();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public K save(E entity) {
        return genericDao.save(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public E findById(K key) {
        return genericDao.findById(key);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E entity) {
        genericDao.update(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdate(E entity) {
        genericDao.saveOrUpdate(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(K key) {
        genericDao.delete(key);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> list() {
        return genericDao.list();
    }

}
