package com.limmao.springbootmall.service;

import com.limmao.springbootmall.dto.CreateOrderRequest;
import com.limmao.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
