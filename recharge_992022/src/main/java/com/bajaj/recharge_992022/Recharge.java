package com.bajaj.recharge_992022;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // represent a table in rest application
public class Recharge {
	@Id
	private String pno;//primary key
	private int price;
	
	public Recharge() {
	}
	
	public Recharge(String pno, int price) {
		super();
		this.pno = pno;
		this.price = price;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Recharge [pno=" + pno + ", price=" + price + "]";
	}
}
