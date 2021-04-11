package shoppingspring;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import org.hibernate.Session;

import utility.HibernateUtility;

@Entity
public class ItemMasterImpl implements ItemMasterDAO{

	@Override
	public int insertItem(ItemMasterDTO itemMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.save(itemMasterDTO);
		HibernateUtility.closeSession(null);
		return 0;
	}

	@Override
	public void deleteItem(int itemno) {
		Session session=HibernateUtility.getSession();
		ItemMasterDTO itemdto=getItemMaster(itemno);
		System.out.println(itemdto.toString());
		session.delete(itemdto);
		HibernateUtility.closeSession(null);
		
	}

	@Override
	public void updateItem(ItemMasterDTO itemMasterDTO) {
		Session session=HibernateUtility.getSession();
		session.update(itemMasterDTO);
		HibernateUtility.closeSession(null);
		
	}

	@Override
	public ItemMasterDTO getItemMaster(int itemno) {
		Session session=HibernateUtility.getSession();
		ItemMasterDTO billdto =(ItemMasterDTO) session.get(ItemMasterDTO.class, itemno);
        return billdto; 
	}

	@Override
	public List<ItemMasterDTO> getItemMasterAll() {
		@SuppressWarnings("unchecked")
		Session session=HibernateUtility.getSession();
		List<ItemMasterDTO> list=session.createQuery("from ItemMasterDTO").list();
		HibernateUtility.closeSession(null);
		return list;

	}

}
