

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // represent a table in rest app
public class Recharge {
	@Id
	private Integer pno;//primary key
	private float price;
	
	public Recharge() {
	}
	
	public Recharge(Integer pno, float price) {
		super();
		this.pno = pno;
		this.price = price;
	}
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Recharge [pno=" + pno + ", price=" + price + "]";
	}
}
