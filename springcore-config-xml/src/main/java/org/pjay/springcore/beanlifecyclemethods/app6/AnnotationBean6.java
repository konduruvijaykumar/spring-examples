/**
 * 
 */
package org.pjay.springcore.beanlifecyclemethods.app6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * @author Vijay
 *
 */
@Component("annotationBean6")
//@Resource(name="annotationBean6")
public class AnnotationBean6 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void initMetod(){
		System.out.println("AnnotationBean6 bean is initialized");
	}
	
	@PreDestroy
	public void destroyMethod(){
		System.out.println("AnnotationBean6 bean is destroyed");
	}
	
}
