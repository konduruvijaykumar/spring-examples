/**
 * 
 */
package org.pjay.springcore.lookupmethod;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author vijayk
 *
 */
@Component
public abstract class SingletonBean {
	
	String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
/*	@Lookup
	public ProtoTypeBean getProtoTypeBean() {
		// spring will override this method, to provide the bean object
		// it will override method to return bean from spring application context - "return applicationContext.getBean(ProtoTypeBean.class)"
		return null;
	}*/
	
	@Lookup
	public abstract ProtoTypeBean getProtoTypeBean();

	@Override
	public String toString() {
		return "SingletonBean [message=" + message + "]";
	}

}
