package com.doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AppointmentDAO;
import com.db.DBConnect;

@WebServlet("/updateStatus")
public class UpdateStatus extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int id = Integer.parseInt(req.getParameter("id"));
			int did = Integer.parseInt(req.getParameter("did"));
			String comm = req.getParameter("comm");

			AppointmentDAO dao = new AppointmentDAO(DBConnect.getConn());

			HttpSession session = req.getSession();

			if (dao.updateCommentStatus(id, did, comm)) {
				session.setAttribute("succMsg", "Comment Updated");
				 resp.sendRedirect("doctor/patient.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Comment updated Successfully");
					 */
			} else {
				session.setAttribute("errorMsg", "Something wrong on server");
				 resp.sendRedirect("doctor/patient.jsp"); 
					/*
					 * PrintWriter out= resp.getWriter();
					 * out.println("Error encountered while commenting");
					 */
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}