package com.limmao.springbootmall.service;

import com.limmao.springbootmall.dto.UserLoginRequest;
import com.limmao.springbootmall.dto.UserRegisterRequest;
import com.limmao.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
