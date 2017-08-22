/**
 * 
 */
package org.pjay.springcore.application;

import org.pjay.springcore.dependantbean.EmailSenderService;
import org.pjay.springcore.diconfig.EmailApplicationDIConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Vijay
 *
 */
public class EmailApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmailApplicationDIConfig.class);
		//EmailSenderService emailSenderService = context.getBean(EmailSenderService.class);
		EmailSenderService emailSenderService = context.getBean("mybean", EmailSenderService.class);
		emailSenderService.processEmail("vijay@abc.com", "Hi there... How are you...");
		context.close();
	}

}
