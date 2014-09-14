package cn.skyeye.enity;

public class AlarmRecord {
	private String aRid;
	private String item;
	private String reason;
	private long time;
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getaRid() {
		return aRid;
	}
	public void setaRid(String aRid) {
		this.aRid = aRid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	

}
