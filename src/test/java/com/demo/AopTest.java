package com.demo;

import com.demo.aop.Demo;
import com.demo.aop.Demo2;
import com.demo.config.AopConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: dalele
 * @Date: 2019/11/27 22:36
 * @Description:
 */
public class AopTest {


    @Test
    public void aop(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        Demo demo = applicationContext.getBean(Demo.class);
        Demo2 demo2 = applicationContext.getBean(Demo2.class);
        demo2.test2();
        demo.division(4,2);
        applicationContext.close();
    }
}
