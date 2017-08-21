/**
 * 
 */
package org.pjay.springcore.singleton.app1;

/**
 * @author Vijay
 * 
 */
public class Foo1 {

	private Bar1 bar1;

	public void setBar1(Bar1 bar1) {
		this.bar1 = bar1;
	}
	
	public Bar1 getBar1() {
		return bar1;
	}

	@Override
	public String toString() {
		return "Foo1 [bar1=" + bar1 + "]";
	}

}
