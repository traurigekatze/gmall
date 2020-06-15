package com.kry.gmall.api.common.service;

import java.util.List;

/**
 * @author kerryhe
 * @date 2020/6/12
 */
public interface IService<T> {

    /**
     * select all
     * @return
     */
    List<T> selectAll();

    /**
     * select by primary key
     * @param key
     * @return
     */
    T selectByKey(Object key);

    /**
     * save
     * @param entity
     * @return
     */
    int save(T entity);

    /**
     * update not null
     * @param entity
     * @return
     */
    int updateNotNull(T entity);

    /**
     * delete
     * @param key
     * @return
     */
    int delete(Object key);

}
