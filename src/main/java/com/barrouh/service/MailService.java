package com.barrouh.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.barrouh.domain.Contact;

public class MailService {

	private String host = "smtp.gmail.com";

	private String port = "8080";

	private Session mailSession;

	private MimeMessage emailMessage;

	private Properties emailProperties;

	private String to = "mohamed.barrouh@gmail.com";

	final static Logger LOGGER = LogManager.getLogger(MailService.class);

	public void setMailServerProperties() {
			emailProperties = System.getProperties();
			emailProperties.setProperty("mail.smtp.host", host);
			emailProperties.setProperty("mail.smtp.port", port);
			emailProperties.setProperty("mail.smtp.auth", "true");
			emailProperties.setProperty("mail.smtp.starttls.enable", "true");
	}

	public void createEmailMessage(Contact contact) {
		try {
			mailSession = Session.getDefaultInstance(emailProperties, null);
			emailMessage = new MimeMessage(mailSession);
			emailMessage.setFrom(new InternetAddress(contact.getEmail()));
			emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			emailMessage.setSubject(contact.getFullName());
			emailMessage.setContent(contact.getMessage(), "text/html");
		} catch (AddressException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (MessagingException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	public void sendMail(Contact contact) {
		try {

			setMailServerProperties();

			createEmailMessage(contact);

			String fromUser = "your emailid here";

			String fromUserPassword = "your email password here";

			Transport transport = mailSession.getTransport("smtp");

			transport.connect(host, fromUser, fromUserPassword);

			transport.sendMessage(emailMessage, emailMessage.getAllRecipients());

			transport.close();

			LOGGER.info("Sent message successfully");

		} catch (MessagingException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
