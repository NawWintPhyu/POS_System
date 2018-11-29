package DTO;


import Model.T_User;

public class UserInquiryDTO {

	@Override
	public String toString() {
		return "UserInquiryDTO [userName=" + userName + ", roleName=" + roleName + ", getUserName()=" + getUserName()
				+ ", getRoleName()=" + getRoleName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private int userID;
	private int roleID;
	private String userName;
	private String roleName;
    private String password;
	
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
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

	

}
