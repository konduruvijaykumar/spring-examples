/**
 * 
 */
package org.pjay.springcore.contract;

/**
 * @author Vijay
 *
 */
public interface Foo {
	
	String name = "Foo_Interface";
	int pincode = 560000;
	int age = 20;
	
	String getName();

	void setName(String name);

	int getPincode();

	void setPincode(int pincode);

	int getAge();

	void setAge(int age);
	
}
