package com.kry.gmall.member.common.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author kerryhe
 * @date 2020/6/10
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

    /**
     * 带 version delete
     * @param t
     * @return
     */
    default int deleteWithVersion(T t){
        int result = delete(t);
        if(result == 0){
            throw new RuntimeException("删除失败!");
        }
        return result;
    }

    /**
     * 带 version update
     * @param t
     * @return
     */
    default int updateByPrimaryKeyWithVersion(T t){
        int result = updateByPrimaryKey(t);
        if(result == 0){
            throw new RuntimeException("更新失败!");
        }
        return result;
    }

}
