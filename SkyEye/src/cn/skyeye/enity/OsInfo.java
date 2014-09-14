package cn.skyeye.enity;
import java.util.Set;
import cn.skyeye.enity.OsRecord;

public class OsInfo {
	private String oid;
	private String snmpUsername;
	private String snmpPassword;
	private String ipmiIp;
	private String ipmiUsername;
	private String ipmiPassword;
	private String sshUSername;
	private String sshPassword;
	private String eth0;
	private String eth1;
	private String eth2;
	private String eth3;
	private Boolean isOn;
	private int freequency;
	private Set<Alarm> alarmSet;
	public Set<Alarm> getAlarmSet() {
		return alarmSet;
	}
	public void setAlarmSet(Set<Alarm> alarmSet) {
		this.alarmSet = alarmSet;
	}
	public int getFreequency() {
		return freequency;
	}
	public void setFreequency(int freequency) {
		this.freequency = freequency;
	}
	private Set<OsRecord> osRecordSet;
	public Set<OsRecord> getOsRecordSet() {
		return osRecordSet;
	}
	public void setOsRecordSet(Set<OsRecord> osRecordSet) {
		this.osRecordSet = osRecordSet;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getSnmpUsername() {
		return snmpUsername;
	}
	public void setSnmpUsername(String snmpUsername) {
		this.snmpUsername = snmpUsername;
	}
	public String getSnmpPassword() {
		return snmpPassword;
	}
	public void setSnmpPassword(String snmpPassword) {
		this.snmpPassword = snmpPassword;
	}
	public String getIpmiIp() {
		return ipmiIp;
	}
	public void setIpmiIp(String ipmiIp) {
		this.ipmiIp = ipmiIp;
	}
	public String getIpmiUsername() {
		return ipmiUsername;
	}
	public void setIpmiUsername(String ipmiUsername) {
		this.ipmiUsername = ipmiUsername;
	}
	public String getIpmiPassword() {
		return ipmiPassword;
	}
	public void setIpmiPassword(String ipmiPassword) {
		this.ipmiPassword = ipmiPassword;
	}
	public String getSshUSername() {
		return sshUSername;
	}
	public void setSshUSername(String sshUSername) {
		this.sshUSername = sshUSername;
	}
	public String getSshPassword() {
		return sshPassword;
	}
	public void setSshPassword(String sshPassword) {
		this.sshPassword = sshPassword;
	}
	public String getEth0() {
		return eth0;
	}
	public void setEth0(String eth0) {
		this.eth0 = eth0;
	}
	public String getEth1() {
		return eth1;
	}
	public void setEth1(String eth1) {
		this.eth1 = eth1;
	}
	public String getEth2() {
		return eth2;
	}
	public void setEth2(String eth2) {
		this.eth2 = eth2;
	}
	public String getEth3() {
		return eth3;
	}
	public void setEth3(String eth3) {
		this.eth3 = eth3;
	}
	public Boolean getIsOn() {
		return isOn;
	}
	public void setIsOn(Boolean isOn) {
		this.isOn = isOn;
	}
	

}
