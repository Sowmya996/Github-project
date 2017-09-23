package com.niit.foodshope.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.niit.foodshope.model.Products;
import com.niit.foodshope.model.Supplier;
import com.niit.foodshope.model.User;

@Configuration
@ComponentScan("com")
public class ApplicationConfiguration {
	private  Properties getHibernateProperties()

	{

		Properties properties=new Properties();

		properties.setProperty("hibernate.show_sql", "true");

		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		properties.setProperty("hibernate.hbm2ddl.auto", "update");

		return properties;

	}
	@Autowired

	@Bean(name="sessionFactory")

	public SessionFactory getSessionFactory(DataSource dataSource)

	{

		LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(dataSource);

		localSessionFactoryBuilder.addProperties(getHibernateProperties());
		localSessionFactoryBuilder.addAnnotatedClass(User.class);
		localSessionFactoryBuilder.addAnnotatedClass(Products.class);
		localSessionFactoryBuilder.addAnnotatedClass(Supplier.class);
		
		return localSessionFactoryBuilder.buildSessionFactory();
	}
	@Autowired

	@Bean(name="transactionManager")

	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)

	{

		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);

		return hibernateTransactionManager;

	}

}
