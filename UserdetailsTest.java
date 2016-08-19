package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserdetailsDAO;
import com.niit.shoppingcart.model.Userdetails;

public class UserdetailsTest {
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		UserdetailsDAO userdetailsDAO=(UserdetailsDAO)context.getBean("userdetailsDAO");
		
		Userdetails userdetails =(Userdetails)context.getBean("userdetails");
		
		userdetails.setId("CG004");
		userdetails.setName("CGName004");
		if(userdetailsDAO.save(userdetails)==true)
		{System.out.println("userdetails created successfully");}
		else
		{
			System.out.println("userdetails not created");
		}
	}

}
