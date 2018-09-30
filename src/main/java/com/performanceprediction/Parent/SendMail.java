/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Parent;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sanji
 */
@WebServlet(name = "SendMail", urlPatterns = {"/SendMail"})
public class SendMail extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recipient's email ID needs to be mentioned.
        String id = request.getParameter("id");
        String name = request.getParameter("stdname");
        String to = request.getParameter("email");

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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Form fillup");

            // Now set the actual message
            message.setText("Pease fill this form" + "\n" + "Student ID: " + id + "\n" + "Student Name:" + name
                    + "\n" + "http://localhost:8080/PerformancePrediction/ParentInput?id="+id);

            // Send message
        Transport.send(message);
        
          
            request.setAttribute("Messege", "Mail Send Successful!!!");
            request.getRequestDispatcher("MailParent").forward(request,response);
          System.out.println("Mail Send");
        }catch (AuthenticationFailedException ex) {
            
            request.setAttribute("Messege", "Authentication failed");

          request.getRequestDispatcher("MailParent").forward(request,response);

        } catch (AddressException ex) {
            request.setAttribute("Messege", "Wrong email address");

          request.getRequestDispatcher("MailParent").forward(request,response);

        } catch (MessagingException ex) {
            request.setAttribute("Messege", ex.getMessage());

         request.getRequestDispatcher("MailParent").forward(request,response);
        }
        response.sendRedirect("MailParent");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
