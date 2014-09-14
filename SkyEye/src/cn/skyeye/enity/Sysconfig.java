package cn.skyeye.enity;

public class Sysconfig {
	private String sid;
	private Boolean isOnOs;
	private Boolean isOnMysql;
	private Boolean isOnEmail;
	private Boolean isOnAlarm;
	private String smtpUser;
	private String smptpPassword;
	private String sender;
	private String receiver;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Boolean getIsOnOs() {
		return isOnOs;
	}
	public void setIsOnOs(Boolean isOnOs) {
		this.isOnOs = isOnOs;
	}
	public Boolean getIsOnMysql() {
		return isOnMysql;
	}
	public void setIsOnMysql(Boolean isOnMysql) {
		this.isOnMysql = isOnMysql;
	}
	public Boolean getIsOnEmail() {
		return isOnEmail;
	}
	public void setIsOnEmail(Boolean isOnEmail) {
		this.isOnEmail = isOnEmail;
	}
	public Boolean getIsOnAlarm() {
		return isOnAlarm;
	}
	public void setIsOnAlarm(Boolean isOnAlarm) {
		this.isOnAlarm = isOnAlarm;
	}
	public String getSmtpUser() {
		return smtpUser;
	}
	public void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}
	public String getSmptpPassword() {
		return smptpPassword;
	}
	public void setSmptpPassword(String smptpPassword) {
		this.smptpPassword = smptpPassword;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
