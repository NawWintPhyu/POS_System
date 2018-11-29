package DTO;

import java.util.List;

public class InvoiceDTO {
	private double totalAmount;
	private double paidAmount;
	private double changeAmount;
	private int totalQuantity;
	private List<InvoiceItemDTO> invoiceItemDTO;
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getChangeAmount() {
		return changeAmount;
	}
	public void setChangeAmount(double changeAmount) {
		this.changeAmount = changeAmount;
	}

	
	
	public List<InvoiceItemDTO> getInvoiceItemDTO() {
		return invoiceItemDTO;
	}
	public void setInvoiceItemDTO(List<InvoiceItemDTO> invoiceItemDTO) {
		this.invoiceItemDTO = invoiceItemDTO;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	@Override
	public String toString() {
		return "InvoiceDTO [totalAmount=" + totalAmount + ", paidAmount=" + paidAmount + ", changeAmount="
				+ changeAmount + ", invoiceItemDTO=" + invoiceItemDTO + "]";
	}
	
	

}
