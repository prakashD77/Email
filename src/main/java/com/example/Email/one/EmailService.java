package com.example.Email.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;

	public String sendmail(String toemail, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("prakashdevagalla@gmail.com");
		message.setTo(toemail);
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		System.out.println("mail sent succesfully");
		return "Success";
	}
}
