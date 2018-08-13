/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Dashboard;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanji
 */
@WebServlet(name = "Dashboard", urlPatterns = {"/Dashboard"})
public class Dashboard extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);
         
//        if (request.getSession().getAttribute("role").equals("admin")) {
//            request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);
//        } else if (request.getSession().getAttribute("role").equals("teacher")) {
//            request.getRequestDispatcher("/WEB-INF/views/Teacher/Student/TeacherDashboard.jsp").forward(request, response);
//        }
    }
}
