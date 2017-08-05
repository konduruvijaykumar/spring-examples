/**
 * 
 */
package org.pjay.springcore.constructorbased.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://examples.javacodegeeks.com/enterprise-java/spring/beans-spring/spring-3-dependency-injection-via-constructor-and-setter/, http://simplespringtutorial.com/di.html
 * @source http://www.tutorialspoint.com/spring/spring_bean_definition.htm
 */
public class App1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app1.xml");
		HelloWorld1 helloWorld1 = context.getBean("helloWorld1", HelloWorld1.class);
		System.out.println("Bean is instanciated:: \n" + helloWorld1.toString());
	}

}
