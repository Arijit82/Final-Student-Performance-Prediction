/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher;

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
 * @author Palistha
 */
public class TeacherDAO {

    public static List<TeacherBean> getTeacherById(int id) {
        List<TeacherBean> ls = new LinkedList<>();
        String sql = "select * from teachers where teacherid = " + id;
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while (rs.next()) {
                TeacherBean n = new TeacherBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ls;
    }

    public void addNewTeacher(TeacherBean t) {
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into teachers"
                    + " values(TeacherIDSeq.nextval,?,?,?,?,?,?,'teacher')");
            //  ps.setInt(1, t.getTeacherid());
            ps.setString(1, t.getFullname());
            ps.setString(2, t.getAddress());
            ps.setString(3, t.getContact());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getAssignedsubject());
            ps.setString(6, t.getTpassword());

            ps.executeQuery();
            System.out.println("New Teacher Added");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<TeacherBean> getAllTeacher() {
        List<TeacherBean> lt = new LinkedList<>();

        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from teachers").executeQuery();
            while (rs.next()) {
                TeacherBean t = new TeacherBean(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8));

                lt.add(t);
            }
        }//end of try
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lt;

    }

    public void edit(int Teacher_id, String FullName, String Address, String email,
            String assignedsubject, String contact, String Tpassword) {
        try {
            String sql = "update teachers SET teachername = ?, address = ?, email=?, assignedsubject = ?"
                    + ", tpassword = ?,  contact = ?" + " where teacherid = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, FullName);
            ps.setString(2, Address);
            ps.setString(3, email);
            ps.setString(4, assignedsubject);
            ps.setString(5, Tpassword);
            ps.setString(6, contact);
            ps.setInt(7, Teacher_id);

            ps.executeUpdate();
            System.out.println("Teacher Record Updated");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {
        try {
            System.out.println("delete id=" + id);
            String sql = "delete teachers where teacherid = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Teacher Record Deleted");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
