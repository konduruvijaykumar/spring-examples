/**
 * 
 */
package org.pjay.springcore.setterbased.app3;

/**
 * @author Vijay
 * IMP:: http://javarevisited.blogspot.in/2014/01/why-default-or-no-argument-constructor-java-class.html
 *
 */
public class Bar3 {
	private String barName;
	private int doorNo;
	private Foo3 foo3;
	/**
	 * @return the barName
	 */
	public String getBarName() {
		return barName;
	}
	/**
	 * @param barName the barName to set
	 */
	public void setBarName(String barName) {
		this.barName = barName;
	}
	/**
	 * @return the doorNo
	 */
	public int getDoorNo() {
		return doorNo;
	}
	/**
	 * @param doorNo the doorNo to set
	 */
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	/**
	 * @return the foo3
	 */
	public Foo3 getFoo3() {
		return foo3;
	}
	/**
	 * @param foo3 the foo3 to set
	 */
	public void setFoo3(Foo3 foo3) {
		this.foo3 = foo3;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bar3 [barName=" + barName + ", doorNo=" + doorNo + ", foo3="
				+ foo3 + "]";
	}
}
