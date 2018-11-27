package DTO;

public class StockInquiryDTO {
	private String stockName;
	private String codeNo;
	private long minPrice;
	private long maxPrice;
	private String userName;
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
	public long getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(long minPrice) {
		this.minPrice = minPrice;
	}
	public long getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(long maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "StockInquiryDTO [stockName=" + stockName + ", codeNo=" + codeNo + ", minPrice=" + minPrice
				+ ", maxPrice=" + maxPrice + ", userName=" + userName + "]";
	}

	
	
	
	
}
