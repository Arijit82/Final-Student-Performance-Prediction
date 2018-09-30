/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Properties;
import javax.mail.AuthenticationFailedException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sanji
 */
@WebServlet(name = "AddNewTeacher", urlPatterns = {"/AddNewTeacher"})
public class AddNewTeacher extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/Teacher/AddTeacher.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // String tid = request.getParameter("tid");
        String fullname = request.getParameter("fullname");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String assubject = request.getParameter("assubject");
        String role = request.getParameter("role");
        String password = request.getParameter("password");

        TeacherBean teabean = new TeacherBean();
      //  teabean.setTeacherid(Integer.parseInt(tid));
        teabean.setFullname(fullname);
        teabean.setContact((contact));
        teabean.setEmail(email);
        teabean.setAddress(address);
        teabean.setAssignedsubject(assubject);
        teabean.setRole(role);
        teabean.setTpassword(password);

        TeacherDAO teaDAO = new TeacherDAO();
        try {
               teaDAO.addNewTeacher(teabean);
               
                
                // Sender's email ID needs to be mentioned
        HttpSession s = request.getSession();
        final String user = (String) s.getAttribute("currentUserEmail");
        final String pass = (String) s.getAttribute("CurrentUserPassword");
        
          PrintWriter out = response.getWriter();
        // Get system properties
        Properties props = System.getProperties();

        // Setup mail server
        props.put("mail.smtp.host", "smtp.gmail.com");
        //below mentioned mail.smtp.port is optional
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Get the default Session object.
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(user));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(teabean.getEmail()));

            // Set Subject: header field
            message.setSubject("Account Created");

            // Now set the actual message
            message.setText("Your Account has been Created!!!"+"\n"+"with Email:"+teabean.getEmail() 
                    +"\n"+"and Password:"+teabean.getTpassword());

            // Send message
        Transport.send(message);
            System.out.println("Mail Send to Teacher");
        } catch (MessagingException ex) {
             System.out.println("Exception Occured:"+ex);
        }
        
        } catch (Exception e) {
            System.out.println("Exception Occured:"+e);
        }
     
         response.sendRedirect("ManageTeacher");
    }

}
