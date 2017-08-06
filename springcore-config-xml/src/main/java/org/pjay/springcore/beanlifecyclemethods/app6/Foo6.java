/**
 * 
 */
package org.pjay.springcore.beanlifecyclemethods.app6;

/**
 * @author Vijay
 *
 */
public class Foo6 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init(){
		System.out.println("Foo6 bean is initialized:: " + name);
	}
	
	public void destroy(){
		System.out.println("Foo6 bean is destroyed:: " + name);
	}
	
}
