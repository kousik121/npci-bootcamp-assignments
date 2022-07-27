package com.product.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.demo.entity.ProductCategory;

@Repository
public class ProductCategoryRepositoryImpl implements ProductCategoryRepository{
	@Autowired
	EntityManager entityManager;

	@Override
	public List<ProductCategory> findAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<ProductCategory> query = currentSession.createQuery("select pc from ProductCategory pc", ProductCategory.class);
		List<ProductCategory> productCategories = query.getResultList();
		return productCategories;
	}

	@Override
	public ProductCategory findById(Long id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(ProductCategory.class, id);
	}

	@Transactional
	@Override
	public void save(ProductCategory pc) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(pc);
	}

	@Transactional
	@Override
	public void update(ProductCategory pc) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(pc);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<ProductCategory> query = currentSession.createQuery("delete from ProductCategory where categoryid = :productcategoryid");
		query.setParameter("productcategoryid", id);
		query.executeUpdate();
	}
	
	
}
