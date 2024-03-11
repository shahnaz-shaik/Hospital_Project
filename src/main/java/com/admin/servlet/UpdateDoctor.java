package com.admin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDao;
import com.db.DBConnect;
import com.entity.Doctor;

@WebServlet("/updateDoctor")
public class UpdateDoctor extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			String firstName = req.getParameter("firstname");
			String lastName = req.getParameter("lastname");
			String dob = req.getParameter("dob");
			String qualification = req.getParameter("qualification");
			String spec = req.getParameter("spec");
			String email = req.getParameter("email");
			String mobno = req.getParameter("mobno");
			String password = req.getParameter("password");

			int id = Integer.parseInt(req.getParameter("id"));

			Doctor d = new Doctor(id,firstName,lastName, dob, qualification, spec, email, mobno, password);

			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			HttpSession session = req.getSession();

			if (dao.updateDoctor(d)) {
				session.setAttribute("succMsg", "Doctor Update Sucessfully..");
				 resp.sendRedirect("admin/view_doctor.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter(); out.println("Doctor Details Updated");
					 */
			} else {
				session.setAttribute("errorMsg", "something wrong on server");
				 resp.sendRedirect("admin/view_doctor.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Error Encountered while updating doctor details");
					 */
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}