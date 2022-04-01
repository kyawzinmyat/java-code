
import Human.humanC;


import org.springframework.context.ApplicationContext;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;


public class Main {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com.ioc.spring.xml");
		
		Resource rsc = new FileSystemResource("src/main/java/spring.xml");
		BeanFactory bf = new XmlBeanFactory(rsc);
		humanC person1 = (humanC)bf.getBean("person1");
		XmlBeanFactory cxt =(XmlBeanFactory)bf;
		System.out.println(person1.toString());
		cxt.destroySingletons();
	}
}