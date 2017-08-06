/**
 * 
 */
package org.pjay.springcore.beanloading.app9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://www.tutorialspoint.com/spring/spring_bean_scopes.htm, http://stackoverflow.com/questions/16783552/destroy-method-is-not-working-in-spring-framework
 *
 */
public class App9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-app9.xml");
		// OutPut: "Foo9 bean is initialized:: null" and  Check if bean is loaded before this statement::
		// As bean scope is default, hence is singleton so only bean instance gets created. Using lazy load true
		// You can check for scope="prototype", to see if both beans are initialized once application context is initialized.
		System.out.println("Check if bean is loaded before this statement:: ");
		context.registerShutdownHook();
		Foo9 foo9 = context.getBean("foo9", Foo9.class);
		foo9.setName("Kumar");
		System.out.println("foo9 getName value is:: " + foo9.getName());
		Foo9 foo91 = context.getBean("foo9", Foo9.class); // No setName() is called on foo81
		System.out.println("foo91 getName value is:: " + foo91.getName());
		// Note: Destroy method is not called for beans of scope prototype. This is because the context doesn't keep track of the prototype scope objects (if it does, it will cause a memory leak as spring doesn't know when to dispose it).
		context.close();
	}

}
