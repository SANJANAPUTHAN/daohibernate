package shoppingspring;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class InvoiceMasterDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvoiceMasterDTO() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int invno;
	
	@Column(name="invdate",nullable=false)
	private LocalDate invdate;
	
	@Column(name="customerno",nullable=false)
	private int customerno;
	
	
	public InvoiceMasterDTO(int invno, LocalDate invdate, int customerno) {
		this.invno = invno;
		this.invdate = invdate;
		this.customerno = customerno;
	}
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public LocalDate getInvdate() {
		return invdate;
	}
	public void setInvdate(LocalDate invdate) {
		this.invdate = invdate;
	}
	public int getCustomerno() {
		return customerno;
	}
	public void setCustomerno(int customerno) {
		this.customerno = customerno;
	}
	@Override
	public String toString() {
		return invno+" "+invdate+" "+customerno;
	}
	
	
}
