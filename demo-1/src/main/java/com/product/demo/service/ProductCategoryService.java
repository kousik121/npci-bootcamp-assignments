package com.product.demo.service;

import java.util.List;

import com.product.demo.entity.ProductCategory;

public interface ProductCategoryService {
	public List<ProductCategory> findAll();
	public ProductCategory findById(Long id);
	public void save(ProductCategory pc);
	public void update(ProductCategory pc);
	public void deleteById(Long id);
}
