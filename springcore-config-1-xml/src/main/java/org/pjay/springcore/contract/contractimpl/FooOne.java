/**
 * 
 */
package org.pjay.springcore.contract.contractimpl;

import org.pjay.springcore.contract.Foo;

/**
 * @author Vijay
 *
 */
// @Primary May be used on any class directly or indirectly annotated with @Component or on methods annotated with @Bean.
//@Primary
//@Component
public class FooOne implements Foo{
	
	private String name;
	private int pincode;
	private int age;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getPincode() {
		return pincode;
	}

	@Override
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FooOne [getName()=" + getName() + ", getPincode()="
				+ getPincode() + ", getAge()=" + getAge() + "]";
	}
	
	public String toStringFields() {
		return "FooOne [name=" + name + ", pincode=" + pincode + ", age=" + age
				+ "]";
	}

	
}
