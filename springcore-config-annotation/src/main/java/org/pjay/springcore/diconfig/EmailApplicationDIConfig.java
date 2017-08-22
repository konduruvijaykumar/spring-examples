/**
 * 
 */
package org.pjay.springcore.diconfig;

import org.pjay.springcore.bean.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vijay
 *
 */
@Configuration
@ComponentScan(value={"org.pjay.springcore.dependantbean"})
// @ComponentScan("org.pjay.springcore.dependantbean")
public class EmailApplicationDIConfig {
	
	@Bean
	public EmailService getEmailService(){
		return new EmailService();
	}

}
