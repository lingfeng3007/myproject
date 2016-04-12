package com.example.service;

import com.example.model.Country;
import com.example.vo.CountryVo;

import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
public interface CountryService extends BaseService{

    List<CountryVo> selectCountry();
}
