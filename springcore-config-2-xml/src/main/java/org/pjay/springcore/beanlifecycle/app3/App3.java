/**
 * 
 */
package org.pjay.springcore.beanlifecycle.app3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 *
 */
public class App3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-app3.xml");
		ctx.registerShutdownHook();
		Foo3 foo3 = ctx.getBean("foo3", Foo3.class);
		foo3.method1();
		ctx.close();
	}

}
