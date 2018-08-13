/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Dashboard.Profile;

import java.io.IOException;
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
@WebServlet(urlPatterns = {"/profile"})
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         HttpSession session = request.getSession(); 
              String UserLogged=(String) session.getAttribute("currentUserEmail");
            //  String role = (String) session.getAttribute("role");
              System.out.println("LoggedUser"+ UserLogged);
               
              ProfileBean profileBean = new ProfileBean();
             
              profileBean= ProfileDAO.getProfile(profileBean, UserLogged);
              
              request.setAttribute("teacherid", profileBean.getTeacherID());
              request.setAttribute("teachername", profileBean.getTeachername());
              request.setAttribute("address", profileBean.getAddress());
              request.setAttribute("assignedsubject", profileBean.getAssignedSubject());
              request.setAttribute("role", profileBean.getRole());
              request.setAttribute("contact", profileBean.getContact());
              request.setAttribute("email", profileBean.getEmail());
              
         request.getRequestDispatcher("/WEB-INF/views/Teacher/profile.jsp").forward(request, response);
        
//        if(profileBean.getRole().equals("admin")){
//             request.getRequestDispatcher("/WEB-INF/views/profile.jsp").forward(request, response);
//        }
//        else if(profileBean.getRole().equals("teacher")){
//             request.getRequestDispatcher("/WEB-INF/views/Teacher/TProfile.jsp").forward(request, response);
//        }
//        else{
//            System.out.println("Invalid user");
//        }
       
    }

}
