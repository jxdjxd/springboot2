package com.jxd.mapper;

import com.jxd.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author jxd
 * @date 2021/11/10 19:38
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where id =#{id}")
    public City getById(Long id);

    public void insertCity(City city);

    @Insert("insert into city(`name`,`state`,`country`) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insertCityUseAnnotation(City city);
}
