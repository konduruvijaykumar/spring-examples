/**
 * 
 */
package org.pjay.springcore.beanlifecyclemethods.app6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://stackoverflow.com/questions/7414794/difference-between-contextannotation-config-vs-contextcomponent-scan
 *
 */
public class App6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-app6.xml");
		context.registerShutdownHook();
		context.getBean("foo6");
		context.getBean("bar6");
		context.getBean("annotationBean6");
		context.close();
	}

}
