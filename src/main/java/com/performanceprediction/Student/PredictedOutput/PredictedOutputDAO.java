/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student.PredictedOutput;

import com.performanceprediction.Student.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanji
 */
public class PredictedOutputDAO {

    public void addPredictedOutput(PredictedOutputBean n) {
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into predictedoutput "
                    + "values(poidSeq.nextval,?,?,?)");

            ps.setInt(1, n.getStdid());
            ps.setDouble(2, n.getRegout());
            ps.setString(3, n.getIdout());
            ps.executeQuery();
            System.out.println("Predicted Output Records added");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PredictedOutputDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static List<PredictedOutputBean> getOutputs() {
        List<PredictedOutputBean> ls = new LinkedList<>();

        try {
            ResultSet rs = DBUtils.getPreparedStatement("select s.studentid,s.fullname,s.parentname,p.regoutput, p.idout  from students s inner join predictedoutput p on s.studentid=p.studentid ").executeQuery();
            while (rs.next()) {
                PredictedOutputBean n = new PredictedOutputBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5));

                ls.add(n);
            }
        }//end of try
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PredictedOutputDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;

    }
}
