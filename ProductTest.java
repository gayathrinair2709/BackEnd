package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTest {
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		Product product =(Product)context.getBean("product");
		
		product.setId("CG004");
		product.setName("CGName004");
		product.setDescription("Description");
		product.setPrice(10000);
		if(productDAO.save(product)==true)
		{System.out.println("product created successfully");}
		else
		{
			System.out.println("product not created");
		}
	}

}
