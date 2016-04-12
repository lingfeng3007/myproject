package com.example.controller;

import com.example.model.Country;
import com.example.service.CountryService;
import com.example.service.CountryServiceImpl;
import com.example.vo.CountryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
@Controller
@RequestMapping
public class HomeController {

    @Autowired
    private CountryService countryService;

    @RequestMapping
    public ModelAndView home(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("name","测试项目");
        List<CountryVo> list=countryService.selectCountry();
        mav.addObject("list",list);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/select")
    public @ResponseBody List<Country> select(){
        List<Country> list=countryService.select();
        return list;
    }

    @RequestMapping("/page")
    public @ResponseBody List<Country> selectpage(){
        Country country=new Country();
        List<Country> list=countryService.selectPage(1, 10);
        return list;
    }

    @RequestMapping("/save")
    public @ResponseBody Country save(){
        Country country=new Country();
        country.setCountryCode("PP");
        country.setCountryName("测试");
        countryService.insert(country);
        return country;
    }

}
