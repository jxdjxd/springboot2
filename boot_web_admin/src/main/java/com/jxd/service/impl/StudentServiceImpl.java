package com.jxd.service.impl;

import com.jxd.bean.Student;
import com.jxd.mapper.StudentMapper;
import com.jxd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jxd
 * @date 2021/11/10 17:35
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student getStudentById(Long id){
        return studentMapper.getStudent(id);
    }
}
