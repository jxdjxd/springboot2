package com.jxd.service.impl;

import com.jxd.bean.City;
import com.jxd.mapper.CityMapper;
import com.jxd.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jxd
 * @date 2021/11/10 19:42
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    public City getById(Long id){
        return cityMapper.getById(id);
    }

    public void insertCity(City city) {
        cityMapper.insertCity(city);
    }

    public void insertCityUseAnnotation(City city){
        cityMapper.insertCityUseAnnotation(city);
    }
}
