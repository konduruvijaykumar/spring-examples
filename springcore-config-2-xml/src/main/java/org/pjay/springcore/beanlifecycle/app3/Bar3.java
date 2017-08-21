/**
 * 
 */
package org.pjay.springcore.beanlifecycle.app3;

/**
 * @author vijayk
 *
 */
public class Bar3 {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Bar3 [name=" + name + "]";
	}

}
