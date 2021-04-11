package shoppingspring;

import java.util.List;

public interface ItemMasterDAO {
	public int insertItem(ItemMasterDTO itemMasterDTO);
	public void deleteItem(int itemno);
	public void updateItem(ItemMasterDTO itemMasterDTO);
	public ItemMasterDTO getItemMaster(int itemno);
	public List<ItemMasterDTO> getItemMasterAll();
}
