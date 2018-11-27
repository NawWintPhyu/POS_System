package DTO;

import java.util.List;

import Model.T_User;

public class UserResponseDTO {
	
	public List<T_User> userList;

	public List<T_User> getUserList() {
		return userList;
	}

	public void setUserList(List<T_User> userList) {
		this.userList = userList;
	}
	

	
}
