/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Dashboard.ManageTeacher;

import com.performanceprediction.Teacher.TeacherDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ManageTeacher", urlPatterns = {"/ManageTeacher"})
public class ManageTeacher extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("AllTeacher", TeacherDAO.getAllTeacher());
        System.out.println("teacher data");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Teacher/TeacherList.jsp");
        rd.forward(request, response);
    }

}
