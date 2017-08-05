/**
 * 
 */
package org.pjay.springcore.constructorbased.app1;

/**
 * @author Vijay
 *
 */
public class Foo1 {
	private String name;
	private String telephoneNumber;
	private int age;

	/**
	 * @param name
	 * @param telephoneNumber
	 * @param age
	 */
	public Foo1(String name, String telephoneNumber, int age) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.age = age;
	}
	
	/**
	 * @param name
	 * @param age
	 * @param telephoneNumber
	 */
	public Foo1(String name, int age, String telephoneNumber) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Foo1 [name=" + name + ", telephoneNumber=" + telephoneNumber
				+ ", age=" + age + "]";
	}
}
