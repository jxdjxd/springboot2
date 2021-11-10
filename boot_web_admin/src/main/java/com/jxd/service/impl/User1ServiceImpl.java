package com.jxd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.bean.User1;
import com.jxd.mapper.User1Mapper;
import com.jxd.service.User1Service;
import org.springframework.stereotype.Service;

/**
 * @author jxd
 * @date 2021/11/10 22:12
 */
@Service
public class User1ServiceImpl extends ServiceImpl<User1Mapper, User1> implements User1Service {
}
