package com.jxd.service;

import com.jxd.bean.City;

/**
 * @author jxd
 * @date 2021/11/10 22:13
 */
public interface CityService {
    public City getById(Long id);
    public void insertCity(City city);
    public void insertCityUseAnnotation(City city);
}
