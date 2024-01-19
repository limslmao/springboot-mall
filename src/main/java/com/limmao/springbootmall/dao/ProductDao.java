package com.limmao.springbootmall.dao;

import com.limmao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
