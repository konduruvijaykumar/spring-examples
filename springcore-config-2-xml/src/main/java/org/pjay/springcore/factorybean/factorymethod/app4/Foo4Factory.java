/**
 * 
 */
package org.pjay.springcore.factorybean.factorymethod.app4;

/**
 * @author vijayk
 *
 */
public class Foo4Factory {
	
	private String identifier;
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	Foo4 getFooInstance(){
		if("foo41".equalsIgnoreCase(getIdentifier())) {
			return new Foo41();
		}else if("foo42".equalsIgnoreCase(getIdentifier())) {
			return new Foo42();
		}else {
			return null;
		}
	}

}
