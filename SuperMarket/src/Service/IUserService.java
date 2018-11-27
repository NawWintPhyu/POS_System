package Service;

import DTO.UserInquiryDTO;
import DTO.UserResponseDTO;
import Model.T_User;
import Model.UserRole;

public interface IUserService {
	
	public T_User createUser(T_User user);
	public T_User updateUser(T_User user);
	public UserResponseDTO inquireUser(UserInquiryDTO  userInquiryDTO);
	public UserRole createUserRole(UserRole userRole);


}
