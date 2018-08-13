/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Parent;

import com.performanceprediction.Student.DBUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanji
 */
public class ParentInputDAO {

    public void addParentInput(ParentInputBean n) {
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into parent_question"
                    + " values(ParentQuestionIDSeq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,trunc(sysdate))");
            ps.setInt(1, n.getStudent_id());
            ps.setInt(2, n.getFamsize());
            ps.setInt(3, n.getPstatus());
            ps.setInt(4, n.getTraveltime());
            ps.setInt(5, n.getStudytime());
            ps.setInt(6, n.getFailures());
            ps.setInt(7, n.getSchoolsup());
            ps.setInt(8, n.getFamsup());
            ps.setInt(9, n.getPaid());
            ps.setInt(10, n.getInternet());
            ps.setInt(11, n.getFamrel());
            ps.setInt(12, n.getFreetime());
            ps.setInt(13, n.getGoout());
            ps.setInt(14, n.getHealth());
            ps.executeQuery();
            System.out.println("Parent Question Data Inserted");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ParentInputDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
