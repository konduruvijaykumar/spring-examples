/**
 * 
 */
package org.pjay.springcore.bean;

/**
 * @author Vijay
 *
 */
public class EmailService {
	
	public void sendMail(String email, String message){
		System.out.println("Sending mail to:: " + email + "\nMessage sent is:: " + message);
	}
	
}
