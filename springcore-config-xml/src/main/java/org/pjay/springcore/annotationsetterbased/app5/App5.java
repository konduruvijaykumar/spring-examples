/**
 * 
 */
package org.pjay.springcore.annotationsetterbased.app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://examples.javacodegeeks.com/enterprise-java/spring/beans-spring/spring-3-dependency-injection-via-constructor-and-setter/, http://simplespringtutorial.com/di.html
 */
public class App5 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app5.xml");
		Bar5 bar5 = context.getBean("bar5", Bar5.class);
		System.out.println("Bean is instanciated:: \n" + bar5.toString());
	}

}
