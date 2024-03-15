package com.doctor.servlet;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDao;
import com.db.DBConnect;

@WebServlet("/forgot_password_doc")
public class ForgotPassword extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 

	try {
		String email = req.getParameter("email");



		DoctorDao dao = new DoctorDao(DBConnect.getConn());

		HttpSession session = req.getSession();

		boolean f = dao.forgotpass(email);
	 
				if (f) {
					String otp = generateOTP();

					sendOTPEmail(email, otp);
					
					session.setAttribute("sucMsg", "Registered Sucessfully");
					 session.setAttribute("otp", otp);
					
					 resp.sendRedirect("doctor/ForgotEnterOtp.jsp"); 
						/*
						 * PrintWriter out= resp.getWriter(); out.println("Registration Successful");
						 */
				} else {
					session.setAttribute("errorMsg", "Something wrong on server");
					 resp.sendRedirect("signup.jsp"); 
						/*
						 * PrintWriter out= resp.getWriter();
						 * out.println("Error encountered during registration");
						 */
				}
	 
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			
			private void sendOTPEmail(String userEmail, String otp) {
			final String username = "shahnazaktar02@gmail.com";
	        final String password = "rxvl ucrf jkry gqcx";
	       

	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("shahnazaktar02@gmail.com"));
	            message.setRecipients(Message.RecipientType.TO,
	                    InternetAddress.parse(userEmail));
	            message.setSubject("Your One Time Password (OTP)");
	            String messageText = "Dear User,\n\n" +
	                    "Your OTP is: " + otp + "\n\n" +
	                    "This OTP is valid for a single use only.\n\n" +
	                    "If you didn't request this OTP, please ignore this email.\n\n" +
	                    "Regards,\n" +
	                    "MedScape";
	            	message.setText(messageText);
	            Transport.send(message);
	                       
				/*
				 * PrintWriter out= resp.getWriter(); out.println("Email sent to " +userEmail);
				 */
				/*
				 * resp.sendRedirect("otpValidation.jsp"); req.getSession().setAttribute("otp",
				 * otp);
				 */
	         
	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	    }

	    // Method to generate a random 6-digit OTP
	    private String generateOTP() {
	        Random random = new Random();
	        int otp = 100000 + random.nextInt(900000);
	        return String.valueOf(otp);
	    }
	 
	 
		}
