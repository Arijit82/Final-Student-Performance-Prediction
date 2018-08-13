<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.sql.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
 
<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
String dataPoints = null;
 
try{
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sppd", "system", "sppd");
	Statement statement = connection.createStatement();
	String g1, g2,g3;
	String sql = "select * from teacher_question tq,predictedoutput po where tq.student_id= + ${id}";
	ResultSet resultSet = statement.executeQuery(sql);
	
	while(resultSet.next()){
		g1 = resultSet.getString("g1");
		g2 = resultSet.getString("g2");
                g3 = resultSet.getString("g3");
		map = new HashMap<Object,Object>(); map.put("g1", Double.parseDouble(g1)); map.put("g2", Double.parseDouble(g2)); map.put("g3", Double.parseDouble(g3)); list.add(map);
		dataPoints = gsonObj.toJson(list);
	}
	connection.close();
}
catch(SQLException e){
	out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
	dataPoints = null;
}
%>
 
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
window.onload = function() { 
 
<% if(dataPoints != null) { %>
var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	exportEnabled: true,
	title: {
		text: "JSP Column Chart from Database"
	},
	data: [{
		type: "column", //change type to bar, line, area, pie, etc
		dataPoints: <%out.print(dataPoints);%>
	}]
});
chart.render();
<% } %> 
 
}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>