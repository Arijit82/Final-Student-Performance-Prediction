/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

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
public class StudentDAO {

    public void addNewStudent(StudentBean n) {
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into students "
                    + "values(StudentIDSeq.nextval,?,?,?,to_date(?, 'YYYY/MM/DD'),?,to_date(?, 'YYYY/MM/DD'),?,?,?,?,?)");
            //   ps.setInt(1, n.getStudent_id());
            ps.setString(1, n.getStudentname());
            ps.setString(2, n.getAddress());
            ps.setString(3, n.getGender());
            ps.setString(4, n.getDob());
            ps.setInt(5, n.getAge());
            ps.setString(6, n.getDoa());
            ps.setString(7, n.getParentName());
            ps.setString(8, n.getEmail());
            ps.setString(9, n.getPhoneNo());
            ps.setInt(10, n.getMedu());
            ps.setInt(11, n.getFedu());
            ps.executeQuery();
            System.out.println("Student Records added");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<StudentBean> getAll() {
        List<StudentBean> ls = new LinkedList<>();

        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from students").executeQuery();
            while (rs.next()) {
                StudentBean n = new StudentBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getInt(12));

                ls.add(n);
            }
        }//end of try
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;

    }

    public static List<StudentBean> getStudentById(int id) {
        List<StudentBean> ls = new LinkedList<>();
        String sql = "select * from students where studentid = " + id;
       
         
             
         
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
//             boolean more = rs.next();
//             if(!more)
//             {
//                 
//             }
            while (rs.next()) {
                StudentBean n = new StudentBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getInt(12));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ls;
    }

    public void edit(int student_id, String FullName, String Address, String Gender, String dob, int age, String DateOfAdmission,
            String pname, String email, String phoneno, int medu, int fedu) {
        try {
            String sql = "update students SET fullname = ?, address = ?, gender = ?, dob = to_date(?,'YYYY/MM/DD'), age = ?, dateofadmission=to_date(?,'YYYY/MM/DD'),"
                    + " parentname=?,email=?,phoneno=?,medu=?,fedu=?"
                    + " where studentid = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setString(1, FullName);
            ps.setString(2, Address);
            ps.setString(3, Gender);
            ps.setString(4, dob);
            ps.setInt(5, age);
            ps.setString(6, DateOfAdmission);
            ps.setInt(7, student_id);
            ps.setString(8, pname);
            ps.setString(9, email);
            ps.setString(10, phoneno);
            ps.setInt(11, medu);
            ps.setInt(12, fedu);
            ps.executeUpdate();
            System.out.println("Records uptated at studentid" + student_id);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {
        try {
            System.out.println("delete id=" + id);
            String sql = "delete students where studentid = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Records deleted at studentid" + id);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
