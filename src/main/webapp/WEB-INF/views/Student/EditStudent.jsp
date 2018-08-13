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
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="images/pc_logo_JoQ_icon.ico">

        <title>New Student</title>

       <%@include file="../../common/DashboardMenu.jspf" %>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h2>Edit Student Information</h2>
    </div>
    <div class="row">
        <div class="col-11"><img src="images/logo.png" class="rounded float-right" alt="logo.png" style="height: 200px; width: 200px;">
        </div>
    </div>
    <c:forEach items="${getStudentById}" var="p"> 
     <form action="EditStudent" method="post">

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Student ID</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Student ID" name="sid" value="${p.student_id}" >
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Student Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Full Name" name="fullname" value="${p.studentname}">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Address</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Address" name="address" value="${p.address}">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Gender</label>
                <div class="col-sm-10">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="M">
                        <label class="form-check-label" for="inlineRadio1">Male</label>
                    </div>
                    <div class="form-check form-check-inline">

                        <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="F">
                        <label class="form-check-label" for="inlineRadio2">Female</label>

                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Date Of Birth</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" placeholder="Date of Birth" name="dob" value="${p.dob}">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Age</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" placeholder="Age" name="age" value="${p.age}">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Date Of Addmission</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" placeholder="Date of Admission" name="doa" value="${p.doa}">
                </div>
            </div>
                   <div class="form-group row">
                <label class="col-sm-2 col-form-label">Parent Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Parent Name" name="pname" value="${p.parentName}">
                </div>
            </div>
                  <div class="form-group row">
                <label class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" placeholder="Email" name="email" value="${p.email}">
                </div>
            </div>
                  <div class="form-group row">
                <label class="col-sm-2 col-form-label">Phone No</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Phone No" name="phoneno" value="${p.phoneNo}">
                </div>
                  </div>
                  <div class="form-group row">
                <label class="col-sm-2 col-form-label">Mother Edu</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" placeholder="Mother Edu" name="medu" value="${p.medu}">
                </div>
            </div>
                  <div class="form-group row">
                <label class="col-sm-2 col-form-label">Father Edu</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" placeholder="Father Edu" name="fedu" value="${p.fedu}">
                </div>
            </div>
          
                 <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
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
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

<!-- Icons -->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace();
</script>

<!-- Graphs -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
</body>
</html>
