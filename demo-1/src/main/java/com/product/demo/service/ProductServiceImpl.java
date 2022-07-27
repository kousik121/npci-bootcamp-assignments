package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.demo.entity.Product;
import com.product.demo.repository.ProductRepositoryImpl;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepositoryImpl repository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		repository.save(p);
	}

	@Transactional
	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		repository.update(p);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
}
