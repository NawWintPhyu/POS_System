package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvoiceItem {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long invoiceItemId;
private long stockId;
private String stockName;
private String codeNo;
private int quantity;
private double unitCost;
private double price;
private String Description;

public long getInvoiceItemId() {
	return invoiceItemId;
}
public void setInvoiceItemId(long invoiceItemId) {
	this.invoiceItemId = invoiceItemId;
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
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public String getCodeNo() {
	return codeNo;
}
public void setCodeNo(String codeNo) {
	this.codeNo = codeNo;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getUnitCost() {
	return unitCost;
}
public void setUnitCost(double unitCost) {
	this.unitCost = unitCost;
}
public double getPrice() {
	return price;
}
public void setPrice(double d) {
	this.price = d;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}





}
