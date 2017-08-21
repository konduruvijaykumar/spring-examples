/**
 * 
 */
package org.pjay.springcore.beanlifecycle.app3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Vijay
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println(" === :: In postProcessAfterInitialization(Object arg0, String arg1) of MyBeanPostProcessor :: === ");
		System.out.println(" :: Object arg0 is :: " + arg0 + "\t String arg1 is ::" + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println(" === :: In postProcessBeforeInitialization(Object arg0, String arg1) of MyBeanPostProcessor :: === ");
		System.out.println(" :: Object arg0 is :: " + arg0 + "\t String arg1 is ::" + arg1);
		return arg0;
	}
	
}
