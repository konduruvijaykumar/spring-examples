/**
 * 
 */
package org.pjay.springcore.constructorbased.app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://examples.javacodegeeks.com/enterprise-java/spring/beans-spring/spring-3-dependency-injection-via-constructor-and-setter/, http://simplespringtutorial.com/di.html
 */
public class App2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app2.xml");
		Foo2 foo2 = context.getBean("foo2", Foo2.class);
		System.out.println("Bean is instanciated:: \n" + foo2.toString());
	}

}
