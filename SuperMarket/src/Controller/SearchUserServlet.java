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


@WebServlet("/searchuser")
public class SearchUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/View/SearchUser.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String roleName=request.getParameter("roleName");
		String userName=request.getParameter("userName");
		
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
		
		UserResponseDTO userResponseDTO=new UserResponseDTO();
		IUserService iUserService=new UserService();
		userResponseDTO = iUserService.inquireUser(userInquiryDTO);
		
		List<T_User> userList=userResponseDTO.getUserList();
		
		request.setAttribute("userList",userList);
		request.getRequestDispatcher("/View/SearchUser.jsp").forward(request, response);
		
		
	}

}
