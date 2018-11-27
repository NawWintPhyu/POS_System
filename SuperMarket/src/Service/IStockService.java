package Service;

import DTO.StockInquiryDTO;
import DTO.StockResponseDTO;
import Model.Stock;

public interface IStockService {
	public Stock createStock(Stock stock);
	public Stock updateStock(Stock stock);
	public StockResponseDTO inquireStock(StockInquiryDTO stockInquiryDTO);
	
}