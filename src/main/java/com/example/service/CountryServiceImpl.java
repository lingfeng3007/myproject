package com.example.service;

import com.example.mapper.CountryMapper;
import com.example.model.Country;
import com.example.vo.CountryVo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
@Service
public class CountryServiceImpl extends BaseServiceImpl implements CountryService{

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<CountryVo> selectCountry() {
        PageHelper.startPage(1,1);
        List<CountryVo> list=countryMapper.selectCountry();
        return list;
    }



//    @Override
//    public List<Country> select() {
//        return countryMapper.select(null);
//    }
//
//    @Override
//    public List<Country> selectPage(Country country){
////        PageHelper.startPage(1,10);
////        return countryMapper.select(country);
//        return super.selectPage(1,10);
//    }

//    @Override
//    public Country save(Country country) {
//        int temp=countryMapper.insert(country);
//        System.out.println("***************************="+temp);
//        return null;
//    }



}
