/**
 * 
 */
package org.pjay.springcore.diwithcollectionproperty.app7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 *
 */
public class App7 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app7.xml");
		Foo7 foo7 = context.getBean("foo7Bean", Foo7.class);
		foo7.getListObj();foo7.getMapObj();foo7.getPropertiesObj();foo7.getSetObj();
	}

}
