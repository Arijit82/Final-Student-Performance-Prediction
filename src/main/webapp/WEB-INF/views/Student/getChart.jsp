<%-- 
    Document   : getChart
    Created on : Sep 26, 2018, 12:05:15 PM
    Author     : sanji
--%>

<%@page import="com.performanceprediction.connection.ConnectionManager"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>


<%
    System.out.println("getchart");
    try {
        int id = 21;
        Gson gsonObj = new Gson();
        Map<Object, Object> map = null;
        List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();

        Connection currentCon = ConnectionManager.getConnection();
        Statement stmt = currentCon.createStatement();
        ResultSet resultSet = stmt.executeQuery("select tq.g1,tq.g2,po.regoutput from Teacher_Question tq join predictedoutput po on"
                + " tq.StudentId=po.StudentId where tq.StudentId=" + id);

        while (resultSet.next()) {
            map = new HashMap<Object, Object>();
            map.put("label", "G1");
            map.put("y",Double.parseDouble(resultSet.getString("g1")));
            list.add(map);
            map = new HashMap<Object, Object>();
            map.put("label", "G2");
            map.put("y",Double.parseDouble(resultSet.getString("g2")));
            list.add(map);
            map = new HashMap<Object, Object>();
            map.put("label", "G3");
            map.put("y",Double.parseDouble(resultSet.getString("regoutput")));
            list.add(map);

            }

       

        String dataPoints = gsonObj.toJson(list);

    } catch (Exception e) {
        System.err.println("Problem occurred creating chart.");
    }

%>
