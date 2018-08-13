/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Dashboard.ManageStudent;

import com.performanceprediction.Student.StudentDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanji
 */
@WebServlet(name = "ManageStudent", urlPatterns = {"/ManageStudent"})
public class ManageStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("AllStudent", StudentDAO.getAll());    
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Student/StudentList.jsp");
        rd.forward(request, response); }

}
