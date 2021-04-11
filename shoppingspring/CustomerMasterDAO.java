package shoppingspring;

import java.util.List;

public interface CustomerMasterDAO {
	public int insertCustomer(CustomerMasterDTO customerMasterDTO);
	public void deleteCustomer(int customerno);
	public void updateCustomer(CustomerMasterDTO customerMasterDTO);
	public CustomerMasterDTO getCustomerMaster(int customerno);
	public List<CustomerMasterDTO> getCustomerMasterAll();
}
