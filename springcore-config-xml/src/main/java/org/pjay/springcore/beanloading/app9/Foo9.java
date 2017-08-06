/**
 * 
 */
package org.pjay.springcore.beanloading.app9;

/**
 * @author Vijay
 * @source http://www.tutorialspoint.com/spring/spring_bean_scopes.htm, http://stackoverflow.com/questions/16783552/destroy-method-is-not-working-in-spring-framework
 *
 */
public class Foo9 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init(){
		System.out.println("Foo9 bean is initialized:: " + name);
	}
	
	public void destroy(){
		System.out.println("Foo9 bean is destroyed:: " + name);
	}

}
