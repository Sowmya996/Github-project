package com.niit.config;

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

import com.niit.dao.Productdao;
import com.niit.dao.ProductdaoImpl;
import com.niit.model.Product;

@SuppressWarnings("unused")
@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class Hibernateconfig {

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
	private Properties getHibernateProperties() {
	Properties properties = new Properties();
	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	properties.put("hibernate.hbm2ddl.auto", "update");
	properties.put("hibernate.show_sql", "true");
	System.out.println("Table Source Created");
	return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.addAnnotatedClass(Product.class);
	sessionBuilder.scanPackages("com.model");
	System.out.println("Session");
	return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("Transaction");
		return transactionManager;
	}
	
    @Autowired
    @Bean(name = "productDAO")
    public Productdao getProductdao(SessionFactory sessionFactory) {
    return new ProductdaoImpl();
}
}


