/**
 * 
 */
package org.pjay.springcore.lookupmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author vijayk
 * 
 * http://www.logicbig.com/tutorials/spring-framework/spring-core/using-lookup-method/
 * https://stackoverflow.com/questions/26028341/how-to-use-spring-lookup-annotation
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		SingletonBean singletonBean = context.getBean(SingletonBean.class);
		System.out.println(" == singletonBean.toString() == " + singletonBean.toString());
		singletonBean.setMessage("Hello SingleTon...");
		System.out.println(" == singletonBean.toString() == " + singletonBean.toString());
		
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(" == singletonBean1.toString() == " + singletonBean1.toString());
		singletonBean.setMessage("Bye SingleTon...");
		System.out.println(" == singletonBean1.toString() == " + singletonBean1.toString());
		
		// Check old bean for message, clearly shows only one bean object instance is used for all
		System.out.println(" == singletonBean.toString() == " + singletonBean.toString());
		
		if(singletonBean == singletonBean1) {
			System.out.println("singletonBean == singletonBean1");
		}
		
		
		ProtoTypeBean protoTypeBean = singletonBean.getProtoTypeBean();
		System.out.println(" protoTypeBean.toString() == " + protoTypeBean.toString());
		protoTypeBean.setBeanMsg("Hello ProtoType...");
		System.out.println(" protoTypeBean.toString() == " + protoTypeBean.toString());
		
		ProtoTypeBean protoTypeBean1 = singletonBean.getProtoTypeBean();
		System.out.println(" protoTypeBean1.toString() == " + protoTypeBean1.toString());
		protoTypeBean1.setBeanMsg("Bye ProtoType...");
		System.out.println(" protoTypeBean1.toString() == " + protoTypeBean1.toString());
		
		// Check old bean for message, clearly shows only one bean object instance is used for all
		// TODO: Not working as expected should have got a new instance every time, need to verify why it is not working
		System.out.println(" protoTypeBean.toString() == " + protoTypeBean.toString());
		
		if(protoTypeBean == protoTypeBean1) {
			System.out.println("protoTypeBean == protoTypeBean1");
		}
		
		// Note: error when @Component not added to ProtoTypeBean
		/**
		 *  Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.pjay.springcore.lookupmethod.ProtoTypeBean' available
		 */
		context.close();
	}

}
