/**
 * 
 */
package org.pjay.springcore.singleton.prototype.app2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * 
 * http://docs.spring.io/spring-framework/docs/4.1.0.RELEASE/javadoc-api/org/springframework/beans/factory/annotation/Lookup.html
 * https://dzone.com/articles/method-injection-spring
 * https://www.dineshonjava.com/method-injection-with-spring-using-lookup-method-property/
 * https://stackoverflow.com/questions/3891997/how-to-do-spring-lookup-method-injection-with-annotations
 *
 */
public class App2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-app2.xml");
		ctx.registerShutdownHook();
//		Thread t1 = new Thread(new Runnable() {
//									@Override
//									public void run() {
//										Foo2 foo2_t1 = ctx.getBean("foo2", Foo2.class);
//										Bar2 bar2_t1 = foo2_t1.buildBean();
//										try {
//											Thread.sleep(10000);
//										} catch (InterruptedException e) {
//											e.printStackTrace();
//										}
//										System.out.println("Thread 1 \t" + bar2_t1);
//										bar2_t1.setAbc("Thread 1 bean");
//										System.out.println("Thread 1 \t" + bar2_t1);
//									}
//								});
		
//		Thread t2 = new Thread(new Runnable() {
//									@Override
//									public void run() {
//										Foo2 foo2_t2 = ctx.getBean("foo2", Foo2.class);
//										Bar2 bar2_t2 = foo2_t2.buildBean();
//										try {
//											Thread.sleep(6000);
//										} catch (InterruptedException e) {
//											e.printStackTrace();
//										}
//										System.out.println("Thread 2 \t" + bar2_t2);
//										bar2_t2.setAbc("Thread 2 bean");
//										System.out.println("Thread 2 \t" + bar2_t2);
//									}
//								});
		
//		t1.start();t2.start();
//		try {
//			t1.join();t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Foo2 foo2_t1 = ctx.getBean("foo2", Foo2.class);
		Bar2 bar2_t1 = foo2_t1.buildBean();
		
		Foo2 foo2_t2 = ctx.getBean("foo2", Foo2.class);
		Bar2 bar2_t2 = foo2_t2.buildBean();
		
		if (foo2_t1 == foo2_t2) {
			System.out.println("foo2_t1 == foo2_t2");
			System.out.println("foo2_t1 \t" + foo2_t1);
			System.out.println("foo2_t2 \t" + foo2_t2);
		} else {
			System.out.println("foo2_t1 != foo2_t2");
			System.out.println("foo2_t1 \t" + foo2_t1);
			System.out.println("foo2_t2 \t" + foo2_t2);
		}
		
		if (bar2_t1 == bar2_t2) {
			System.out.println("bar2_t1 == bar2_t2");
			System.out.println("bar2_t1 \t" + bar2_t1);
			System.out.println("bar2_t2 \t" + bar2_t2);
		} else {
			System.out.println("bar2_t1 != bar2_t2");
			System.out.println("bar2_t1 \t" + bar2_t1);
			System.out.println("bar2_t2 \t" + bar2_t2);
		}
		
		ctx.close();
	}

}
