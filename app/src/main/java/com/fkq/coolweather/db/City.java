package com.fkq.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by FuKaiqiang on 2017/5/17.
 */

public class City extends DataSupport {
    private int id;
    private String cityname; //市的代号
    private int citycode;
    private int provinceId; //记录当前市所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
