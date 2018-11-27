package Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import DTO.StockInquiryDTO;
import DTO.StockResponseDTO;
import Model.Stock;

public class StockService implements IStockService {
	@Override
	public Stock createStock(Stock stock) {
		EntityManagerFactory entityManagerFactory = CommonService.createEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(stock);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return stock;
	}

	@Override
	public Stock updateStock(Stock stock) {
		EntityManagerFactory entityManagerFactory = CommonService.createEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Stock updateStock=entityManager.find(Stock.class, stock.getStockID());
		updateStock.setCodeNo(stock.getCodeNo());
		updateStock.setCategory(stock.getCategory());
		updateStock.setPrice(stock.getPrice());
		updateStock.setQuantity(stock.getQuantity());
		updateStock.setDescription(stock.getDescription());
		entityManager.getTransaction( ).commit( );
		entityManager.close( );
		entityManagerFactory.close( );
		return stock;
	}

	@Override
	public StockResponseDTO inquireStock(StockInquiryDTO stockInquiryDTO) {
		StockResponseDTO stockResponseDTO = new StockResponseDTO();
		EntityManagerFactory entityManagerFactory = CommonService.createEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		String q = "Select s from Stock s";
		if(stockInquiryDTO.getStockID()!=0){
			q = "Select s from Stock s where s.stockID = :stockID";
		}
		else if (stockInquiryDTO.getStockName() != null) {
			q = "Select s from Stock s where s.stockName = :name";

		} else if (stockInquiryDTO.getCodeNo() != null) {
			q = "Select s from Stock s where s.codeNo = :codeNo";
		} else if (stockInquiryDTO.getMaxPrice() != 0 && stockInquiryDTO.getMinPrice() != 0) {
			q = "Select s from Stock s where s.price between :min and :max";
		}
		

		Query query = entityManager.createQuery(q);
		
		
		if(stockInquiryDTO.getStockID()!=0){
			query.setParameter("stockID", stockInquiryDTO.getStockID());
		}
		else if (stockInquiryDTO.getStockName() != null) {
			query.setParameter("name", stockInquiryDTO.getStockName());
		} else if (stockInquiryDTO.getCodeNo() != null) {
			query.setParameter("codeNo", stockInquiryDTO.getCodeNo());
		} else if (stockInquiryDTO.getMaxPrice() != 0 && stockInquiryDTO.getMinPrice() != 0) {
			query.setParameter("min", stockInquiryDTO.getMinPrice());
			query.setParameter("max", stockInquiryDTO.getMaxPrice());
		}
		
		List<Stock> stockList = query.getResultList();
		stockResponseDTO.setStockList(stockList);
		stockResponseDTO.setTotalPrice(0);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return stockResponseDTO;

	}

}
