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
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="images/pc_logo_JoQ_icon.ico">

        <title>New Student</title>

        <%@include file="../../common/DashboardMenu.jspf" %>


    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
            <h2>New Student Information</h2>
        </div>
<!--        <div class="row">
            <div class="col-11"><img src="images/logo.png" class="rounded float-right" alt="logo.png" style="height: 200px; width: 200px;"></div>
        </div>-->
        <form action="AddNewStudent" method="post" name="addstudent" onsubmit="return validateNewStudent()">
            <!--              <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Student ID</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="Student ID" name="sid">
                            </div>
                        </div>-->
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Full Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Full Name" name="fullname" required id="stdfn" minlength="5" maxlength="30" >
                    <span class="text-danger" id="spnstdfn"></span>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Address</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" placeholder="Address" name="address" required id="addresss" minlength="5" maxlength="50">
                    <span class="text-danger" id="spnaddress"></span>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Gender</label>
                <div class="col-sm-10">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="M" checked required>
                        <label class="form-check-label" for="inlineRadio1">Male</label>
                    </div>
                    <div class="form-check form-check-inline">

                        <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="F" required>
                        <label class="form-check-label" for="inlineRadio2">Female</label>

                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Date Of Birth</label>
                <div class="col-sm-10">
                    <input type="date" id="dob" class="form-control" placeholder="Date of Birth" name="dob" required>
                    <span class="text-danger" id="spndob"></span>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Age</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" placeholder="Age" name="age" id="age" required>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Date Of Addmission</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" placeholder="Date of Admission" name="doa" required>
                </div>
            </div>

            <p>
                <a class="btn btn-light form-control" data-toggle="collapse" href="#addparentdetails" role="button" aria-expanded="false">Add Parents Detail</a>
            </p>
            <div class="row">
                <div class="col">
                    <div class="collapse" id="addparentdetails">
                        <div class="card card-body">
                            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                                <h2>Parent's Detail</h2>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">Parent Name</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="parentname" placeholder="Parent Name" required>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">Email</label>
                                <div class="col-sm-10">
                                    <input type="email" class="form-control" placeholder="Email" name="email" required>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">Phone No:</label>
                                <div class="col-sm-10">
                                    <input type="number" class="form-control" placeholder="Phone Number" name="phoneno" required>
                                </div>
                            </div>

                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">Mother Education</label>
                                <div class="col-sm-10">
                                    <input type="number" class="form-control" name="medu" placeholder="Mother Education" required>
                                    <small class="form-text text-muted">Enter 0 - none,  1 - primary education (4th grade), 2 – 5th to 9th grade, 3 – secondary education or 4 – higher education </small>

                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">Father Education</label>
                                <div class="col-sm-10">
                                    <input type="number" name="fedu" class="form-control" placeholder="Father Education" required>
                                    <small class="form-text text-muted">Enter 0 - none,  1 - primary education (4th grade), 2 – 5th to 9th grade, 3 – secondary education or 4 – higher education </small>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
            </div>
        </form>

    </main>
    <!--    <script src="js/FormValidation.js" type="text/javascript"></script>-->
    <script>

        function validateNewStudent() {
            var fullname = document.forms["addstudent"]["fullname"].value;
            var address = document.forms["addstudent"]["address"].value;
            var dob = document.forms["addstudent"]["dob"].value;

            var letters = /^[a-zA-Z ]*$/;
            var name = document.getElementById('stdfn');
            if (fullname.match(letters)) {
                debugger;
                console.log(fullname);
            } else {
                document.getElementById('spnstdfn').innerHTML = "Only letters and white space allowed";
                //  debugger;
                name.focus();

                return false;
            }


            if (address.length > 50) {
                document.getElementById('spnaddress').innerHTML = "Max Length 50";
                document.getElementById('address').focus();
                return false;
            }
            var myDate = new Date(dob);
            var today = new Date();
            if (myDate > today) {
                debugger;
                document.getElementById('spndob').innerHTML = "You cannot enter a date in the future!.";
                document.getElementById('dob').focus();
                return false;
            } else {
                return true;
            }

        }

    </script>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!--Placed at the end of the document so the pages load faster--> 
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
