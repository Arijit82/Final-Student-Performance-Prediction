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

        <title>Teacher</title>

      <%@include file="../../common/DashboardMenu.jspf" %>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
            <h2>Teacher Information</h2>
        </div>
        <div class="row">
            <div class="col-11"><img src="logo.png" class="rounded float-right" alt="logo.png"></div>
        </div>
        <form action="AddNewTeacher" method="post">
<!--            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Teacher ID</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Teacher ID" name="tid">
                </div>
            </div>-->
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Full Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Full Name" name="fullname">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Mobile no.</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" placeholder="Mobileno" name="contact">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" placeholder="Email" name="email">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Address</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Address" name="address">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Assigned Subject</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Assign Subject" name="assubject">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Password</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" placeholder="Password" name="password">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
            </div>
        </form>
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
