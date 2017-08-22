/**
 * 
 */
package org.pjay.springcore.annotationsetterbased.app5;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Vijay
 *
 */
public class Bar5 {
	private Foo5 foo5;
	//private List myList;
	private String abc;
	private double xyz;
	private ArrayList<String> arList;

	/**
	 * @return the arList
	 */
	public ArrayList<String> getArList() {
		return arList;
	}
	/**
	 * @param arList the arList to set
	 */
	//@Autowired
	public void setArList(ArrayList<String> arList) {
		this.arList = arList;
	}
	/**
	 * @return the xyz
	 */
	public double getXyz() {
		return xyz;
	}
	/**
	 * @param xyz the xyz to set
	 */
	//@Autowired
	public void setXyz(double xyz) {
		this.xyz = xyz;
	}
	/**
	 * @return the abc
	 */
	public String getAbc() {
		return abc;
	}
	/**
	 * @param abc the abc to set
	 */
	//@Autowired
	public void setAbc(String abc) {
		this.abc = abc;
	}
	//	/**
//	 * @return the myList
//	 */
//	public List getMyList() {
//		return myList;
//	}
//	/**
//	 * @param myList the myList to set
//	 */
//	@Autowired
//	public void setMyList(List myList) {
//		this.myList = myList;
//	}
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
		return "Bar5 [foo5=" + foo5 + ", abc=" + abc + ", xyz=" + xyz
				+ ", arList=" + arList + "]";
	}
	
}
