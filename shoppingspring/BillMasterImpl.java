package shoppingspring;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;

import utility.HibernateUtility;

@Entity
public class BillMasterImpl implements BillMasterDAO
{
	
	@Override
	public int insertBill(BillMasterDTO billMasterDTO) 
	{
		Session session=HibernateUtility.getSession();
		session.save(billMasterDTO);
		HibernateUtility.closeSession(null);
		return 0;
	}

	@Override
	public void deleteBill(int itemno) {
		Session session=HibernateUtility.getSession();
		BillMasterDTO billdto=getBillMaster(itemno);
		System.out.println(billdto.toString());
		session.delete(billdto);
		HibernateUtility.closeSession(null);
	}

	@Override
	public void updateBill(BillMasterDTO billMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.update(billMasterDTO);
		HibernateUtility.closeSession(null);
	}

	@Override
	public BillMasterDTO getBillMaster(int itemno) {
		Session session=HibernateUtility.getSession();
		BillMasterDTO billdto =(BillMasterDTO) session.get(BillMasterDTO.class, itemno);
        return billdto; 
	}

	@Override
	public List<BillMasterDTO> getBillMasterAll() {
		@SuppressWarnings("unchecked")
		Session session=HibernateUtility.getSession();
		List<BillMasterDTO> list=session.createQuery("from bill").list();
		HibernateUtility.closeSession(null);
		return list;
	}
	
	
	

}
