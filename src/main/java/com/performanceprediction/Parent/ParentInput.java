/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Parent;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanji
 */
@WebServlet(name = "ParentInput", urlPatterns = {"/ParentInput"})
public class ParentInput extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/Parent/parents_input.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int sid= Integer.parseInt(request.getParameter("sid"));
        int famsize = Integer.parseInt(request.getParameter("famsize"));
        int pstatus = Integer.parseInt(request.getParameter("pstatus"));
        int traveltime = Integer.parseInt(request.getParameter("traveltime"));
        int studytime = Integer.parseInt(request.getParameter("studytime"));
        int failures = Integer.parseInt(request.getParameter("failure"));
        int schoolsup = Integer.parseInt(request.getParameter("schoolsup"));
        int famsup = Integer.parseInt(request.getParameter("famsup"));
        int paid = Integer.parseInt(request.getParameter("paid"));
        int internet = Integer.parseInt(request.getParameter("internet"));
        int famrel = Integer.parseInt(request.getParameter("famrel"));
          int freetime = Integer.parseInt(request.getParameter("freetime"));
        int goout = Integer.parseInt(request.getParameter("goout"));
        int health = Integer.parseInt(request.getParameter("health"));
        
        ParentInputBean pibean = new ParentInputBean();
        pibean.setStudent_id(sid);
        pibean.setFamsize(famsize);
        pibean.setPstatus(pstatus);
        pibean.setTraveltime(traveltime);
        pibean.setStudytime(studytime);
        pibean.setFailures(failures);
        pibean.setSchoolsup(schoolsup);
        pibean.setFamsup(famsup);
        pibean.setPaid(paid);
        pibean.setInternet(internet);
        pibean.setFamrel(famrel);
        pibean.setFreetime(freetime);
        pibean.setGoout(goout);
        pibean.setHealth(health);
        
        System.out.println("famsup"+pibean.getFamsup());
        ParentInputDAO piDAO = new ParentInputDAO();
        piDAO.addParentInput(pibean);

       request.getRequestDispatcher("/WEB-INF/views/Parent/ParentThanks.jsp").forward(request, response);
        
    }

}
