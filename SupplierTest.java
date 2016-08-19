package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		Supplier supplier =(Supplier)context.getBean("supplier");
		
		supplier.setId("CG004");
		supplier.setName("CGName004");
		if(supplierDAO.save(supplier)==true)
		{System.out.println("categroy created successfully");}
		else
		{
			System.out.println("supplier not created");
		}
	}

}
