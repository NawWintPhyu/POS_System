package Service;
import java.io.*;

import Model.UserRole;
public class CreateUserRole {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Role Name");
		UserRole userRole=new UserRole();
		userRole.setRoleName(br.readLine().toString());
		
		IUserService iUserService=new UserService();
		userRole=iUserService.createUserRole(userRole);
	}

}
