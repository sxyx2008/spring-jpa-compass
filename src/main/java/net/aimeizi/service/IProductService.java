package net.aimeizi.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.aimeizi.dao.IProductSearch;
import net.aimeizi.model.Product;

@Transactional
public interface IProductService extends IProductSearch{
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Product entity);

	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Product entity);
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Product update(Product entity);
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Product findById(Integer id);

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> findByProductname(Object productname,
			int... rowStartIdxAndCount);
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> findByPrice(Object price, int... rowStartIdxAndCount);
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> findByDescption(Object descption,
			int... rowStartIdxAndCount);

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> findAll(int... rowStartIdxAndCount);
}