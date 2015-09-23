package net.aimeizi.dao;

import java.util.List;

import net.aimeizi.model.Category;

public interface ICategoryDAO {
	
	public void save(Category entity);

	
	public void delete(Category entity);

	
	public Category update(Category entity);

	public Category findById(Integer id);

	
	public List<Category> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Category> findByCategoryname(Object categoryname,
			int... rowStartIdxAndCount);

	
	public List<Category> findAll(int... rowStartIdxAndCount);
}