package com.example.christianlee.drinkingweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by christianlee on 2017-02-01.
 * id对应每个实体类都应该有的字段
 * provinceName记录省的名字
 * provinceCode记录省的代号
 * litePal中的每个实体类都必须继承DataSupport类
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
