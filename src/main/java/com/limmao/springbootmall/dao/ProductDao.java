package com.limmao.springbootmall.dao;

import com.limmao.springbootmall.dto.ProductRequest;
import com.limmao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
