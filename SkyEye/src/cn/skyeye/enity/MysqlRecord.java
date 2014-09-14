package cn.skyeye.enity;

import java.util.Set;

public class MysqlRecord {
	private String mRecordId;
	private int connectNum;
	private int  aliveThread;
	private Float sendSpeed;
	private Float receiveSpeed;
	private int perSearch;
	private int perTransaction;
	private long time;
	public String getmRecordId() {
		return mRecordId;
	}
	public void setmRecordId(String mRecordId) {
		this.mRecordId = mRecordId;
	}
	public int getConnectNum() {
		return connectNum;
	}
	public void setConnectNum(int connectNum) {
		this.connectNum = connectNum;
	}
	public int getAliveThread() {
		return aliveThread;
	}
	public void setAliveThread(int aliveThread) {
		this.aliveThread = aliveThread;
	}
	public Float getSendSpeed() {
		return sendSpeed;
	}
	public void setSendSpeed(Float sendSpeed) {
		this.sendSpeed = sendSpeed;
	}
	public Float getReceiveSpeed() {
		return receiveSpeed;
	}
	public void setReceiveSpeed(Float receiveSpeed) {
		this.receiveSpeed = receiveSpeed;
	}
	public int getPerSearch() {
		return perSearch;
	}
	public void setPerSearch(int perSearch) {
		this.perSearch = perSearch;
	}
	public int getPerTransaction() {
		return perTransaction;
	}
	public void setPerTransaction(int perTransaction) {
		this.perTransaction = perTransaction;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    

}
