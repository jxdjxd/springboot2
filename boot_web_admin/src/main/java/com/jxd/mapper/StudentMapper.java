package com.jxd.mapper;

import com.jxd.bean.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jxd
 * @date 2021/11/10 17:06
 */
@Mapper
public interface StudentMapper {

    public Student getStudent(Long id);
}
