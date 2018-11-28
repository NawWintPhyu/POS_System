package Service;

import java.util.List;

import DTO.InvoiceItemDTO;
import DTO.InvoiceResponseDTO;
import Model.Invoice;
import Model.InvoiceItem;

public interface I_InvoiceService {
 public Invoice createInvoice(Invoice invoice);
 public Invoice updateInvoice(Invoice invoice);
 public InvoiceItem createInvoiceItem(InvoiceItem invoiceItem);
 public InvoiceItem updateInvoiceItem(InvoiceItem invoiceItem); 
}
