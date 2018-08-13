<%-- 
    Document   : teacherinput
    Created on : Jun 29, 2018, 10:54:31 AM
    Author     : santo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teacher</title>
        <link href="css/bootstrap4.1.1.min.css" rel="stylesheet" type="text/css"/>
      <%@include file="../../../common/DashboardMenu.jspf" %>

        <style>
            .form-container{
                width: 100%;
                height: 100%;
                background: #76b852;
            }
            .form-page{
                width: 760px;
                padding: 5% 0 0;
                margin: auto;
            }
            .form {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 760px;
                margin: 0 auto 100px;
                padding: 45px;
                text-align: center;
                box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            }
            .form input {
                font-family: "Roboto", sans-serif;
                outline: 0;
                background: #f2f2f2;
                width: auto;
                border: 0;
                padding: 15px;
                box-sizing: border-box;
                font-size: 14px;
                /*background: #0056b3;*/
                margin: 15px;
            }
            .form label{
                margin-bottom: 10px;
                text-align: left;
                border-bottom: solid #cccccc thin;
            }
            .form button {
                font-family: "Roboto", sans-serif;
                text-transform: uppercase;
                outline: 0;
                background: #4CAF50;
                width: 100%;
                border: 0;
                padding: 15px;
                color: #FFFFFF;
                font-size: 14px;
                -webkit-transition: all 0.3 ease;
                transition: all 0.3 ease;
                cursor: pointer;
                margin-top: 15px;
            }
            .form button:hover,.form button:active,.form button:focus {
                background: #43A047;
            }
        </style>
    </head>
    <body>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h2>New Student Information</h2>
            </div>
            <c:forEach items="${getStudentById}" var="p"> 
                <form class="needs-validation" method="POST" action="TeacherInput">
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Roll No. :</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" placeholder="Roll no" value="${p.student_id}" name="id" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Full Name :</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="Full Name" name="fullname" value="${p.studentname}" readonly>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Grage 1 :</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" placeholder="Grade 1" required name="g1">
                            <small class="form-text text-muted">Enter 1-20: 1-lowest 20-highest </small>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Grage 2 :</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" placeholder="Grade 2" required name="g2">
                            <small class="form-text text-muted">Enter 1-20: 1-lowest 20-highest </small>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Absenses :</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" placeholder="absenses" required name="absences">
                        </div>
                    </div>
                       
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">ECA</label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="activities" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Yes</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="activities" id="inlineRadio2" value="0">
                                <label class="form-check-label" for="inlineRadio2">No</label>

                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-10">
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </div>


                </form>
            </c:forEach>
            <script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
                (function () {
                    'use strict';
                    window.addEventListener('load', function () {
// Fetch all the forms we want to apply custom Bootstrap validation styles to
                        var forms = document.getElementsByClassName('needs-validation');
// Loop over them and prevent submission
                        var validation = Array.prototype.filter.call(forms, function (form) {
                            form.addEventListener('submit', function (event) {
                                if (form.checkValidity() === false) {
                                    event.preventDefault();
                                    event.stopPropagation();
                                }
                                form.classList.add('was-validated');
                            }, false);
                        });
                    }, false);
                })();
            </script>
    </body>
</html>
