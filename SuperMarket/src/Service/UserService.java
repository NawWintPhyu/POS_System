package Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import DTO.UserInquiryDTO;
import DTO.UserResponseDTO;
import Model.User;
import Model.UserRole;

public class UserService implements IUserService{

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponseDTO inquireUser(UserInquiryDTO userInquiryDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole createUserRole(UserRole userRole) {
EntityManagerFactory emfactory=CommonService.createEntityManagerFactory();
		
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		entitymanager.persist(userRole);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
		
		return userRole;
	}
	
	
}
