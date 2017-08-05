/**
 * 
 */
package org.pjay.springcore.constructorbased.app1;

/**
 * @author Vijay
 *
 */
public class HelloWorld1 {
	private Foo1 foo1;

	/**
	 * @param foo1
	 */
	public HelloWorld1(Foo1 foo1) {
		super();
		this.foo1 = foo1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelloWorld1 [foo1=" + foo1 + "]";
	}
	
}
