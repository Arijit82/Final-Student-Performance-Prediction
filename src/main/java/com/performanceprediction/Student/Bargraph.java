/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

import com.performanceprediction.connection.ConnectionManager;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sanji
 */
@WebServlet(name = "Bargraph", urlPatterns = {"/Bargraph"})
public class Bargraph extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id=21;
         /* Get the output stream from the response object */
            try {
                // OutputStream outt = response.getOutputStream();
                Connection currentCon = ConnectionManager.getConnection();
                Statement stmt = currentCon.createStatement();
                ResultSet resultSet = stmt.executeQuery("select tq.g1,tq.g2,po.regoutput from Teacher_Question tq join predictedoutput po on"
                        + " tq.StudentId=po.StudentId where tq.StudentId="+id);

                DefaultCategoryDataset bar_chart_servlet  = new DefaultCategoryDataset();

                while (resultSet.next()) {
                    bar_chart_servlet .addValue(Double.parseDouble(resultSet.getString("g1")), "G1", "Grade");
                    bar_chart_servlet .addValue(Double.parseDouble(resultSet.getString("g2")), "G2", "Grade");
                    bar_chart_servlet .addValue(Double.parseDouble(resultSet.getString("regoutput")), "G3", "Grade");
                }
                /* Step -2:Define the JFreeChart object to create bar chart */
                JFreeChart BarChartObject = ChartFactory.createBarChart("jFreeChart Servlet Example Code", "Index", "Score", bar_chart_servlet, PlotOrientation.VERTICAL, true, true, false);

                /* Step -3: Set the response type to PNG */
               // response.setContentType("image/png");
                /* Set the HTTP Response Type */

 /* Step -4: Write the response to the output stream */
             //   ChartUtilities.writeChartAsPNG(out, BarChartObject, 400, 300);/* Write the data to the output stream */
           final File file1 = new File("R:\\WorkPlace\\New folder\\PerformancePrediction\\src\\main\\resources\\barchart.png");
             ChartUtilities.saveChartAsPNG(file1, BarChartObject, 400, 300);/* Write the data to the output stream */
            
            } catch (Exception e) {
                System.err.println(e.toString());
                /* Throw exceptions to log files */
            } 
//            finally {
//                outt.close();/* Close the output stream */
//            }
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
