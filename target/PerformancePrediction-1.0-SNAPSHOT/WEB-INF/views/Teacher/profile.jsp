<%-- 
    Document   : newStudentInformation
    Created on : Jun 24, 2018, 8:35:49 AM
    Author     : santo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Profile</title>
        <%@include file="../../common/DashboardMenu.jspf" %>


    </head>
    <body>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h2>Profile</h2>
            </div>
            <!--            <div class="row">
                            <div class="col-11"><img src="images/logo.png" class="rounded float-right" alt="logo" style="height:300px; weight:300px;"></div>
                        </div>-->

            <div style="width: 500px; align-content: center; align-self: center;">
                <table class="table">

                    <tbody>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Teacher ID</label></th>
                            <td> <label> ${teacherid} </label></td>

                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th><label>Full Name</label></th>
                            <td> <label> ${teachername} </label></td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th>   <label>Address</label></th>
                            <td>   <label> ${address}</label></td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th>  <label>Mobile no.</label></th>
                            <td>  <label> ${contact} </label></td>
                        </tr>
                        <tr>
                            <th scope="row"></th>
                            <th>  <label>Email</label></th>
                            <td>  <label> ${email} </label></td>
                        </tr>

                        <tr>
                            <th scope="row"></th>
                            <th>  <label>Assign Subject</label></th>
                            <td><label> ${assignedsubject}</label></td>
                        </tr>
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
