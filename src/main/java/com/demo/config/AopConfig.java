package com.demo.config;


import com.demo.aop.Demo;
import com.demo.aop.Demo2;
import com.demo.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {


	@Bean
	public Demo demo(){
		return  new Demo();
	}

	@Bean
	public Demo2 demo2(){
		return  new Demo2();
	}

	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
}

