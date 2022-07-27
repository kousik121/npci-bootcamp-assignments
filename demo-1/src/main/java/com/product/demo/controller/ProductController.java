package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.entity.Product;
import com.product.demo.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServiceImpl service;
	
	@GetMapping("/productslist")
	public List<Product> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/productid/{id}")
	public Product findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/saveproduct")
	public String save(@RequestBody Product p) {
		service.save(p);
		return "Product details are added successfully";
	}
	
	@PutMapping("/updateproduct")
	public String update(@RequestBody Product p) {
		service.update(p);
		return "Product details are updated successfully";
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public String deleteById(@PathVariable Long id) {
		service.deleteById(id);
		return "Product details are deleted successfully";
	}
}
