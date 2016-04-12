package com.example.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
public interface BaseService<T> {

    /**
     * 单表查询所有
     * @return
     */
    List<T> select();

    /**
     * 单表查询
     * @param entity
     * @return
     */
    T selectById(T entity);

    /**
     * 保存
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 保存
     * @param entity
     * @return
     */
    int insertSelective(T entity);

    /**
     * 根据主键删除
     * @param entity
     * @return
     */
    int deleteById(T entity);

    /**
     * 单表分页查询
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return
     */
    List<T> selectPage(int pageNum,int pageSize);

    /**
     * 单表分页查询，结果排序
     * @param pageNum 页码
     * @param pageSize 页大小
     * @param orderBy 排序（id desc,name desc）
     * @return
     */
    List<T> selectPage(int pageNum, int pageSize,String orderBy);

    /**
     * 根据主键更新
     * @param entity
     * @return
     */
    int updateById(T entity);

}
