package Service;

import DTO.UserInquiryDTO;
import DTO.UserResponseDTO;
import Model.User;
import Model.UserRole;

public interface IUserService {
	
	public User createUser(User user);
	public User updateUser(User user);
	public UserResponseDTO inquireUser(UserInquiryDTO  userInquiryDTO);
	public UserRole createUserRole(UserRole userRole);


}
