package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.demo.entity.ProductCategory;
import com.product.demo.repository.ProductCategoryRepositoryImpl;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	@Autowired
	ProductCategoryRepositoryImpl repository;

	@Override
	public List<ProductCategory> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ProductCategory findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Transactional
	@Override
	public void save(ProductCategory pc) {
		// TODO Auto-generated method stub
		repository.save(pc);
	}

	@Transactional
	@Override
	public void update(ProductCategory pc) {
		// TODO Auto-generated method stub
		repository.update(pc);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
}
