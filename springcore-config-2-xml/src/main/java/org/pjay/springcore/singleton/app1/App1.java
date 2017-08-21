/**
 * 
 */
package org.pjay.springcore.singleton.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * 
 * https://stackoverflow.com/questions/18772490/what-is-the-difference-between-spring-factory-method-and-factory-bean
 *
 */
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appctx = new ClassPathXmlApplicationContext("spring-app1.xml");
		Foo1 foo11 = appctx.getBean("foo11", Foo1.class);
		Foo1 foo12 = appctx.getBean("foo12", Foo1.class);
		if(foo11 == foo12){
			System.out.println("foo11 == foo12");
			System.out.println(foo11);
			System.out.println(foo12);
		}else{
			System.out.println("foo11 != foo12");
			System.out.println(foo11);
			System.out.println(foo12);
		}
		
		if(foo11.getBar1() == foo12.getBar1()) {
			System.out.println("foo11.getBar1() == foo12.getBar1()");
			//System.out.println(foo11.getBar1());
			//System.out.println(foo12.getBar1());
		}else {
			System.out.println("foo11.getBar1() != foo12.getBar1()");
			//System.out.println(foo11.getBar1());
			//System.out.println(foo12.getBar1());
		}
		
		Foo2 foo21 = appctx.getBean("foo21", Foo2.class);
		Foo2 foo22 = appctx.getBean("foo22", Foo2.class);
		if(foo21 == foo22){
			System.out.println("foo21 == foo22");
			System.out.println(foo21);
			System.out.println(foo22);
		}else{
			System.out.println("foo21 != foo22");
			System.out.println(foo21);
			System.out.println(foo22);
		}
		
		if(foo21.getBar1() == foo22.getBar1()) {
			System.out.println("foo21.getBar1() == foo22.getBar1()");
			//System.out.println(foo21.getBar1());
			//System.out.println(foo22.getBar1());
		}else {
			System.out.println("foo21.getBar1() != foo22.getBar1()");
			//System.out.println(foo21.getBar1());
			//System.out.println(foo22.getBar1());
		}
		
		
		if (foo21.getBar1() == foo11.getBar1() && foo22.getBar1() == foo12.getBar1()
				&& foo22.getBar1() == foo11.getBar1() && foo21.getBar1() == foo12.getBar1()) {
			System.out.println("foo21.getBar1() == foo11.getBar1() && foo22.getBar1() == foo12.getBar1() && foo22.getBar1() == foo11.getBar1() && foo21.getBar1() == foo12.getBar1()");
		}
	}

}
