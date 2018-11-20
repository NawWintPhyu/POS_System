package Service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CommonService {

	public static EntityManagerFactory createEntityManagerFactory(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SuperMarket");
		return entityManagerFactory;
	}
}
