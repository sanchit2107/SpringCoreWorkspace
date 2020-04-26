package com.cg.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
@EnableTransactionManagement
public class MyWebMvcConfig implements WebMvcConfigurer {
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/views/");
		irv.setSuffix(".jsp");
		return irv;
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean fBean=new LocalContainerEntityManagerFactoryBean();
		fBean.setPersistenceUnitName("ABES");
		return fBean;
	}
	@Bean
	public JpaTransactionManager getTransactionManagerBean() {
		JpaTransactionManager jt=new JpaTransactionManager();
		jt.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
		return jt;
	}
}
