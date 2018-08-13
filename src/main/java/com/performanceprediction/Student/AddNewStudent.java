/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanji
 */


@WebServlet(name = "AddNewStudent", urlPatterns = {"/AddNewStudent"})
public class AddNewStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/Student/AddStudent.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // int sid = Integer.parseInt(request.getParameter("sid"));
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        int age = Integer.parseInt(request.getParameter("age"));
        String doa = request.getParameter("doa");

        String pname = request.getParameter("parentname");
        String pemail = request.getParameter("email");
        String phoneno = request.getParameter("phoneno");
        int medu = Integer.parseInt(request.getParameter("medu"));
        int fedu = Integer.parseInt(request.getParameter("fedu"));

        StudentBean stdbean = new StudentBean();
        //  stdbean.setStudent_id(sid);
        stdbean.setStudentname(fullname);
        stdbean.setAddress(address);
        stdbean.setGender(gender);
        stdbean.setDob(dob);
        stdbean.setAge(age);
        stdbean.setDoa(doa);

        stdbean.setParentName(pname);
        stdbean.setEmail(pemail);
        stdbean.setPhoneNo(phoneno);
        stdbean.setMedu(medu);
        stdbean.setFedu(fedu);

        StudentDAO addnew = new StudentDAO();
        addnew.addNewStudent(stdbean);

        response.sendRedirect("ManageStudent");
    }

}
