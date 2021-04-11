package shoppingspring;

import java.time.LocalDate;
import java.util.List;

public class test
{
	
	public static void main(String[] args) {
		
		//BillMasterDTO bill=new BillMasterDTO(101,200,10000);
//		
//		BillMasterImpl b=new BillMasterImpl();
//		b.insertBill(bill);
//		List<BillMasterDTO> list=b.getBillMasterAll();
//		for(BillMasterDTO bill1:list)
//		{
//			System.out.println(bill1.toString());
//		}
		//b.deleteBill(200);
//		CustomerMasterDTO dto=new CustomerMasterDTO();
//		dto.setCustomerno(21);
//		dto.setCustomername("sanjana");
//		dto.setCustomerAddress("kuniyamuthur");
//		dto.setCustomerEmail("sanjanaps@gmail.com");
//		dto.setCustomerphone("9943111574");
//		
//		CustomerMasterImpl impl=new CustomerMasterImpl();
		//impl.insertCustomer(dto);
		//impl.updateCustomer(dto);
		//impl.deleteCustomer(21);
		//CustomerMasterDTO customer=impl.getCustomerMaster(21);
		//System.out.println(customer.toString());
//		List<CustomerMasterDTO> list=impl.getCustomerMasterAll();
//		for(CustomerMasterDTO customer:list)
//		{
//			System.out.println(customer.toString());
//		}
//		
//		InvoiceMasterDTO invoice=new InvoiceMasterDTO(101, LocalDate.now().plusDays(2), 21);
//		InvoiceMasterImpl impl=new InvoiceMasterImpl();
		//impl.insertInvoice(invoice);
		//impl.updateInvoice(invoice);
		//impl.deleteInvoice(101);
//		InvoiceMasterDTO inv=impl.getInvoiceMaster(101);
//		System.out.println(inv.toString());
//		List<InvoiceMasterDTO> list=impl.getInvoiceMasterAll();
//		for(InvoiceMasterDTO inv:list)
//		{
//			System.out.println(inv.toString());
//		}
		
		ItemMasterDTO item=new ItemMasterDTO(1, "soap", 300, "gms");
		ItemMasterImpl impl=new ItemMasterImpl();
		//impl.insertItem(item);
		//impl.updateItem(item);
		//impl.deleteItem(1);
//		ItemMasterDTO i=impl.getItemMaster(1);
//		System.out.println(i.toString());
		
		List<ItemMasterDTO> list=impl.getItemMasterAll();
		for(ItemMasterDTO i:list)
		{
			System.out.println(i.toString());
		}
	}

}
