package com.barrouh.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.barrouh.domain.Contact;
import com.barrouh.domain.MailException;
import com.barrouh.domain.Settings;

@Service
public class MailService {

	private String host;

	private String port;

	private MimeMessage emailMessage;

	private Properties emailProperties;

	private String to;

	private String fromUser;

	private String fromUserPassword;

	private String emailTemplatePath;

	static final Logger LOGGER = LogManager.getLogger(MailService.class);

	public MailService(Settings settings) {
		if (settings.isMailSettingsValid()) {
			this.host = settings.getMailHost();
			this.port = settings.getMailPort();
			this.to = settings.getMailTo();
			this.fromUser = settings.getMailFromUser();
			this.fromUserPassword = settings.getMailFromUserPassword();
			this.emailTemplatePath = settings.getEmailTemplatePath();
		} else {
			LOGGER.error("MailService Settings is null or not valid .");
			throw new NullPointerException();
		}
	}

	private void setMailServerProperties() {
		emailProperties = new Properties();
		emailProperties.setProperty("mail.smtp.host", host);
		emailProperties.setProperty("mail.smtp.port", port);
		emailProperties.setProperty("mail.smtp.auth", "true");
		emailProperties.setProperty("mail.smtp.socketFactory.port", port);
		emailProperties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		emailProperties.setProperty("mail.smtp.starttls.enable", "false");
	}

	private void createEmailMessage(Contact contact) {
		Session mailSession;

		try {
			mailSession = Session.getInstance(emailProperties, new javax.mail.Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromUser, fromUserPassword);
				}
			});

			emailMessage = new MimeMessage(mailSession);
			emailMessage.setFrom(new InternetAddress(contact.getEmail()));
			emailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(contact.getEmail()));
			emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			emailMessage.setSubject("New Email received from : " + contact.getFullName());

			MimeMultipart multipart = new MimeMultipart("related");
			String[] args = { contact.getFullName(), contact.getMessage() };
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(buildEmail(args), "text/html");
			multipart.addBodyPart(messageBodyPart);

			emailMessage.setContent(multipart);

		} catch (MessagingException | IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	public void sendMail(Contact contact) throws MailException {
		if (contact != null) {
			try {
				setMailServerProperties();
				createEmailMessage(contact);
				Transport.send(emailMessage);
				LOGGER.info("Sent message successfully");
			} catch (MessagingException e) {
				LOGGER.error(e.getMessage(), e);
				throw new MailException(e.getMessage());
			}
		} else {
			LOGGER.warn("Contact object is null !!!");
		}
	}

	private String buildEmail(Object[] values) throws IOException {
		String result = "";
		String msg = new String(Files.readAllBytes(Paths.get(emailTemplatePath + "email.html")));

		if (values != null && values.length > 0) {
			result = MessageFormat.format(msg, values);
		} else if (values == null) {
			result = "";
		}
		return result;
	}

}