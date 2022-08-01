package com.restprod.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.restprod.demo.entity.Product;
import com.restprod.demo.entity.ProductCategory;


@RepositoryRestResource(path="prodcat")
@CrossOrigin("http://localhost:4200/")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
