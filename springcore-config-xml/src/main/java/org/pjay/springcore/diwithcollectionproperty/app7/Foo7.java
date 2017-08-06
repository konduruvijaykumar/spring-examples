/**
 * 
 */
package org.pjay.springcore.diwithcollectionproperty.app7;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Vijay
 * @source http://www.tutorialspoint.com/spring/spring_injecting_collection.htm
 *
 */
public class Foo7 {
	
	private Properties propertiesObj;
	@SuppressWarnings("rawtypes")
	private List listObj;
	@SuppressWarnings("rawtypes")
	private Set setObj;
	@SuppressWarnings("rawtypes")
	private Map mapObj;
	
	public Properties getPropertiesObj() {
		System.out.println("propertiesObj data:: " + propertiesObj);
		return propertiesObj;
	}
	public void setPropertiesObj(Properties propertiesObj) {
		this.propertiesObj = propertiesObj;
	}
	@SuppressWarnings("rawtypes")
	public List getListObj() {
		System.out.println("listObj data:: " + listObj);
		return listObj;
	}
	@SuppressWarnings("rawtypes")
	public void setListObj(List listObj) {
		this.listObj = listObj;
	}
	@SuppressWarnings("rawtypes")
	public Set getSetObj() {
		System.out.println("setObj data:: " + setObj);
		return setObj;
	}
	@SuppressWarnings("rawtypes")
	public void setSetObj(Set setObj) {
		this.setObj = setObj;
	}
	@SuppressWarnings("rawtypes")
	public Map getMapObj() {
		System.out.println("mapObj data:: " + mapObj);
		return mapObj;
	}
	@SuppressWarnings("rawtypes")
	public void setMapObj(Map mapObj) {
		this.mapObj = mapObj;
	}
	
}
