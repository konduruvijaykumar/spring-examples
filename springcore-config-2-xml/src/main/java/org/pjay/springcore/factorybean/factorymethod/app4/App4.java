/**
 * 
 */
package org.pjay.springcore.factorybean.factorymethod.app4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vijayk
 * 
 * https://stackoverflow.com/questions/18772490/what-is-the-difference-between-spring-factory-method-and-factory-bean
 *
 */
public class App4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-app4.xml");
		ctx.registerShutdownHook();
		Foo4 foo4 = ctx.getBean("foo4", Foo4.class);
		foo4.print();
		Foo4Factory foo4Factory = ctx.getBean("foo4Factory", Foo4Factory.class);
		Foo4 foo_4 = foo4Factory.getFooInstance();
		foo_4.print();
		
		if(foo4 == foo_4) {
			System.out.println("foo4 == foo_4");
		}else {
			System.out.println("foo4 != foo_4");
		}
		
		ctx.close();
	}

}
