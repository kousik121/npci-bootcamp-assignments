package com.product.demo.service;

import java.util.List;

import com.product.demo.entity.Product;

public interface ProductService {
	public List<Product> findAll();
	public void save(Product prod);
	public void deleteById(Long id);
	public Product findById(Long id);
	public List<Product> findByCategoryId(Long categoryId);
}
