package com.cg.productmgmt.service;

import java.util.Map;
import java.util.regex.Pattern;

import com.cg.productmgmt.dao.IProductDAO;
import com.cg.productmgmt.dao.ProductDAO;
import com.cg.productmgmt.exception.ProductException;

public class ProductService implements IProductService {
	IProductDAO dao;
	private Object input;
	public   ProductService() {
        dao=new ProductDAO();
    }
	@Override
	public int updateProducts(String Category, int hike)
			throws ProductException {
		
		return dao.updateProducts(Category, hike);
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		return dao.getProductDetails();
	}
	@Override
	public boolean validateCategory(String ctgry) throws ProductException {
		
		String digitPattern="[a-z]+";
		if(Pattern.matches(digitPattern,ctgry)){
		return true;
		}
		else{
			throw new ProductException("Error : Category name must contain only aplhabets");
		}
	}
		
	
	@Override
	public boolean validateHike(int num) throws ProductException {
		
		
		if(num>0){
		return true;
		}
		else{
			throw new ProductException("Error : Invalid Hike Rate, Hike Rate must be greater than 0");
		}
	
		
	}

}
