package com.niit.main;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.config.Hibernateconfig;
import com.niit.dao.Productdao;
import com.niit.dao.ProductdaoImpl;
import com.niit.model.Product;

@ComponentScan("com.niit")
public class Backendmain {
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello!" );
	    	AnnotationConfigApplicationContext cx = new AnnotationConfigApplicationContext(Hibernateconfig.class, ProductdaoImpl.class);
	    	cx.scan("com.niit.*");
			cx.refresh();
			
			Product product = (Product) cx.getBean("Product");
			Productdao productDao = (Productdao) cx.getBean("ProductDao");
		
		}
		@Test
		public void createProduct ()
		{
		
			Product product = null;
			product.setName("cholocalte");
			product.setPrice(2500);	
		}
			
}
		 
