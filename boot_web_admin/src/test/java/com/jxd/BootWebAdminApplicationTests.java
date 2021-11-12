package com.jxd;

import com.jxd.bean.Student;
import com.jxd.bean.User1;
import com.jxd.mapper.User1Mapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class BootWebAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    User1Mapper user1Mapper;

    @Test
    void contextLoads() {
        Long count = jdbcTemplate.queryForObject("select count(*) from student", Long.class);
        System.out.println(count);
    }

    @Test
    void testUser1Mapper(){
        User1 user1 = user1Mapper.selectById(1L);
        log.info("user1的信息：" + user1.toString());
    }

}
