/**
 * 
 */
package org.pjay.springcore.constructorsetterbased.app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://examples.javacodegeeks.com/enterprise-java/spring/beans-spring/spring-3-dependency-injection-via-constructor-and-setter/, http://simplespringtutorial.com/di.html
 */
public class App4 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app4.xml");
		Bar4 bar4 = context.getBean("bar4", Bar4.class);
		System.out.println("Bean is instanciated:: \n" + bar4.toString());
	}

}
