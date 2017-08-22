/**
 * 
 */
package org.pjay.springcore.lookupmethod;

import org.springframework.stereotype.Component;

/**
 * @author vijayk
 *
 */
@Component
public class ProtoTypeBean {

	String beanMsg;

	public String getBeanMsg() {
		return beanMsg;
	}

	public void setBeanMsg(String beanMsg) {
		this.beanMsg = beanMsg;
	}

	@Override
	public String toString() {
		return "ProtoTypeBean [beanMsg=" + beanMsg + "]";
	}

}
