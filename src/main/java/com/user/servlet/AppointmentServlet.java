package com.user.servlet;

import java.io.IOException;
import com.entity.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AppointmentDAO;
import com.db.DBConnect;
import com.entity.Appointment;
import com.entity.User;

@WebServlet("/appAppointment")
public class AppointmentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int userId = Integer.parseInt(req.getParameter("userid"));
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String appoint_date = req.getParameter("appoint_date");
		String appoint_time = req.getParameter("appoint_time");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		String diseases = req.getParameter("diseases");
		int doctor_id = Integer.parseInt(req.getParameter("doct"));
		String address = req.getParameter("address");

		Appointment ap = new Appointment(userId, firstname,lastname, gender, age, appoint_date, appoint_time, email, phno, diseases, doctor_id,
				address, "Pending");

		AppointmentDAO dao = new AppointmentDAO(DBConnect.getConn());
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("userObj");
		int userIdFromSession = user.getId();

		if (userIdFromSession != userId) {
			 resp.sendRedirect("user_login.jsp");
		} else if (dao.addAppointment(ap)) {
					session.setAttribute("succMsg", "Appointment Sucessfull");
					resp.sendRedirect("user_appointment.jsp"); 
			/*
			 * PrintWriter out= resp.getWriter(); out.println("Appointment Successfull");
			 */
		} else {
			session.setAttribute("errorMsg", "Something wrong on server");
			 resp.sendRedirect("user_appointment.jsp"); 
				/*
				 * PrintWriter out= resp.getWriter();
				 * out.println("Something went wrong while booking appointment");
				 */
		}

	}
	}
