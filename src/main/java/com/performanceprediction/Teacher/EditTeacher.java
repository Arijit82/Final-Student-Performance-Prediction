/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Palistha
 */
@WebServlet(name = "EditTeacher", urlPatterns = {"/EditTeacher"})
public class EditTeacher extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        request.setAttribute("getTecherById", TeacherDAO.getTeacherById(id));
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Teacher/EditTeacher.jsp");
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(EditTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int tid = Integer.parseInt(request.getParameter("tid"));
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String assignedsubject = request.getParameter("assignedsubject");
        String contact = request.getParameter("contact");
        String password = request.getParameter("password");

        TeacherDAO tDAO = new TeacherDAO();
        tDAO.edit(tid, fullname, address, email, assignedsubject, contact, password);
      
        response.sendRedirect("ManageTeacher");
    }

}
