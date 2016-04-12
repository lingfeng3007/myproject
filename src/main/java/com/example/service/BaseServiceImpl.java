package com.example.service;

import com.example.util.MyMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T>{

    @Autowired
    protected Mapper<T> mapper;

    @Override
    public List<T> select() {
        return mapper.selectAll();
    }

    @Override
    public T selectById(T entity) {
        return mapper.selectOne(entity);
    }

    @Transactional
    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Transactional
    @Override
    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    @Transactional
    @Override
    public int deleteById(T entity) {
        return mapper.deleteByPrimaryKey(entity);
    }

    @Override
    public List<T> selectPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.select(null);
    }

    @Override
    public List<T> selectPage(int pageNum, int pageSize,String orderBy) {
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(orderBy);
        //Spring4支持泛型注入
        return mapper.select(null);
    }

    @Transactional
    @Override
    public int updateById(T entity){
       return mapper.updateByPrimaryKeySelective(entity);
    }


}
