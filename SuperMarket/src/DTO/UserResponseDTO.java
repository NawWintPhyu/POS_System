package DTO;

import java.util.List;

import Model.T_User;

public class UserResponseDTO {
	
	public List<T_User> userList;
	public String userName;
	public String password;
	public int roleID;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public List<T_User> getUserList() {
		return userList;
	}

	public void setUserList(List<T_User> userList) {
		this.userList = userList;
	}
	

	
}
