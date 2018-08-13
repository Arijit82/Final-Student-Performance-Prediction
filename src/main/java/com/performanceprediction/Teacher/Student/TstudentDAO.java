/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher.Student;

import com.performanceprediction.Student.DBUtils;
import com.performanceprediction.Teacher.TeacherDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanji
 */
public class TstudentDAO {

    public void addTStudentData(TStudentBean t) {

        try {

            PreparedStatement ps = DBUtils.getPreparedStatement("insert into teacher_question"
                    + " values(TeacherQuestionIDSeq.nextval,?,?,?,?,?,?,trunc(sysdate))");
            ps.setInt(1, t.getTid());
            ps.setInt(2, t.getId());
            ps.setInt(3, t.getG1());
            ps.setInt(4, t.getG2());
            ps.setInt(5, t.getAbsences());
            ps.setInt(6, t.getActivities());
            ps.executeQuery();
            System.out.println("Teacher Question Data Inserted");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
