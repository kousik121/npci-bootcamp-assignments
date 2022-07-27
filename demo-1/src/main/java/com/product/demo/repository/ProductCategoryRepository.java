package com.product.demo.repository;

import java.util.List;

import com.product.demo.entity.ProductCategory;

public interface ProductCategoryRepository {
	public List<ProductCategory> findAll();
	public ProductCategory findById(Long id);
	public void save(ProductCategory pc);
	public void update(ProductCategory pc);
	public void deleteById(Long id);
}
