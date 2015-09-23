package net.aimeizi.dao.impl;

import net.aimeizi.dao.IProductDAO;
import net.aimeizi.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProductDAO implements IProductDAO {

	public static final String PRODUCTNAME = "productname";
	public static final String PRICE = "price";
	public static final String DESCPTION = "descption";

	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(Product entity) {
		try {
			entityManager.persist(entity);
			entityManager.flush();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Product entity) {
		try {
			entityManager.remove(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Product update(Product entity) {
		try {
			Product result = entityManager.merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Product findById(Integer id) {
		try {
			Product instance = entityManager.find(Product.class, id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<Product> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		try {
			final String queryString = "select model from Product model where model." + propertyName + "= :propertyValue";
			return entityManager.createNamedQuery(queryString).getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<Product> findByProductname(Object productname,
			int... rowStartIdxAndCount) {
		return findByProperty(PRODUCTNAME, productname, rowStartIdxAndCount);
	}

	public List<Product> findByPrice(Object price, int... rowStartIdxAndCount) {
		return findByProperty(PRICE, price, rowStartIdxAndCount);
	}

	public List<Product> findByDescption(Object descption,
			int... rowStartIdxAndCount) {
		return findByProperty(DESCPTION, descption, rowStartIdxAndCount);
	}

	public List<Product> findAll(final int... rowStartIdxAndCount) {
		try {
			String queryString = "select model from Product model";
			return entityManager.createQuery(queryString).getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

}