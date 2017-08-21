/**
 * 
 */
package org.pjay.springcore.singleton.app1;

/**
 * @author Vijay
 *
 */
public class Foo2 {
	
	private static Foo2 foo2;
	
	private Foo2() {
	}
	
	public static Foo2 getInstance() {
		if(null == foo2){
			synchronized (Foo2.class) {
				if(null == foo2){
					foo2 = new Foo2();
				}
			}
		}
		return foo2;
	}

	private Bar1 bar1;

	public void setBar1(Bar1 bar1) {
		this.bar1 = bar1;
	}
	
	public Bar1 getBar1() {
		return bar1;
	}

	@Override
	public String toString() {
		return "Foo2 [bar1=" + bar1 + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		throw new CloneNotSupportedException();
	}
	
}
