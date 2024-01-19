package com.limmao.springbootmall.service.impl;

import com.limmao.springbootmall.dao.ProductDao;
import com.limmao.springbootmall.model.Product;
import com.limmao.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
