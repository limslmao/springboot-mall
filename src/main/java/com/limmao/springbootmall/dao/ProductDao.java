package com.limmao.springbootmall.dao;

import com.limmao.springbootmall.constant.ProductCategory;
import com.limmao.springbootmall.dto.ProductQueryParams;
import com.limmao.springbootmall.dto.ProductRequest;
import com.limmao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
