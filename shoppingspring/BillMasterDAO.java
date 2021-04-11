package shoppingspring;

import java.util.List;

public interface BillMasterDAO {
	public int insertBill(BillMasterDTO billMasterDTO);
	public void deleteBill(int itemno);
	public void updateBill(BillMasterDTO billMasterDTO);
	public BillMasterDTO getBillMaster(int itemno);
	public List<BillMasterDTO> getBillMasterAll();
}
