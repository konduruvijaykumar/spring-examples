/**
 * 
 */
package org.pjay.springcore.beanscope.app8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://www.tutorialspoint.com/spring/spring_bean_scopes.htm, http://stackoverflow.com/questions/16783552/destroy-method-is-not-working-in-spring-framework
 *
 */
public class App8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-app8.xml");
		context.registerShutdownHook();
		Foo8 foo8 = context.getBean("foo8", Foo8.class);
		// Scenario 1) no scope mentioned in xml, default is singleton.
		// Output - "foo8 getName value is:: Kumar" and "foo81 getName value is:: Kumar" - but no name was set for foo81 Object
		// Scenario 2) scope mentioned in xml as singleton, output similar to above
		// Output - "foo8 getName value is:: Kumar" and "foo81 getName value is:: Kumar" - but no name was set for foo81 Object
		// Scenario 3) scope mentioned in xml as prototype
		// Output - "foo8 getName value is:: Kumar" and "foo81 getName value is:: null" - it proves that new object is created every time opposite to above
		// There are other scopes like request, session for web applications
		foo8.setName("Kumar");
		System.out.println("foo8 getName value is:: " + foo8.getName());
		Foo8 foo81 = context.getBean("foo8", Foo8.class); // No setName() is called on foo81
		System.out.println("foo81 getName value is:: " + foo81.getName());
		// Note: Destroy method is not called for beans of scope prototype. This is because the context doesn't keep track of the prototype scope objects (if it does, it will cause a memory leak as spring doesn't know when to dispose it).
		context.close();
	}

}
