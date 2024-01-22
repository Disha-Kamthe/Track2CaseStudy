package com.amdocs.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	private int id;
	private int patid;
	private int docid;
	private String date;
	private String time;
	public Appointment() {
		super();
		
	}
	public Appointment(int id, int patid, int docid, String date, String time) {
		super();
		this.id = id;
		this.patid = patid;
		this.docid = docid;
		this.date = date;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatid() {
		return patid;
	}
	public void setPatid(int patid) {
		this.patid = patid;
	}
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patid=" + patid + ", docid=" + docid + ", date=" + date + ", time=" + time
				+ "]";
	}
	
	
	
	

}
