package com.cg.productmgmt.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cg.productmgmt.exception.ProductException;

public class ProductDAO implements IProductDAO {
	static Map<String, String> productDetails;
	static Map<String, Integer> salesDetails;
	static {
		productDetails = new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("colgate", "paste");
		productDetails.put("pears", "soap");
		productDetails.put("sony", "electronics");
		productDetails.put("samsung", "electronics");
		productDetails.put("facepack", "cosmatics");
		productDetails.put("facecream", "cosmatics");
		
        salesDetails= new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate", 50);
		salesDetails.put("pears", 70);
		salesDetails.put("sony", 10000);
		salesDetails.put("samsung", 23000);
		salesDetails.put("facepack", 100);
		salesDetails.put("facecream", 60);
	}

	@Override
	public int updateProducts(String Category, int hike)
			throws ProductException {
		Set<String> s=productDetails.keySet();
		int count=0;
        for(String key : s){
            if(Category.equals(productDetails.get(key)))
            		{
            	
                int value=salesDetails.get(key);
                salesDetails.put(key, value+value*hike/100);
                count++;
            }
            
        }
        if(count==0)
        	throw new ProductException("Product Category not found");
		return 1;
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		
	
		for(String s:salesDetails.keySet())
		// System.out.println(productDetails);
		 //System.out.println(salesDetails.get(s));
		 return salesDetails;
		return null;
	}

}
