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

        <%--<%@include file="../common/dashboardsidemenu.jspf" %>--%>
          <%@include file="../../common/DashboardMenu.jspf" %>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
            <h2>Result</h2>
        </div>
        
        <c:forEach items="${getStudentById}" var="p" >  
        
         <form style="margin: 150px;">
                <img src="images/logo.png" alt="logo" style="height:200px; width:200px;">
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Full Name</label>
                    <div class="col-sm-10">
                      
                        <label> ${p.studentname} </label>
                       
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Address</label>
                    <div class="col-sm-10">
                        <label> ${p.address} </label>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Gender</label>
                    <div class="col-sm-10">
                        <label> ${p.gender} </label>
                    </div>
                </div>
                <div class="row">
                    <table class="col-6" style="margin: 5px; padding: 5px;">
                        <thead>
                        <td>Subject</td>
                        <td>Predicted Grade (LR)</td>
                        <td>Passed (ID3)</td>
                        </thead>
                        <tr>
                            <td>Math</td>
                            <td>${output}</td>
                            <td>${id3output}</td>
                        </tr>

                    </table>
                  
                </div>
            </form>
        
        
        </c:forEach>
           

    </div>
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
