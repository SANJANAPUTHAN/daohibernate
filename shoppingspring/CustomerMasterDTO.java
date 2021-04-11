package shoppingspring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class CustomerMasterDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomerMasterDTO() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private int customerno;
	
	@Column(name="customername",nullable=false)
	private String customername;
	
	@Column(name="customerAddress",nullable=false)
	private String customerAddress;
	
	@Column(name="customerEmail",nullable=false)
	private String customerEmail;
	
	@Column(name="customerphone",nullable=false)
	private String customerphone;
	
	
	public CustomerMasterDTO(int customerno, String customername, String customerAddress, String customerEmail,
			String customerphone) {
		this.customerno = customerno;
		this.customername = customername;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerphone = customerphone;
	}
	
	@Override
	public String toString() {
		return "CustomerMasterDTO [customerno=" + customerno + ", customerAddress=" + customerAddress
				+ ", customerEmail=" + customerEmail + ", customerphone=" + customerphone + "]";
	}
	
	public int getCustomerno() {
		return customerno;
	}
	public void setCustomerno(int customerno) {
		this.customerno = customerno;
	}
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	
	
	
}
