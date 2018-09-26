/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

import com.performanceprediction.ID3.id3;
import com.performanceprediction.LinearRegression.LinearRegression;
import com.performanceprediction.Student.PredictedOutput.PredictedOutputBean;
import com.performanceprediction.Student.PredictedOutput.PredictedOutputDAO;
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
@WebServlet(name = "Prediction", urlPatterns = {"/Prediction"})
public class Prediction extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        LinearRegression lr = new LinearRegression();
        double lrpredictedvalue = lr.LRpredictedvalue(id);

//        request.setAttribute("output", lrpredictedvalue);
//        request.setAttribute("getStudentById", StudentDAO.getStudentById(id));
//        //   request.setAttribute("tval", testValue);
//        System.out.println("Predictedvalue of student id=" + lrpredictedvalue);
        id3 idthree = new id3();
        String id3predictedvalue = idthree.id3predictedvalue(id);
//        request.setAttribute("id3output", id3predictedvalue);
//        System.out.println("id3predictedvalue" + id3predictedvalue);

        if (lrpredictedvalue == 0.0 || id3predictedvalue.equals("default")) {
            request.setAttribute("alertMsg", "Please ask teachers/parents to fill the form");
            System.out.println("Please ask teachers/parents to fill the form");

            RequestDispatcher rd = request.getRequestDispatcher("ManageStudent");
            rd.include(request, response);
        } else {
            request.setAttribute("output", lrpredictedvalue);
            request.setAttribute("getStudentById", StudentDAO.getStudentById(id));
            //   request.setAttribute("tval", testValue);
            System.out.println("student id=" + id);
            System.out.println("Predictedvalue of student is=" + lrpredictedvalue);

            request.setAttribute("id3output", id3predictedvalue);
            System.out.println("id3predictedvalue" + id3predictedvalue);

            PredictedOutputBean pobean = new PredictedOutputBean();
            pobean.setStdid(id);
            pobean.setRegout(lrpredictedvalue);
            pobean.setIdout(id3predictedvalue);

            PredictedOutputDAO poDAO = new PredictedOutputDAO();
            poDAO.addPredictedOutput(pobean);

           
        
            request.setAttribute("stdid", id);
            request.getRequestDispatcher("/WEB-INF/views/Student/predictedoutput.jsp").forward(request, response);
        }

    }

   

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
