/**
 * 
 */
package org.pjay.springcore;

import javax.annotation.Resource;

import org.pjay.springcore.contract.Foo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Vijay
 *
 */
public class Bar {

	private Foo foo;

	public Foo getFoo() {
		return foo;
	}

	@Autowired
	//@Qualifier("fooTwo")
	// Use above both combination or below one
	@Resource(name="fooTwo")
	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bar [foo=" + foo + "]";
	}
	
}
