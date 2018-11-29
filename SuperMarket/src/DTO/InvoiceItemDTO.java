package DTO;

public class InvoiceItemDTO {
	private long invoiceId;
	private long stockId;
	private String stockName;
	private String codeNo;
	private double price;
	private int quantity;
	private double total;
	public long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public long getInvoiceId(long invoiceId)
	{
		return invoiceId;
	}
	public long getStockId() {
		return stockId;
	}
	public void setStockId(long stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String string) {
		this.stockName = string;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	@Override
	public String toString() {
		return "InvoiceItemDTO [invoiceId=" + invoiceId + ", stockId=" + stockId + ", stockName=" + stockName
				+ ", codeNo=" + codeNo + ", price=" + price + ", quantity=" + quantity + ", total=" + total + "]";
	}
	
	

}
