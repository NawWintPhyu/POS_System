package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.UserInquiryDTO;
import DTO.UserResponseDTO;
import Model.T_User;
import Service.IUserService;
import Service.UserService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/View/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
	    String roleName=request.getParameter("role");
	    UserInquiryDTO userInquiryDTO=new UserInquiryDTO();
	    
	    
	    if(roleName.equals("admin")){
			userInquiryDTO.setRoleID(1);
		}
	    if(roleName.equals("manager")){
			userInquiryDTO.setRoleID(51);
		}
		if(roleName.equals("saleperson")){
			userInquiryDTO.setRoleID(101);
		}
		
		if(!userName.equals("")){
			userInquiryDTO.setUserName(userName);
		}
		if(!password.equals("")){
			userInquiryDTO.setPassword(password);
		}
		
		UserResponseDTO userResponseDTO=new UserResponseDTO();
		IUserService iUserService=new UserService();
		userResponseDTO = iUserService.inquireUser(userInquiryDTO);
		List<T_User> userList=userResponseDTO.getUserList();
		
		if(!userList.equals("") && (userInquiryDTO.getRoleID()==1)){
			request.getRequestDispatcher("/View/AddUser.jsp").forward(request, response);
		}
		if(!userList.equals("") && (userInquiryDTO.getRoleID()==51) || (userInquiryDTO.getRoleID()==101)){
			request.getRequestDispatcher("/View/Home.jsp").forward(request, response);
		}
		


		
	}

}
