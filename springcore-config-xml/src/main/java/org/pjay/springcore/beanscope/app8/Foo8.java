/**
 * 
 */
package org.pjay.springcore.beanscope.app8;

/**
 * @author Vijay
 *
 */
public class Foo8 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init(){
		System.out.println("Foo8 bean is initialized:: " + name);
	}
	
	public void destroy(){
		System.out.println("Foo8 bean is destroyed:: " + name);
	}
	
}
