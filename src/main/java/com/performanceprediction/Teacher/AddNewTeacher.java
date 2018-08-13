/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher;

import java.io.IOException;
import java.math.BigInteger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        } catch (Exception e) {
            System.out.println("Exception Occured:"+e);
        }
     
         response.sendRedirect("ManageTeacher");
    }

}
