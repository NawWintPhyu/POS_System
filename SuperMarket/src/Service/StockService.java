package Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import DTO.StockInquiryDTO;
import DTO.StockResponseDTO;
import Model.Stock;

public class StockService implements IStockService{
	@Override
	public Stock createStock(Stock stock) {
		EntityManagerFactory entityManagerFactory=CommonService.createEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager( );
		entityManager.getTransaction( ).begin( );
		
		entityManager.persist(stock);
		
		entityManager.getTransaction( ).commit( );
		entityManager.close( );
		entityManagerFactory.close( );
		return stock;
	}

	@Override
	public Stock updateStock(Stock stock) {
		
		return null;
	}

	@Override
	public StockResponseDTO inquireStock(StockInquiryDTO stockInquiryDTO) {
		
		return null;
	}

}
