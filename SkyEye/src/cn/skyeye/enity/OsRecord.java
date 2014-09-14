package cn.skyeye.enity;

import java.sql.Date;

public class OsRecord {
	private String osRid;
	private int processnum;
	private String osname;
	private String kernel;
	private String systemUptime;
	private String hostname;
	private Float diskUserate;
	private Float diskIo;
	private Float cpuUserate;
	private Float memUserate;
	private String ethSpeed;
	private String sensorlist;
	private String load;
	private long time;
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getOsRid() {
		return osRid;
	}
	public void setOsRid(String osRid) {
		this.osRid = osRid;
	}
	public int getProcessnum() {
		return processnum;
	}
	public void setProcessnum(int processnum) {
		this.processnum = processnum;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public String getKernel() {
		return kernel;
	}
	public void setKernel(String kernel) {
		this.kernel = kernel;
	}
	public String getSystemUptime() {
		return systemUptime;
	}
	public void setSystemUptime(String systemUptime) {
		this.systemUptime = systemUptime;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public Float getDiskUserate() {
		return diskUserate;
	}
	public void setDiskUserate(Float diskUserate) {
		this.diskUserate = diskUserate;
	}
	public Float getDiskIo() {
		return diskIo;
	}
	public void setDiskIo(Float diskIo) {
		this.diskIo = diskIo;
	}
	public Float getCpuUserate() {
		return cpuUserate;
	}
	public void setCpuUserate(Float cpuUserate) {
		this.cpuUserate = cpuUserate;
	}
	public Float getMemUserate() {
		return memUserate;
	}
	public void setMemUserate(Float memUserate) {
		this.memUserate = memUserate;
	}
	public String getEthSpeed() {
		return ethSpeed;
	}
	public void setEthSpeed(String ethSpeed) {
		this.ethSpeed = ethSpeed;
	}
	public String getSensorlist() {
		return sensorlist;
	}
	public void setSensorlist(String sensorlist) {
		this.sensorlist = sensorlist;
	}
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}

	
	
	
	
	

}
