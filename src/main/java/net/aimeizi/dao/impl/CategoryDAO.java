package net.aimeizi.dao.impl;

import net.aimeizi.dao.ICategoryDAO;
import net.aimeizi.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CategoryDAO implements ICategoryDAO {

    public static final String CATEGORYNAME = "categoryname";

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Category entity) {
        try {
            entityManager.persist(entity);
        } catch (RuntimeException re) {
            throw re;
        }
    }


    public void delete(Category entity) {
        try {
            entityManager.remove(entity);
        } catch (RuntimeException re) {
            throw re;
        }
    }


    public Category update(Category entity) {
        try {
            Category result = entityManager.merge(entity);
            return result;
        } catch (RuntimeException re) {
            throw re;
        }
    }

    public Category findById(Integer id) {
        try {
            Category instance = entityManager.find(Category.class, id);
            return instance;
        } catch (RuntimeException re) {
            throw re;
        }
    }

    public List<Category> findByProperty(String propertyName,
                                         final Object value, final int... rowStartIdxAndCount) {
        try {
            final String queryString = "select model from Category model where model."
                    + propertyName + "= :propertyValue";
            return entityManager.createNamedQuery(queryString).getResultList();
        } catch (RuntimeException re) {
            throw re;
        }
    }

    public List<Category> findByCategoryname(Object categoryname, int... rowStartIdxAndCount) {
        return findByProperty(CATEGORYNAME, categoryname, rowStartIdxAndCount);
    }


    @SuppressWarnings("unchecked")
    public List<Category> findAll(final int... rowStartIdxAndCount) {
        try {
            String queryString = "select model from Category model";
            return entityManager.createQuery(queryString).getResultList();
        } catch (RuntimeException re) {
            throw re;
        }
    }

}