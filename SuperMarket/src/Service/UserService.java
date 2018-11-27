package Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import DTO.UserInquiryDTO;
import DTO.UserResponseDTO;
import Model.Stock;
import Model.T_User;
import Model.UserRole;


public class UserService implements IUserService{

	@Override
	public T_User createUser(T_User user) {
		
		
		  
			    EntityManagerFactory emfactory=CommonService.createEntityManagerFactory();
				
				EntityManager entitymanager = emfactory.createEntityManager( );
				entitymanager.getTransaction( ).begin( );
				
				entitymanager.persist(user);
				
				entitymanager.getTransaction().commit();
				entitymanager.close();
				emfactory.close();
				
			    return user;
		
	}

	@Override
	public T_User updateUser(T_User user) {
		
		return null;
	}

	@Override
	public UserResponseDTO inquireUser(UserInquiryDTO userInquiryDTO) {
		    EntityManagerFactory emfactory=CommonService.createEntityManagerFactory();
		    
		    EntityManager entitymanager = emfactory.createEntityManager( );
			entitymanager.getTransaction( ).begin( );
			
			UserResponseDTO userResponseDTO=new UserResponseDTO();
			
			String query="Select tuser from T_User tuser";
			if(userInquiryDTO.getUserName()!=null){
				query="Select tuser from T_User tuser where tuser.userName = :name";
			}
			else if(userInquiryDTO.getRoleName()!=null){
				query="Select tuser from T_User tuser where tuser.roleName = :roleName";
			}
			
			Query query1=entitymanager.createQuery(query);
			
			
			if(userInquiryDTO.getUserName()!=null){
				query1.setParameter("userName", userInquiryDTO.getUserName());
			}
			else if(userInquiryDTO.getRoleName()!=null){
			    query1.setParameter("roleName", userInquiryDTO.getRoleName());
			}
			
			List<T_User> userList=query1.getResultList();
			userResponseDTO.setUserList(userList);
			
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
						
			return userResponseDTO;
			
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
