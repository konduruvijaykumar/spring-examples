/**
 * 
 */
package org.pjay.springcore.constructorsetterbased.app4;

/**
 * @author Vijay
 *
 */
public class Bar4 {
	private String barName;
	private int doorNo;
	private Foo4 foo4;

	/**
	 * @param barName
	 * @param doorNo
	 */
	public Bar4(String barName, int doorNo) {
		this.barName = barName;
		this.doorNo = doorNo;
	}
	
	/**
	 * @return the foo4
	 */
	public Foo4 getFoo4() {
		return foo4;
	}
	/**
	 * @param foo4 the foo4 to set
	 */
	public void setFoo4(Foo4 foo4) {
		this.foo4 = foo4;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bar4 [barName=" + barName + ", doorNo=" + doorNo + ", foo4="
				+ foo4 + "]";
	}
	
}
