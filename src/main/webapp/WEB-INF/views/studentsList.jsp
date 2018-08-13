<%-- 
    Document   : newStudentInformation
    Created on : Jun 24, 2018, 8:35:49 AM
    Author     : santo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Students List</title>

        <%@include file="../common/dashboardsidemenu.jspf" %>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">

            <h2>Student List</h2>
        </div>
        <div class="table-responsive">
            <table class="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Full Name </th>
                        <th>Address</th>
                        <th>Gender</th>
                        <th>DOB</th>
                        <th>Age </th>
                        <th>Date of Admission </th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${AllStudent}" var="p">
                        <tr>
                            <td>${p.student_id}</td>
                            <td>${p.fullname}</td>
                            <td>${p.address}</td>
                            <td>${p.gender}</td>
                            <td>${p.dob}</td> 
                            <td>${p.age}</td>
                            <td>${p.dao}</td>




                            <td>
                                <a href="EditStudent?id=${p.student_id}">Edit</a>
                                <a href="DeleteStudent?id=${p.student_id}">Delete</a>
                                <a href="ViewReport?id=${p.student_id}">View Report</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </main>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>');</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

    <!-- Icons -->
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script>
        feather.replace();
    </script>

</body>
</html>
