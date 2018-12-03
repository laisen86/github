package com.paopao.myBatisPlusDemo.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.paopao.myBatisPlusDemo.user.po.User;
import org.springframework.stereotype.Repository;

/**
 * UserMapper
 *
 * @author zxl
 * @since 2018/12/3
 */
@Repository("userMapper")
public interface UserMapper extends BaseMapper<User> {

}
