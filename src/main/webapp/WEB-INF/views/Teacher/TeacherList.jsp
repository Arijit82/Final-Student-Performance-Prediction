<%-- 
    Document   : manageStudents
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

        <title>Teacher</title>

        <style>
            .button1{
                margin-top: 10px;
                margin-bottom: 10px;
            }
        </style>

        <%@include file="../../common/DashboardMenu.jspf" %>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
            <h2>Teacher Details</h2>
        </div>
        <div class="row">                        
            <div class="col"><a href="AddNewTeacher"><button type="button" class="btn btn-dark btn-sm ">Add New Teacher</button></a></div>
        </div>
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">

            <h2 Style="text-align: center;">Teacher List</h2>
        </div>
        <div class="table-responsive">
            <table class="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>FullName </th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Contact </th>
                        <th>Assigned Subjecct</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${AllTeacher}" var="t">
                        <tr>
                            <td>${t.teacherid}</td>
                            <td>${t.fullname}</td>
                            <td>${t.address}</td>
                            <td>${t.email}</td>
                            <td>${t.contact}</td>
                            <td>${t.assignedsubject}</td> 
                        
                            <td>
                                <a class="btn"href="EditTeacher?id=${t.teacherid}">Edit</a>
                                <a class="btn" href="DeleteTeacher?id=${t.teacherid}">Delete</a>

                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    </main>
</div>
</div>

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
