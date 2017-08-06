/**
 * 
 */
package org.pjay.springcore.beanlifecyclemethods.app6;

/**
 * @author Vijay
 *
 */
public class Bar6 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initBar6Bean(){
		System.out.println("Bar6 bean is initialized");
	}
	
	public void destroyBar6Bean(){
		System.out.println("Bar6 bean is destroyed");
	}
	
}
