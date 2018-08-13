/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

import com.performanceprediction.LinearRegression.FileHandler;
import com.performanceprediction.LinearRegression.Fit;
import com.performanceprediction.LinearRegression.Model;
import com.performanceprediction.LinearRegression.Observation;
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
@WebServlet(name = "ViewReport", urlPatterns = {"/ViewReport"})
public class ViewReport extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Observation[] inputVectors = FileHandler.read("R:\\WorkPlace\\New folder\\PerformancePrediction\\src\\main\\java\\com\\performanceprediction\\LinearRegression\\student_mat_dataset.csv");

        //    ParametersCoef pcof = new ParametersCoef();
        // Fits the model predicting the feature compressivestrength using gradient descent.        
        double alpha = 0.0001;
        System.out.println("\n\nFitting model using gradient descent, alpha = " + alpha + " ...");
        System.out.println("*************************************************************************\n");
        Model gradientFit = Fit.gradientDescent(inputVectors, "g3", 0.0001);
        System.out.println(gradientFit.toString());

        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        double predictedvalue = gradientFit.predictedValue(id);
        request.setAttribute("output", predictedvalue);
      request.setAttribute("getStudentById", StudentDAO.getStudentById(id));
        //   request.setAttribute("tval", testValue);
        System.out.println("Predictedvalue of student id=" + predictedvalue);

        request.getRequestDispatcher("/WEB-INF/views/Student/predictedoutput.jsp").forward(request, response);
    }

}
