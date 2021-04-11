package shoppingspring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemMasterDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ItemMasterDTO() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int itemno;
	
	@Column(name="itemname",nullable=false)
	private String itemname;
	
	@Column(name="itemprice",nullable=false)
	private float itemprice;
	
	@Column(name="itemunit",nullable=false)
	private String itemunit;
	public int getItemno() {
		return itemno;
	}
	
	
	public ItemMasterDTO(int itemno, String itemname, float itemprice, String itemunit) {
		super();
		this.itemno = itemno;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemunit = itemunit;
	}


	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public float getItemprice() {
		return itemprice;
	}
	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	public String getItemunit() {
		return itemunit;
	}
	public void setItemunit(String itemunit) {
		this.itemunit = itemunit;
	}
	@Override
	public String toString() {
		return itemno+" "+itemname+" "+itemprice+" "+itemunit;
	}
	
	
}
