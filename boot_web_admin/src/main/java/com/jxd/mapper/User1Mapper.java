package com.jxd.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.bean.User1;
import org.apache.ibatis.annotations.Mapper;

/**
 * 继承BaseMapper就拥有了基本的CRUD能力
 * @author jxd
 * @date 2021/11/10 21:49
 */
@Mapper
public interface User1Mapper extends BaseMapper<User1> {
}
