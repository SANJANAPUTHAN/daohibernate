package shoppingspring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="bill")
@Table(name="bill")
public class BillMasterDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BillMasterDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private int invno;
	@Id
	private int itemno;
	
	@Column(name="itemquantity",nullable=false)
	private int itemquantity;
	
	
	public BillMasterDTO(int invno, int itemno, int itemquantity) {
		this.invno = invno;
		this.itemno = itemno;
		this.itemquantity = itemquantity;
	}
	@Override
	public String toString() {
		return "BillMasterDTO [invno=" + invno + ", itemno=" + itemno + ", itemquantity=" + itemquantity + "]";
	}
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public int getItemquantity() {
		return itemquantity;
	}
	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}
	
	
	
	
	
}
