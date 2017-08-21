/**
 * 
 */
package org.pjay.springcore.beanlifecycle.app3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Vijay
 *
 */
public class Foo3 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{
	
	private String field;
	
	public void setField(String field) {
		this.field = field;
		System.out.println(" :: In setField(String field) of Foo3 :: field value :: " + this.field);
	}

	public Foo3() {
		System.out.println(" :: In constructor of Foo3 :: field value :: " + field);
	}
	
	public void method1() {
		System.out.println(" :: In method1() of Foo3 :: field value :: " + field);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(" :: In destroy() of Foo3 :: field value :: " + field);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" :: In afterPropertiesSet() of Foo3 :: field value :: " + field);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println(" :: In setApplicationContext(ApplicationContext arg0) of Foo3 :: field value :: " + field + "\t ApplicationContext arg0 is :: " + arg0);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(" :: In setBeanFactory(BeanFactory arg0) of Foo3 :: field value :: " + field + "\t BeanFactory arg0 is :: " + arg0);
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println(" :: In setBeanName(String arg0) of Foo3 :: field value :: " + field + "\t String arg0 is :: " + arg0);
	}
	
	public void customDestroy() {
		System.out.println(" :: In customDestroy() of Foo3 :: field value :: " + field);
	}
	
	public void customInit() {
		System.out.println(" :: In customInit() of Foo3 :: field value :: " + field);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Foo3 [field=" + field + "]";
	}
	
}
