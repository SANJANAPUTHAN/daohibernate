package shoppingspring;

import java.util.List;

public interface InvoiceMasterDAO {
	public int insertInvoice(InvoiceMasterDTO invMasterDTO);
	public void deleteInvoice(int invno);
	public void updateInvoice(InvoiceMasterDTO invMasterDTO);
	public InvoiceMasterDTO getInvoiceMaster(int invno);
	public List<InvoiceMasterDTO> getInvoiceMasterAll();
	
}
