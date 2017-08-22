/**
 * 
 */
package org.pjay.springcore.annotationsetterbased.app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * @source http://examples.javacodegeeks.com/enterprise-java/spring/beans-spring/spring-3-dependency-injection-via-constructor-and-setter/, http://simplespringtutorial.com/di.html
 */
public class App5 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app5.xml");
		Bar5 bar5 = context.getBean("bar5", Bar5.class);
		System.out.println("Bean is instanciated:: \n" + bar5.toString());
		
		// Error: Without adding any bean for arraylist and the variables in bean, when trying autowire
		/**
		 * 
			WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'bar5': Unsatisfied dependency expressed through method 'setArList' parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'java.util.ArrayList<?>' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
			Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'bar5': Unsatisfied dependency expressed through method 'setArList' parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'java.util.ArrayList<?>' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
				at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.inject(AutowiredAnnotationBeanPostProcessor.java:667)
				at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
		 */
		
		
	}

}
