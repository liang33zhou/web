package com.ai.web.web.service;

import java.util.List;

import com.ai.web.domain.Product;
import com.ai.web.web.dao.ProductDao;

public class ProductService {

	public List<Product> findAllProduct() {
		// 没有复杂业务，传递到dao层
		ProductDao dao = new ProductDao();
		List<Product> productList = dao.findAllProduct();
		return productList;
	}

}
