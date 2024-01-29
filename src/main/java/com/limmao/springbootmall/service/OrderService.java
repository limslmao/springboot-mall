package com.limmao.springbootmall.service;

import com.limmao.springbootmall.dto.CreateOrderRequest;
import com.limmao.springbootmall.dto.OrderQueryParams;
import com.limmao.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
