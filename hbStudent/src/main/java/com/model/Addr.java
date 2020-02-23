package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Addr {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int aid;
@Column
String cty;
@Column
String st;
@Column
String cntry;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getCty() {
	return cty;
}
public void setCty(String cty) {
	this.cty = cty;
}
public String getSt() {
	return st;
}
public void setSt(String st) {
	this.st = st;
}
public String getCntry() {
	return cntry;
}
public void setCntry(String cntry) {
	this.cntry = cntry;
}

}
