package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table

public class Stock {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stockID;
	private String stockName;
	private String codeNo;
	private String category;
	private int quantity;
	private long price;
	private String description;
	private int status;
	private int userID;
	private Date expiredDate;
	
//	@ManyToOne
//	private User user;
	
	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
		this.stockID = stockID;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", stockName=" + stockName + ", codeNo=" + codeNo + ", category="
				+ category + ", quantity=" + quantity + ", price=" + price + ", description=" + description
				+ ", status=" + status + ", userID=" + userID + "]";
	}
	
	
	
	
}

