package com.email;

import java.io.IOException;
import com.user.servlet.*;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendEmailServlet")
public class SendEmail extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String username = "shahnazaktar02@gmail.com";
        final String password = "rxvl ucrf jkry gqcx";

        // Generate a random 6-digit OTP
        String otp = generateOTP();
        String userEmail = req.getParameter("email");

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
            message.setText("Dear User,"
                    + "\n\n Your OTP is: " + otp
                    + "\n\n This OTP is valid for a single use only."
                    + "\n\n If you didn't request this OTP, please ignore this email."
                    + "\n\n Regards,"
                    + "\n MediScape");
            Transport.send(message);
            
            PrintWriter out= resp.getWriter();
    		out.println("Email sent to " +userEmail);
            // Optionally, you can store the OTP in the session here
            req.getSession().setAttribute("otp", otp);
      
         
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    // Method to generate a random 6-digit OTP
    private static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }
 

}