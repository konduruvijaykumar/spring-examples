/**
 * 
 */
package org.pjay.springcore.constructorbased.app2;

/**
 * @author Vijay
 *
 */
public class Foo2 {
	private String name;
	private int pincode;
	private int age;

	/**
	 * @param name
	 * @param pincode
	 * @param age
	 */
	public Foo2(String name, int pincode, int age) {
		this.name = name;
		this.pincode = pincode;
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Foo2 [name=" + name + ", pincode=" + pincode
				+ ", age=" + age + "]";
	}
}
