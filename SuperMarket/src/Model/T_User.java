package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class T_User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	private int roleID;
	private String userName;
	private int phoneNumber;
	private String email;
	private String address;
	private String password;
	private String nrc;
	
	
	public T_User(int userID,int roleID,String userName,int phoneNumber,String email,String address,String password){
		super();
		this.userID=userID;
		this.roleID=roleID;
		this.userName=userName;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.address=address;
		this.password=password;
	
		
	}
	
	public T_User(){
		super();
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getRoleID() {
		return roleID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
