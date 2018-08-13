<%-- 
    Document   : parents_input
    Created on : Jun 27, 2018, 7:27:33 AM
    Author     : santo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <!DOCTYPE html>
    <html>
        <head>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
            <title></title>
        </head>
        <body>
<!--            <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">-->
                    <h2>Student Information</h2>
                </div>
                <form class="needs-validation" method="post" action="ParentInput"> 

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Student ID</label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="text" name="sid">

                            </div>

                        </div>
                    </div>
<!--<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
  <label class="form-check-label" for="inlineRadio1">1</label>
</div>-->
                    
                        <label>Family Size</label>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="famsize" id="inlineRadio1" value="1" checked>
                                <label for="inlineRadio1">Greater Than 3</label>
                            </div>
                            <div>

                                <input type="radio" name="famsize" id="inlineRadio2" value="0" checked>
                                <label for="inlineRadio2">Less Than 3</label>

                            </div>
                        <!--</div>-->
<!--                    </div>-->
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Parent Status </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="pstatus" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Living Together</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="pstatus" id="inlineRadio2" value="0" checked>
                                <label class="form-check-label" for="inlineRadio2">Apart</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Travel Time from Home to School</label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="traveltime" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1"><15 min</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="traveltime" id="inlineRadio2" value="2" >
                                <label class="form-check-label" for="inlineRadio2">15 to 30 min</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="traveltime" id="inlineRadio2" value="3" >
                                <label class="form-check-label" for="inlineRadio2">30 min. to 1 hour</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="traveltime" id="inlineRadio2" value="4" >
                                <label class="form-check-label" for="inlineRadio2">>1 hour</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Study Time at Home</label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="studytime" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1"> <2 hours</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="studytime" id="inlineRadio2" value="2" >
                                <label class="form-check-label" for="inlineRadio2"> 2 to 5 hours</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="studytime" id="inlineRadio2" value="3" >
                                <label class="form-check-label" for="inlineRadio2"> 5 to 10 hours</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="studytime" id="inlineRadio2" value="4" >
                                <label class="form-check-label" for="inlineRadio2"> >10 hours</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Past Class Failures </label>
                        <div class="col-sm-10">
                             <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="failure" id="inlineRadio1" value="0" checked>
                                <label class="form-check-label" for="inlineRadio1">0</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="failure" id="inlineRadio1" value="1">
                                <label class="form-check-label" for="inlineRadio1">1</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="failure" id="inlineRadio2" value="2" >
                                <label class="form-check-label" for="inlineRadio2"> 2</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="failure" id="inlineRadio2" value="3" >
                                <label class="form-check-label" for="inlineRadio2"> 3</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="failure" id="inlineRadio2" value="4" >
                                <label class="form-check-label" for="inlineRadio2"> 4</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Extra Educational Support  </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="schoolsup" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Yes</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="schoolsup" id="inlineRadio2" value="0" >
                                <label class="form-check-label" for="inlineRadio2"> No</label>

                            </div>

                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">Family Educational Support  </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="famsup" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Yes</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="famsup" id="inlineRadio2" value="0" >
                                <label class="form-check-label" for="inlineRadio2"> No</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label"> extra paid classes within the course subject  </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="paid" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Yes</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="paid" id="inlineRadio2" value="0" >
                                <label class="form-check-label" for="inlineRadio2"> No</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label"> Internet  </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="internet" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Yes</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="internet" id="inlineRadio2" value="0" >
                                <label class="form-check-label" for="inlineRadio2"> No</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label"> quality of family relationships   </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="famrel" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Very Bad</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="famrel" id="inlineRadio2" value="2" >
                                <label class="form-check-label" for="inlineRadio2"> Bad</label>

                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="famrel" id="inlineRadio1" value="3" >
                                <label class="form-check-label" for="inlineRadio1">Good</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="famrel" id="inlineRadio2" value="4" >
                                <label class="form-check-label" for="inlineRadio2"> Very Good</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="famrel" id="inlineRadio2" value="5" >
                                <label class="form-check-label" for="inlineRadio2"> Excellent</label>

                            </div>
                        </div>
                    </div>
                    <br>


                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label"> free time after school </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="freetime" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Very low</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="freetime" id="inlineRadio2" value="2" >
                                <label class="form-check-label" for="inlineRadio2"> low</label>

                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="freetime" id="inlineRadio1" value="3" >
                                <label class="form-check-label" for="inlineRadio1">medium</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="freetime" id="inlineRadio2" value="4" >
                                <label class="form-check-label" for="inlineRadio2"> high</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="freetime" id="inlineRadio2" value="5" >
                                <label class="form-check-label" for="inlineRadio2"> very high</label>

                            </div>
                        </div>
                    </div>
                    <br>

                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label"> going out with friends  </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="goout" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Very low</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="goout" id="inlineRadio2" value="2">
                                <label class="form-check-label" for="inlineRadio2"> low</label>

                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="goout" id="inlineRadio1" value="3">
                                <label class="form-check-label" for="inlineRadio1">medium</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="goout" id="inlineRadio2" value="4">
                                <label class="form-check-label" for="inlineRadio2"> high</label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="goout" id="inlineRadio2" value="5">
                                <label class="form-check-label" for="inlineRadio2"> very high</label>

                            </div>
                        </div>
                    </div>
                    <br>


                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label"> current health status  </label>
                        <div class="col-sm-10">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="health" id="inlineRadio1" value="1" checked>
                                <label class="form-check-label" for="inlineRadio1">Very bad</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="health" id="inlineRadio2" value="2" >
                                <label class="form-check-label" for="inlineRadio2"> bad</label>

                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="health" id="inlineRadio1" value="3" >
                                <label class="form-check-label" for="inlineRadio1">good</label>
                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="health" id="inlineRadio2" value="4" >
                                <label class="form-check-label" for="inlineRadio2"> very good </label>

                            </div>
                            <div class="form-check form-check-inline">

                                <input class="form-check-input" type="radio" name="health" id="inlineRadio2" value="5" >
                                <label class="form-check-label" for="inlineRadio2"> Excellent</label>

                            </div>
                        </div>
                    </div>
                      <div class="form-group row">
                        <div class="col-sm-10">
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </div>
                    <br>



                </form>
            </main>
        </body>
    </html>
</html>
