package com.pingan.city.msg.dao.base;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@RegisterMapper
public interface TkMapperBase<T> extends Mapper<T>, MySqlMapper<T> {

}
