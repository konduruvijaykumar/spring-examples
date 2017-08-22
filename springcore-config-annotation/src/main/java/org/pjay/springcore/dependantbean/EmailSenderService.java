/**
 * 
 */
package org.pjay.springcore.dependantbean;

import org.pjay.springcore.bean.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Vijay
 *
 */
//@Component
//@Component("mybean")
@Component(value="mybean")
public class EmailSenderService {
	
	@Autowired
	private EmailService emailService;

	/**
	 * @param emailService the emailService to set
	 */
	//@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	/**
	 * @return the emailService
	 */
	public EmailService getEmailService() {
		return emailService;
	}

	public void processEmail(String email, String message){
		emailService.sendMail(email, message);
	}
}
