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

import com.product.demo.entity.ProductCategory;
import com.product.demo.service.ProductCategoryServiceImpl;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController {
	@Autowired
	ProductCategoryServiceImpl service;
	
	@GetMapping("/productcategorieslist")
	public List<ProductCategory> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/productcategoryid/{id}")
	public ProductCategory findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/saveproductcategory")
	public String save(@RequestBody ProductCategory pc) {
		service.save(pc);
		return "Product category details are saved successfully";
	}
	
	@PutMapping("/updateproductcategory")
	public String update(@RequestBody ProductCategory pc) {
		service.update(pc);
		return "Product category details are successfully updated";
	}
	
	@DeleteMapping("/deleteproductcategoryid/{id}")
	public String deleteById(@PathVariable Long id) {
		service.deleteById(id);
		return "Product category details are deleted successfully";
	}
}
