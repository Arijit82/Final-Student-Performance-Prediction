/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Dashboard.Profile;

import com.performanceprediction.connection.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sanji
 */
public class ProfileDAO {

    static Connection currentCon = null;
    static ResultSet rs = null;

    public static ProfileBean getProfile(ProfileBean profileBean, String LoggedUser) {
        Statement stmt = null;
        System.out.println("Loggeduser ProfileDAO" + LoggedUser);
        String searchQuery = "select * from teachers where email='" + LoggedUser + "'";

        try {
            //connect to DB 
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);

            boolean more = rs.next();

            // if user does not exist set the isValid variable to false
            if (!more) {
                System.out.println("Sorry, you are not found on the database");

            } //if user exists set the isValid variable to true
            else if (more) {
                String teacherID = rs.getString("teacherid");
                String teachername = rs.getString("teachername");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                String email = rs.getString("email");
                String assignedSubject = rs.getString("assignedsubject");
                String role = rs.getString("role");

                profileBean.setTeacherID(teacherID);
                profileBean.setTeachername(teachername);
                profileBean.setAddress(address);
                profileBean.setContact(contact);
                profileBean.setEmail(email);
                profileBean.setAssignedSubject(assignedSubject);
                profileBean.setRole(role);
              

            }
        } catch (Exception ex) {
            System.out.println("cant get the profile details " + ex);
        } //some exception handling
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
                stmt = null;
            }

            if (currentCon != null) {
                try {
                    currentCon.close();
                } catch (SQLException e) {
                    System.out.println("SQLException:"+ e);
                }

                currentCon = null;
            }
        }

        return profileBean;
    }

}
