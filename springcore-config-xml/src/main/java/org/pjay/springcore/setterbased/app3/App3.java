/**
 * 
 */
package org.pjay.springcore.setterbased.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://examples.javacodegeeks.com/enterprise-java/spring/beans-spring/spring-3-dependency-injection-via-constructor-and-setter/, http://simplespringtutorial.com/di.html
 * IMP:: http://javarevisited.blogspot.in/2014/01/why-default-or-no-argument-constructor-java-class.html
 */
public class App3 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app3.xml");
		Bar3 bar3 = context.getBean("bar3", Bar3.class);
		System.out.println("Bean is instanciated:: \n" + bar3.toString());
	}

}
