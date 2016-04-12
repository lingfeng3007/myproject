package com.example.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/4/11.
 */
@Table(name = "country")
public class Country extends BaseEntity {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "countryname")
    private String countryName;
    @Column(name = "countrycode")
    private String countryCode;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
