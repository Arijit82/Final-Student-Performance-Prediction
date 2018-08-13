/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Palistha
 */

 
/**
 *
 * @author sanji
 */
@WebServlet(name = "DeleteTeacher", urlPatterns = {"/DeleteTeacher"})
public class DeleteTeacher extends HttpServlet        
{

  
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        System.out.println("id="+id);
        TeacherDAO da = new TeacherDAO();
        da.delete(id);
        response.sendRedirect("ManageTeacher");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
}
    

