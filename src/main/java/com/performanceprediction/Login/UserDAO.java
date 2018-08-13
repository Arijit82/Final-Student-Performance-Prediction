/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Login;

import com.performanceprediction.connection.ConnectionManager;
import java.sql.*;

/**
 *
 * @author sanji
 */
public class UserDAO {

    static Connection currentCon = null;
    static ResultSet rs = null;

    public static UserBean login(UserBean bean) {

        //preparing some objects for connection 
        Statement stmt = null;

        String email = bean.getEmail();
        String password = bean.getPassword();

        System.out.println("Email=" + email + "password" + password);

        String searchQuery
                = "select * from teachers where email='"
                + email
                + "' AND tpassword='"
                + password
                + "'";
       // System.out.println(searchQuery);
//       System.out.println(" prints in the console Normally used to trace the process");
//      System.out.println("Query: "+searchQuery);
        try {
            //connect to DB 
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
//            if (rs.next()) {
//                System.out.println(rs.getString("email"));
//            } else {
//                System.out.println("result Empty");
//            }

            boolean more = rs.next();
            

            // if user does not exist set the isValid variable to false
            if (!more) {
                System.out.println("Sorry, you are not a registered user! Please sign up first");
                bean.setValid(false);
            } //if user exists set the isValid variable to true
            else if (more) {
                String Semail = rs.getString("Email");
             //   String Spassword = rs.getString("Password");
                String role = rs.getString("role");
                int teacherid= rs.getInt("teacherid");
                System.out.println("Welcome " + Semail);
                //   bean.setFirstName(firstName);
                // bean.setLastName(lastName);
                bean.setRole(role);
                bean.setTeacherid(teacherid);
                bean.setValid(true);
            }
        } catch (Exception ex) {
            System.out.println("Log In failed: An Exception has occurred! " + ex);
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
                } catch (Exception e) {
                }

                currentCon = null;
            }
        }

        return bean;

    }
}
