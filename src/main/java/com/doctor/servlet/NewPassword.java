package com.doctor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDao;
import com.db.DBConnect;
@WebServlet("/new_password_doc")
public class NewPassword extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {

		String email = req.getParameter("email");
		String newPassword = req.getParameter("password");
		 String newPassword2 = req.getParameter("password2"); 

		DoctorDao dao = new DoctorDao(DBConnect.getConn());
		HttpSession session = req.getSession();

		if (newPassword.equals(newPassword2)) {

			if (dao.newPassword(email,newPassword)) {
				session.setAttribute("succMsg", "Password Changed Sucessfully");
				 resp.sendRedirect("doctor_login.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Password Changed Successfully");
					 */

			} else {
				session.setAttribute("errorMsg", "Something wrong on server");
				 resp.sendRedirect("doctor/newpass.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Error encountered while changing password");
					 */
			}

		} else {
			session.setAttribute("errorMsg", "Password Mismatch");
			 resp.sendRedirect("doctor/newpass.jsp"); 
				/*
				 * PrintWriter out= resp.getWriter(); out.println("Incorrect Old password");
				 */
		}
		// After successful signup processing
		/*
		 * req.setAttribute("redirectType", "forgotpass");
		 * req.getRequestDispatcher("ForgotPassOtp.jsp").forward(req, resp);
		 */   

	}
}


