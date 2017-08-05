/**
 * 
 */
package org.pjay.springcore.annotationsetterbased.app5;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Vijay
 *
 */
public class Bar5 {
	//@Autowired
	// Can have autowired annotation at variable level or setter level.
	// We can avoid having setter method if we have Autowired annotation at variable level
	private Foo5 foo5;

	/**
	 * @return the foo5
	 */
	public Foo5 getFoo5() {
		return foo5;
	}
	/**
	 * @param foo5 the foo5 to set
	 */
	@Autowired
	public void setFoo5(Foo5 foo5) {
		this.foo5 = foo5;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bar5 [foo5=" + foo5 + "]";
	}
	
}
