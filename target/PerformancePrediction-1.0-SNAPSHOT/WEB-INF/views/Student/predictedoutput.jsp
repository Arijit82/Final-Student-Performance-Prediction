<%-- 
    Document   : newStudentInformation
    Created on : Jun 24, 2018, 8:35:49 AM
    Author     : santo
--%>
<%@page import="java.util.*" %>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>
<%@page import="com.performanceprediction.connection.ConnectionManager"%>
<%@page import="java.sql.*"%>

<%
    int id = (int) request.getAttribute("stdid");
    Gson gsonObj = new Gson();
    Map<Object, Object> map = null;
    List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();

    Connection currentCon = ConnectionManager.getConnection();
    Statement stmt = currentCon.createStatement();
    ResultSet resultSet = stmt.executeQuery("select distinct tq.g1,tq.g2,po.regoutput from Teacher_Question tq join predictedoutput po on"
            + " tq.StudentId=po.StudentId where tq.StudentId=" + id);

    while (resultSet.next()) {
        map = new HashMap<Object, Object>();
        map.put("label", "G1");
        map.put("y", Double.parseDouble(resultSet.getString("g1")));
        list.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "G2");
        map.put("y", Double.parseDouble(resultSet.getString("g2")));
        list.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "G3");
        map.put("y", Double.parseDouble(resultSet.getString("regoutput")));
        list.add(map);
    }
    String dataPoints = gsonObj.toJson(list);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Profile</title>
        <style>
            form img{
                position: absolute;
                top: 80px;
                bottom: 30px;
                left: 600px;
                right: 50px;
            }

        </style>

        <script type="text/javascript">
            window.onload = function () {

                var chart = new CanvasJS.Chart("chartContainer", {
                    title: {
                        text: "Student Performance Prediction"
                    },
                    axisX: {
                        title: "Grade"
                    },
                    axisY: {
                        title: "Score"
                    },
                    data: [{
                            type: "column",
                            yValueFormatString: "#,##0.0# ",
                            dataPoints: <%=dataPoints%>
                        }]
                });
                chart.render();
            };
        </script>

        <%--<%@include file="../common/dashboardsidemenu.jspf" %>--%>
        <%@include file="../../common/DashboardMenu.jspf" %>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
            <h2>Result</h2>
        </div>

        <c:forEach items="${getStudentById}" var="p" >  
            <div class="row" style="margin-top: 70px;">
            <div style="width: 50%;">
                <table class="table">
                    <tbody>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Full Name</label></th>
                            <td> <label> ${p.studentname} </label></td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Address</label></th>
                            <td> <label> ${p.address} </label></td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Gender</label></th>
                            <td>  <label> ${p.gender} </label></td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Subject</label></th>
                            <td>Math</td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Predicted Result(LR)</label></th>
                            <th style="color: green;">${output}<br> <span style="color: grey; font-size: 10px;">out of 20</span></th>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Predicted Grade(ID3)</label></th>
                            <th style="color: green;">${id3output}  <br><span style="color: grey; font-size: 10px;">Yes: pass | No: Fail</span></th>
                            
                        </tr>
                    </tbody>
                </table>
            </div>
        </c:forEach>
        <div id="chartContainer" style=" width: 50%;"></div>
            </div>
    </main>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>');</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    <!-- Icons -->
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script>
            feather.replace();
    </script>

</body>
</html>
