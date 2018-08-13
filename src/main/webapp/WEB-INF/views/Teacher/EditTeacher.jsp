<%-- 
    Document   : EditTeacher
    Created on : Jul 6, 2018, 10:11:31 PM
    Author     : sanji
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
            <h2>Edit Teacher Information</h2>
        </div>
        <div class="row">
            <div class="col-11"><img src="images/logo.png" class="rounded float-right" alt="logo.png" style="height: 200px; width: 200px;">
            </div>
        </div>

        <c:forEach items="${getTecherById}" var="t"> 
            <form action="EditTeacher" method="post">

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Teacher ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Teacher ID" name="tid" value="${t.teacherid}" >
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Full Name</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Full Name" name="fullname" value="${t.fullname}">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Address</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Address" name="address" value="${t.address}">
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" placeholder="Email" name="email" value="${t.email}">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Assigned Subject</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Assigned Subject" name="assignedsubject" value="${t.assignedsubject}">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Contact</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Contact" name="contact" value="${t.contact}">
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" placeholder="Password" name="password" value="${t.tpassword}">
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
<script src="../../assets/js/vendor/popper.min.js"></script>
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

