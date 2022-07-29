package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.demo.entity.Product;
import com.product.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/productslist")
	public String displayProducts(Model model) {
		List<Product> products = service.findAll();
		model.addAttribute("productslist", products);
		return "prodUI/products.html";
	}
	
	@GetMapping("/addprod")
	public String form(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "prodUI/productForm.html";
	}
	
	@PostMapping("/saved")
	public String save(@ModelAttribute("PRODUCT") Product prod) {
		service.save(prod);
		return "redirect:/product/productslist";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam Long id, Model model) {
		Product prod = service.findById(id);
		model.addAttribute("PRODUCT", prod);
		return "prodUI/productForm.html";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Long id) {
		service.deleteById(id);
		return "redirect:/product/productslist";
	}
	
	@GetMapping("/takesearch")
	public String takeSearch(Model model) {
		model.addAttribute("id", 0);
		return "prodUI/takesearch.html";
	}
	
	@PostMapping("/search")
	public String searchProduct(@ModelAttribute("id") String id, Model model) {
		Product prod = service.findById(Long.valueOf(id));
		model.addAttribute("productslist", prod);
		return "prodUI/products.html";
	}
	
	@GetMapping("/takecategorysearch")
	public String takeCategorySearch(Model model) {
		model.addAttribute("categoryId", 0);
		return "prodUI/takecategorysearch.html";
	}
	
	
	@PostMapping("/categorysearch")
	public String searchCategoryProduct(@ModelAttribute("categoryId") String categoryId, Model model) {
		List<Product> prods = service.findByCategoryId(Long.valueOf(categoryId));
		model.addAttribute("productslist", prods);
		return "prodUI/products.html";
	}
	
}
