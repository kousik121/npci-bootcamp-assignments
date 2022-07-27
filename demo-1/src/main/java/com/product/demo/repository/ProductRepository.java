package com.product.demo.repository;

import java.util.List;

import com.product.demo.entity.Product;

public interface ProductRepository {
	public List<Product> findAll();
	public Product findById(Long id);
	public void save(Product p);
	public void update(Product p);
	public void deleteById(Long id);
}
