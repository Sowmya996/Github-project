package com.niit.food.config;

import java.util.Properties;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.food.dao.Productdao;
import com.niit.food.dao.Productdaoimpl;
import com.niit.food.model.Products;


@SuppressWarnings("unused")
@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class AppConfiguration {
	@Autowired
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
	System.out.println("Data Source Method");
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/Product");
	dataSource.setUsername("pro");
	dataSource.setPassword("pro");
	System.out.println("Data Source Created");
	return dataSource;
	}
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
		localSessionFactoryBuilder.addAnnotatedClass(Products.class);
		return localSessionFactoryBuilder.buildSessionFactory();	
	}
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
		return hibernateTransactionManager;	
	}
	 @Autowired
	    @Bean(name = "productDAO")
	    public Productdao getProductdao(SessionFactory sessionFactory) {
	    return new Productdaoimpl();
	}
}
