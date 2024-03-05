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

@WebServlet("/addDoctor")
public class AddDoctor extends HttpServlet {

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

			Doctor d = new Doctor(firstName,lastName, dob, qualification, spec, email, mobno, password);

			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			HttpSession session = req.getSession();

			if (dao.registerDoctor(d)) {
				session.setAttribute("succMsg", "Doctor Added Sucessfully..");
				PrintWriter out= resp.getWriter();
				out.println("added doc");
				/* resp.sendRedirect("admin/doctor.jsp"); */
			} else {
				session.setAttribute("errorMsg", "something wrong on server");
				PrintWriter out= resp.getWriter();
				out.println("added not doc");
				resp.sendRedirect("admin/doctor.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}