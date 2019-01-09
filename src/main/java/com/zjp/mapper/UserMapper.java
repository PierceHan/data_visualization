package com.zjp.mapper;

import com.zjp.model.pojo.User;
import com.zjp.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hanguoan on 2019/1/6.
 */
@Mapper
public interface UserMapper extends MyMapper<User> {
}
