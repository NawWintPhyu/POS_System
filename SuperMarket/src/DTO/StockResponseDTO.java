package DTO;

import java.util.List;

import Model.Stock;

public class StockResponseDTO {
	private List<Stock> stockList;
	private long totalPrice;
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stock) {
		this.stockList = stock;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
