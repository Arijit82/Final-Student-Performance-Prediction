/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.ID3;

import com.performanceprediction.connection.ConnectionManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author sanji
 */
public class id3 {

    static Connection currentCon = null;
    static ResultSet rs = null;
    Statement stmt = null;

    private Instances trainingData;
    String results;

    public id3() {

    }

    public String id3predictedvalue(int id) {
        try {
            ID3TestInstanceBean id3bean = new ID3TestInstanceBean();
            id3 decisionTree = new id3("R:\\WorkPlace\\New folder\\PerformancePrediction\\src\\main\\java\\com\\performanceprediction\\ID3\\student-data_id3.csv");
            J48 tree = decisionTree.performTraining();

            System.out.println("Tree: " + tree.toString());
            System.out.println("---------------------------------------");



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

                } //if user exists set the isValid variable to true
                else if (more) {

                    if (rs.getInt("famsize") > 3) {
                        id3bean.setFamsize("GT3");
                    } else {
                        id3bean.setFamsize("LE3");
                    }

                    if (rs.getInt("pstatus") == 1) {
                        id3bean.setPstatus("T");
                    } else if (rs.getInt("pstatus") == 0) {
                        id3bean.setPstatus("A");
                    }

                    id3bean.setMedu(rs.getInt("medu"));
                    id3bean.setFedu(rs.getInt("fedu"));
                    id3bean.setTraveltime(rs.getInt("traveltime"));
                    id3bean.setStudytime(rs.getInt("studytime"));
                    id3bean.setFailures(rs.getInt("failures"));

                    if (rs.getInt("schoolsup") == 1) {
                        id3bean.setSchoolsup("yes");
                    } else if (rs.getInt("schoolsup") == 0) {
                        id3bean.setSchoolsup("no");
                    }

                    if (rs.getInt("famsup") == 1) {
                        id3bean.setFamsup("yes");
                    } else if (rs.getInt("famsup") == 0) {
                        id3bean.setFamsup("no");
                    }

                    if (rs.getInt("paid") == 1) {
                        id3bean.setPaid("yes");
                    } else if (rs.getInt("paid") == 0) {
                        id3bean.setPaid("no");
                    }

                    if (rs.getInt("activities") == 1) {
                        id3bean.setActivities("yes");
                    } else if (rs.getInt("activities") == 0) {
                        id3bean.setActivities("no");
                    }

                    if (rs.getInt("internet") == 1) {
                        id3bean.setInternet("yes");
                    } else if (rs.getInt("internet") == 0) {
                        id3bean.setInternet("no");
                    }

                    id3bean.setFamrel(rs.getInt("famrel"));
                    id3bean.setFreetime(rs.getInt("freetime"));
                    id3bean.setGoout(rs.getInt("goout"));
                    id3bean.setHealth(rs.getInt("health"));
                    id3bean.setAbsences(rs.getInt("absences"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Instance testInstance = decisionTree.getTestInstance(id3bean.getFamsize(), id3bean.getPstatus(),
                    id3bean.getMedu(), id3bean.getFedu(), id3bean.getTraveltime(), id3bean.getStudytime(),
                    id3bean.getFailures(), id3bean.getSchoolsup(), id3bean.getFamsup(), id3bean.getPaid(),
                    id3bean.getActivities(), id3bean.getInternet(), id3bean.getFamrel(), id3bean.getFreetime(),
                    id3bean.getGoout(), id3bean.getHealth(), id3bean.getAbsences());

            int result = (int) tree.classifyInstance(testInstance);
            results = decisionTree.trainingData.attribute(17).value(result);
            System.out.println(
                    "Test with: " + testInstance + "  Result: " + results);

           
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return results;
    }

    public id3(String fileName) throws Exception {
        try {
            ConverterUtils.DataSource source = new ConverterUtils.DataSource(fileName);
            trainingData = source.getDataSet();
            trainingData.setClassIndex(trainingData.numAttributes() - 1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private J48 performTraining() {
        J48 j48 = new J48();
        String[] options = {"-U"};
//        Use unpruned tree. -U
        try {
            j48.setOptions(options);
            j48.buildClassifier(trainingData);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return j48;
    }

    private Instance getTestInstance(String famsize, String pstatus, int medu, int fedu, int traveltime,
            int studytime, int failures, String schoolsup, String famsup, String paid, String activities,
            String internet, int famrel, int freetime, int goout, int health, int absences) {

        Instance instance = new DenseInstance(17);
        instance.setDataset(trainingData);
        instance.setValue(trainingData.attribute(0), famsize);
        instance.setValue(trainingData.attribute(1), pstatus);
        instance.setValue(trainingData.attribute(2), medu);
        instance.setValue(trainingData.attribute(3), fedu);
        instance.setValue(trainingData.attribute(4), traveltime);
        instance.setValue(trainingData.attribute(5), studytime);
        instance.setValue(trainingData.attribute(6), failures);
        instance.setValue(trainingData.attribute(7), schoolsup);
        instance.setValue(trainingData.attribute(8), famsup);
        instance.setValue(trainingData.attribute(9), paid);
        instance.setValue(trainingData.attribute(10), activities);
        instance.setValue(trainingData.attribute(11), internet);
        instance.setValue(trainingData.attribute(12), famrel);
        instance.setValue(trainingData.attribute(13), freetime);
        instance.setValue(trainingData.attribute(14), goout);
        instance.setValue(trainingData.attribute(15), health);
        instance.setValue(trainingData.attribute(16), absences);
        return instance;
    }

}
