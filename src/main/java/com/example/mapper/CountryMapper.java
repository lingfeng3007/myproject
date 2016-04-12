package com.example.mapper;

import com.example.model.Country;
import com.example.util.MyMapper;
import com.example.vo.CountryVo;

import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
public interface CountryMapper extends MyMapper<Country> {

    List<CountryVo> selectCountry();
}
