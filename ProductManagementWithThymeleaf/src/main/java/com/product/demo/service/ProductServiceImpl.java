package com.product.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.entity.Product;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void save(Product prod) {
		// TODO Auto-generated method stub
		repository.save(prod);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Product> p = repository.findById(id);
		Product prod = null;
		if (p.isPresent())
			prod = p.get();
		return prod;
	}

	@Override
	public List<Product> findByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		List<Product> products = repository.findAll();
		List<Product> categoryProducts = new ArrayList<Product>();
		for (Product p : products) {
			if (p.getCategoryId() == categoryId)
				categoryProducts.add(p);
		}
		return categoryProducts;
		
	}
	
}
