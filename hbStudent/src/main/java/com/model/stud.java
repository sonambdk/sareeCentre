package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class stud {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int sid;
@Column
String snm;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "aid")
Addr saddr;

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSnm() {
	return snm;
}
public void setSnm(String snm) {
	this.snm = snm;
}
public Addr getSaddr() {
	return saddr;
}
public void setSaddr(Addr saddr) {
	this.saddr = saddr;
}


}
