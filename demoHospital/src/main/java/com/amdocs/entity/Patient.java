package com.amdocs.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	
	@Id
	private int id;
	private String name;
	private String address;
	public Patient() {
		super();
		
	}
	public Patient(int pid, String pname, String address) {
		super();
		this.id = pid;
		this.name = pname;
		this.address = address;
	}
	public int getPid() {
		return id;
	}
	public void setPid(int pid) {
		this.id = pid;
	}
	public String getPname() {
		return name;
	}
	public void setPname(String pname) {
		this.name = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + id + ", pname=" + name + ", address=" + address + "]";
	}
	
}
