package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import com.user.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateOtp")
public class ValidateOtp extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String otpString = (String) request.getSession().getAttribute("otp");

        if (otpString != null && !otpString.isEmpty()) {
            int value = Integer.parseInt(request.getParameter("otp"));
            int otp = Integer.parseInt(otpString);

            if (value == otp) {
                request.setAttribute("validationStatus", "success");
                PrintWriter out= response.getWriter();
        		out.println("Good");
            } else {
                request.setAttribute("validationStatus", "failure");
                PrintWriter out= response.getWriter();
        		out.println("Bad");
            }
        } else {
            request.setAttribute("validationStatus", "failure");
            // OTP not found in session
            PrintWriter out= response.getWriter();
    		out.println("Very bad");
        }

		
		  request.getRequestDispatcher("otpValidation.jsp").forward(request,
		  response);
		 
           }
}
