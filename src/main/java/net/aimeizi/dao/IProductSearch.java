package net.aimeizi.dao;

import java.util.List;

import net.aimeizi.model.Product;

public interface IProductSearch {

	/**
	 * 全文检索
	 * @param keyword
	 * @param pagebumber
	 * @param pagesize
	 * @return
	 */
	List<Product> query(String keyword,int pagebumber,int pagesize);
}