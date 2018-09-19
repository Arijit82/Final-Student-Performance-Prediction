package com.performanceprediction.LinearRegression;

import com.performanceprediction.connection.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.List;

// Represents a fitted multiple linear regression model. 
public class Model {

    static Connection currentCon = null;
    static ResultSet rs = null;
    Statement stmt = null;
    double output=0.0;

    public LinkedHashMap<String, Double> parameters;
    public String dependent;
    public double rSquared;

    public Model(LinkedHashMap<String, Double> parameters, String dependent, double rSquared) {
        this.parameters = parameters;
        this.dependent = dependent;
        this.rSquared = rSquared;
    }

    // Takes an Observation matching the dimensions of the input data and calculates a value for the dependent variable. 
    public double predict(Observation input) {
        double yhat = parameters.get("Intercept");

        for (String feature : parameters.keySet()) {
            if (!feature.equals("Intercept")) {
                yhat += parameters.get(feature) * input.getFeature(feature);
            }
        }

        return yhat;
    }

//    public String toString() {
//        String output = "Multiple linear regression predicting " + dependent + " using " + (parameters.size() - 1) + " features.\n"
//                + "R-Squared: " + rSquared + "\n\nFeature\t\t\t\tParameter\n-------------------------------------------------------------\n";
//
//        for (String feature : parameters.keySet()) {
//            String formattedName = feature;
//            while (formattedName.length() < 16) {
//                formattedName = formattedName + " ";
//            } // formatting
//            output = output + formattedName + "\t\t" + parameters.get(feature) + "\n";
//
//        }
//
//        return output;
//    }

    public double predictedValue(int id) {
        double intercept = parameters.get("Intercept");
        double famsize = parameters.get("famsize");
        double pstatus = parameters.get("pstatus");
        double medu = parameters.get("medu");
        double fedu = parameters.get("fedu");
        double traveltime = parameters.get("traveltime");
        double studytime = parameters.get("studytime");
        double failures = parameters.get("failures");
        double schoolsup = parameters.get("schoolsup");
        double famsup = parameters.get("famsup");
        double paid = parameters.get("paid");
        double activities = parameters.get("activities");
        double internet = parameters.get("internet");
        double famrel = parameters.get("famrel");
        double freetime = parameters.get("freetime");
        double goout = parameters.get("goout");
        double health = parameters.get("health");
        double absences = parameters.get("absences");
        double g1 = parameters.get("g1");
        double g2 = parameters.get("g2");
        System.out.println("famsize" + paid);

        String searchQuery
                = "select * from teacher_question tq inner join parent_question pq on tq.studentid=pq.studentid join students s on s.studentid=pq.studentid"
                + "  where tq.studentid='"
                + id
                + "'";
        try {
            //connect to DB 
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);

            boolean more = rs.next();

            // if user does not exist set the isValid variable to false
            if (!more) {
                System.out.println("Sorry,Data not Found");
               return output;

            } //if user exists set the isValid variable to true
            else if (more) {
                output = intercept + famsize * rs.getInt("famsize")
                        + pstatus * rs.getInt("pstatus")
                        + medu * rs.getInt("medu")
                        + fedu * rs.getInt("fedu")
                        + traveltime * rs.getInt("traveltime")
                        + studytime * rs.getInt("studytime")
                        + failures * rs.getInt("failures")
                        + schoolsup * rs.getInt("schoolsup")
                        + famsup * rs.getInt("famsup")
                        + paid * rs.getInt("paid")
                        + activities * rs.getInt("activities")
                        + internet * rs.getInt("internet")
                        + famrel * rs.getInt("famrel")
                        + freetime * rs.getInt("freetime")
                        + goout * rs.getInt("goout")
                        + health * rs.getInt("health")
                        + absences * rs.getInt("absences")
                        + g1 * rs.getInt("g1")
                        + g2 * rs.getInt("g2");
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

        return output;
    }
}
