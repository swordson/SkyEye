package cn.skyeye.enity;

import java.util.Set;

public class MysqlInfo {
	private String mid;
	private String ip;
	private String musername;
	private String mpassword;
	private int port;
	private Set<MysqlRecord> mysqlRecordSet;
	public Set<MysqlRecord> getMysqlRecordSet() {
		return mysqlRecordSet;
	}
	public void setMysqlRecordSet(Set<MysqlRecord> mysqlRecordSet) {
		this.mysqlRecordSet = mysqlRecordSet;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMusername() {
		return musername;
	}
	public void setMusername(String musername) {
		this.musername = musername;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

}
