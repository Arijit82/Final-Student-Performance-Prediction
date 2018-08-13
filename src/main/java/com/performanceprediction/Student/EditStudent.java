/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

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
 * @author sanji
 */
@WebServlet(name = "EditStudent", urlPatterns = {"/EditStudent"})
public class EditStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        request.setAttribute("getStudentById", StudentDAO.getStudentById(id));
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Student/EditStudent.jsp");
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(EditStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int sid = Integer.parseInt(request.getParameter("sid"));
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        int age = Integer.parseInt(request.getParameter("age"));
        String doa = request.getParameter("doa");
        String parentname = request.getParameter("pname");
        String email = request.getParameter("email");
        String phoneno = request.getParameter("phoneno");
        int medu = Integer.parseInt(request.getParameter("medu"));
        int fedu = Integer.parseInt(request.getParameter("fedu"));

        StudentDAO stdDAO = new StudentDAO();
        stdDAO.edit(sid, fullname, address, gender, dob, age, doa,parentname,email,phoneno,medu,fedu);
        response.sendRedirect("ManageStudent");
    }

}
