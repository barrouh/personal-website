package com.barrouh.domain;

import com.barrouh.web.Tools;

public class Settings {

	private String smtpHost;

	private String smtpPort;

	private String smtpUser;

	private String smtpPassword;

	private String mailTo;

	private String emailTemplatePath;

	private String dataPath;

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getSmtpUser() {
		return smtpUser;
	}

	public void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}

	public String getSmtpPassword() {
		return smtpPassword;
	}

	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getEmailTemplatePath() {
		return emailTemplatePath;
	}

	public void setEmailTemplatePath(String emailTemplatePath) {
		this.emailTemplatePath = emailTemplatePath;
	}

	public String getDataPath() {
		return dataPath;
	}

	public void setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	public boolean isMailSettingsValid() {
		return Tools.isNotnull(this.smtpHost) && Tools.isNotnull(this.smtpPort) && Tools.isNotnull(this.mailTo)
				&& Tools.isNotnull(this.smtpUser) && Tools.isNotnull(this.smtpPassword);
	}
}