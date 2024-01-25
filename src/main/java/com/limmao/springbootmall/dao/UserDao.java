package com.limmao.springbootmall.dao;

import com.limmao.springbootmall.dto.UserRegisterRequest;
import com.limmao.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
