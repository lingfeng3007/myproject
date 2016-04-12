package com.example.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 基础Mapper，其他继承自己的MyMapper
 * Created by Administrator on 2016/4/11.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
