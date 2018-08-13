/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher.Student;

import com.performanceprediction.Student.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "TeacherInput", urlPatterns = {"/TeacherInput"})
public class TeacherInput extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        
        String tempid = request.getParameter("id");
        int id = Integer.parseInt(tempid);
        request.setAttribute("id", id);
        request.setAttribute("getStudentById", StudentDAO.getStudentById(id));
        request.getRequestDispatcher("/WEB-INF/views/Teacher/Student/TeacherInput.jsp").forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         HttpSession session = request.getSession(); 
        int tid =(Integer)session.getAttribute("teacherid");
        
        int sid = Integer.parseInt(request.getParameter("id"));
        int g1 = Integer.parseInt(request.getParameter("g1"));
        int g2 = Integer.parseInt(request.getParameter("g2"));
        int absences = Integer.parseInt(request.getParameter("absences"));
        int eca = Integer.parseInt(request.getParameter("activities"));
        
        TStudentBean tsBean = new TStudentBean();
        tsBean.setTid(tid);
        tsBean.setId(sid);
        tsBean.setG1(g1);
        tsBean.setG2(g2);
        tsBean.setAbsences(absences);
        tsBean.setActivities(eca);
        
        TstudentDAO tsDAO = new TstudentDAO();
        tsDAO.addTStudentData(tsBean);
           response.sendRedirect("ManageStudent");
    }
    
}
