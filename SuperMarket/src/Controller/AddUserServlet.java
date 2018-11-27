package Controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.T_User;
import Service.IUserService;
import Service.UserService;


@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/View/AddUser.jsp").forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		int roleID = 0;
		String userName=request.getParameter("addText1");
		int phoneNumber=Integer.parseInt(request.getParameter("addText2"));
		String email=request.getParameter("addText3");
		String address=request.getParameter("addText4");
		String password=request.getParameter("addText5");
		String retypePassword=request.getParameter("addText6");
		if(password.equals(retypePassword)){
			String  userType=request.getParameter("radioBtn");
			
			switch (userType) {
			
	    	case "admin":
	    	roleID=1;	
			break;
			
			case "manager":
			roleID=51;
			break;
			
			case "salePerson":
			roleID=101;
			break;
			
			}
			
			T_User user=new T_User();
			user.setUserName(userName);
			user.setPhoneNumber(phoneNumber);
			user.setEmail(email);
			user.setAddress(address);
			user.setPassword(password);
			user.setRoleID(roleID);
			
			IUserService iUserService=new UserService();
			user=iUserService.createUser(user);
			
			
		}
		else{
			
			
			
		}
		request.getRequestDispatcher("/View/AddUser.jsp").forward(request, response);
		
	}

}
