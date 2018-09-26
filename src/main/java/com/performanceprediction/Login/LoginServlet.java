/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Login;

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
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Hello");
        try {

            UserBean user = new UserBean();
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            System.out.println("email: " + user.getEmail());
            System.out.println("password: " + user.getPassword());
            user = UserDAO.login(user);

            if (user.isValid()) {

                //   HttpSession session = request.getSession(true);
                // session.setAttribute("currentSessionUser", user);
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                HttpSession session = request.getSession();
                session.setAttribute("currentUserEmail", email);
                session.setAttribute("CurrentUserPassword", password);
                session.setAttribute("role", user.getRole());
                session.setAttribute("teacherid", user.getTeacherid());
                System.out.println("Loginservlet CurrentUser" + request.getSession().getAttribute("currentUserEmail"));
                // request.setAttribute("email", user.getEmail());
                System.out.println("Role" + user.getRole());
               
                request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);
//                if (user.getRole().equals("admin")) {
//
//                    request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);
//
//                } else if(user.getRole().equals("teacher")) {
//                    request.getRequestDispatcher("/WEB-INF/views/Teacher/Student/TeacherDashboard.jsp").forward(request, response);
//
//                }

                // response.sendRedirect("userLogged.jsp"); //logged-in page      		
            } else {
                System.out.println("invalid user");
                request.setAttribute("invalid", "Invalid Email or Password!!!");
                request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
                // response.sendRedirect("invalidLogin.jsp"); //error page 
            }

        } catch (Throwable theException) {
            System.out.println(theException);
        }

    }

}
