package shoppingspring;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;

import utility.HibernateUtility;

@Entity
public class CustomerMasterImpl implements CustomerMasterDAO,Serializable{

	@Override
	public int insertCustomer(CustomerMasterDTO customerMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.save(customerMasterDTO);
		HibernateUtility.closeSession(null);
		return 0;
	}

	@Override
	public void deleteCustomer(int customerno) {
		Session session=HibernateUtility.getSession();
		CustomerMasterDTO customerdto=getCustomerMaster(customerno);
		System.out.println(customerdto.toString());
		session.delete(customerdto);
		HibernateUtility.closeSession(null);
		
	}

	@Override
	public void updateCustomer(CustomerMasterDTO customerMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.update(customerMasterDTO);
		HibernateUtility.closeSession(null);
		
	}

	@Override
	public CustomerMasterDTO getCustomerMaster(int customerno) {
		Session session=HibernateUtility.getSession();
		CustomerMasterDTO customer=(CustomerMasterDTO) session.get(CustomerMasterDTO.class, customerno);
        return customer; 
	}

	@Override
	public List<CustomerMasterDTO> getCustomerMasterAll() {
		@SuppressWarnings("unchecked")
		Session session=HibernateUtility.getSession();
		List<CustomerMasterDTO> list=session.createQuery("from CustomerMasterDTO").list();
		HibernateUtility.closeSession(null);
		return list;
	}

}
