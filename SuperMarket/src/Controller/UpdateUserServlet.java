package Controller;

import java.io.IOException;
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


@WebServlet("/updateuser")
public class UpdateUserServlet extends HttpServlet {
	
	UserResponseDTO userResponseDTO;
	IUserService iUserService=new UserService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInquiryDTO userInquiryDTO=new UserInquiryDTO();
		
		int userID=Integer.parseInt(request.getParameter("id"));
		userInquiryDTO.setUserID(userID);
		
		userResponseDTO=iUserService.inquireUser(userInquiryDTO);
		
		request.setAttribute("userList", userResponseDTO.getUserList().get(0));
		request.getRequestDispatcher("/View/UpdateUser.jsp").forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		T_User tuser=userResponseDTO.getUserList().get(0);
		tuser.setUserName(request.getParameter("name"));
		tuser.setPhoneNumber(Integer.parseInt(request.getParameter("phoneNumber")));
		tuser.setEmail(request.getParameter("email"));
		tuser.setAddress(request.getParameter("address"));
		tuser.setPassword(request.getParameter("password"));
		tuser.setRoleID(Integer.parseInt(request.getParameter("radioBtn")));
		 
//         if(request.getParameter("radioBtn") != null) {
//             if(request.getParameter("radioBtn").equals("radio1")) {
//                 out.println("Radio button 1 was selected.<BR>");
//             }
//             else {
//                 out.println("Radio button 1 was not selected.<BR>");
//             }
//             if(request.getParameter("radioBtn").equals("radio2")) {
//                 out.println("Radio button 2 was selected.<BR>");
//             }
//             else {
//                 out.println("Radio button 2 was not selected.<BR>");
//             }
//             if(request.getParameter("radioBtn").equals("radio3")) {
//                 out.println("Radio button 3 was selected.<BR>");
//             }
//             else {
//                 out.println("Radio button 3 was not selected.<BR>");
//             }
//         }
    
		tuser=iUserService.updateUser(tuser);
		request.getRequestDispatcher("/View/UpdateUser.jsp").forward(request, response);
	}

}
