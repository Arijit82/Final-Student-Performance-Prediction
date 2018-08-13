<%-- 
    Document   : PredictedResults
    Created on : Jul 15, 2018, 11:22:52 PM
    Author     : sanji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Manage Students</title>

        <style>
            .button1{
                margin-top: 10px;
                margin-bottom: 10px;
            }
        </style>

        <%@include file="../../common/DashboardMenu.jspf" %>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
            <h2>Predicted Results</h2>
        </div>

        <div class="table-responsive">
            <table class="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Student Name </th>
                        <th>Parent Name</th>
                        <th>Grade(Reg)</th>
                        <th>Passed(ID3)</th>


                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${PredictedResults}" var="p">
                        <tr>
                            <td>${p.stdid}</td>
                            <td>${p.stdname}</td>
                            <td>${p.parname}</td>
                            <td>${p.regout}</td>
                            <td>${p.idout}</td>


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

