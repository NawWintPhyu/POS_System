package Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.InvoiceItemDTO;
import DTO.InvoiceResponseDTO;
import Model.Invoice;
import Model.InvoiceItem;
import Model.Stock;

public class InvoiceService implements I_InvoiceService {

	@Override
	public Invoice createInvoice(Invoice invoice) {
		EntityManagerFactory entityManagerFactory = CommonService.createEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return invoice;
	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceItem createInvoiceItem(InvoiceItem invoiceItem) {
		EntityManagerFactory entityManagerFactory = CommonService.createEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return invoiceItem;
	}

	@Override
	public InvoiceItem updateInvoiceItem(InvoiceItem invoiceItem) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
