package com.limmao.springbootmall.service;

import com.limmao.springbootmall.dto.ProductRequest;
import com.limmao.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
