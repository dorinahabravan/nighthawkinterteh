
package com.iucosoft.nighthawk_interteh_service.serviciispring;


import java.util.List;

/**
 *
 * @author 
 */

public interface GenericServiceIntf<E, K> {

    public E init();

    public K save(E entity);

    public E findById(K key);

    public void update(E entity);

    public void saveOrUpdate(E entity);

    public void delete(K key);

    public List<E> list();
}

