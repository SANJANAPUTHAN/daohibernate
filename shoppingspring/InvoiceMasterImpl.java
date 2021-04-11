package shoppingspring;

import java.util.List;

import org.hibernate.Session;

import utility.HibernateUtility;

public class InvoiceMasterImpl implements InvoiceMasterDAO {

	@Override
	public int insertInvoice(InvoiceMasterDTO invMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.save(invMasterDTO);
		HibernateUtility.closeSession(null);
		return 0;
	}

	@Override
	public void deleteInvoice(int invno) {
		Session session=HibernateUtility.getSession();
		InvoiceMasterDTO invoicedto=getInvoiceMaster(invno);
		session.delete(invoicedto);
		HibernateUtility.closeSession(null);
		
	}

	@Override
	public void updateInvoice(InvoiceMasterDTO invMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.update(invMasterDTO);
		HibernateUtility.closeSession(null);
		
	}

	@Override
	public InvoiceMasterDTO getInvoiceMaster(int invno) {
		Session session=HibernateUtility.getSession();
		InvoiceMasterDTO invoicedto=(InvoiceMasterDTO) session.get(InvoiceMasterDTO.class, invno);
        return invoicedto; 
	}

	@Override
	public List<InvoiceMasterDTO> getInvoiceMasterAll() {
		@SuppressWarnings("unchecked")
		Session session=HibernateUtility.getSession();
		List<InvoiceMasterDTO> list=session.createQuery("from InvoiceMasterDTO").list();
		HibernateUtility.closeSession(null);
		return list;
	}

}
