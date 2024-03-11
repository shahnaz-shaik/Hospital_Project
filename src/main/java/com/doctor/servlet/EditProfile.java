package com.doctor.servlet;

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

@WebServlet("/doctorUpdateProfile")
public class EditProfile extends HttpServlet {

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

			int id = Integer.parseInt(req.getParameter("id"));

			Doctor d = new Doctor(id, firstName,lastName, dob, qualification, spec, email, mobno, "");

			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			HttpSession session = req.getSession();

			if (dao.editDoctorProfile(d)) {
				Doctor updateDoctor = dao.getDoctorById(id);
				session.setAttribute("succMsgd", "Doctor Update Sucessfully..");
				session.setAttribute("doctObj", updateDoctor);
				 resp.sendRedirect("doctor/edit_profile.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Profile edited Successfully");
					 */
			} else {
				session.setAttribute("errorMsgd", "something wrong on server");
				 resp.sendRedirect("doctor/edit_profile.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Error encountered while Updating profile");
					 */
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
