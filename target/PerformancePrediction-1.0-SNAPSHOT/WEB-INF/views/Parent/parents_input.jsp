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
            <title>Parents</title>
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
                    /*text-align: center;*/
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
                .label1{
                    border-bottom: none !important;
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
                    /*transition: all 0.3 ease;*/
                    cursor: pointer;
                    margin-top: 15px;
                }
                .form button:hover,.form button:active,.form button:focus {
                    background: #43A047;
                }
            </style>
        </head>
        <body>
            <div class="jumbotron form-container">
                
                <form class="needs-validation form form-page" method="post" action="ParentInput"> 
                    <h2>Student Information</h2>
                    <hr>
                    <div class="form-check form-check-inline">
                        <label class="form-control-plaintext label1">Student ID</label> <input style="background:#fff; border:1px solid #666666" type="text" name="sid">
                    </div>
                    <label class="form-control-plaintext">Family Size</label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famsize" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Greater Than 3</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famsize" id="inlineRadio2" value="0" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio2">Less Than 3</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext">Parent Status </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="pstatus" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Living Together</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="pstatus" id="inlineRadio2" value="0" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio2">Apart</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext">Travel Time from Home to School</label>

                    <div class="form-check form-check-inline">
                        <input type="radio" name="traveltime" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1"><15 min</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="traveltime" id="inlineRadio2" value="2" >
                        <label class="form-control-plaintext label1" for="inlineRadio2">15 to 30 min</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="traveltime" id="inlineRadio2" value="3" >
                        <label class="form-control-plaintext label1" for="inlineRadio2">30 min. to 1 hour</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="traveltime" id="inlineRadio2" value="4" >
                        <label class="form-control-plaintext label1" for="inlineRadio2">>1 hour</label>
                    </div>
                    <!--                            <div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext">Study Time at Home</label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="studytime" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1"> <2 hours</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="studytime" id="inlineRadio2" value="2" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> 2 to 5 hours</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="studytime" id="inlineRadio2" value="3" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> 5 to 10 hours</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="studytime" id="inlineRadio2" value="4" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> >10 hours</label>
                    </div>
                    <!--                                                <div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext">Past Class Failures </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="failure" id="inlineRadio1" value="0" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">0</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="failure" id="inlineRadio1" value="1">
                        <label class="form-control-plaintext label1" for="inlineRadio1">1</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="failure" id="inlineRadio2" value="2" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> 2</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="failure" id="inlineRadio2" value="3" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> 3</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="failure" id="inlineRadio2" value="4" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> 4</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext">Extra Educational Support  </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="schoolsup" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Yes</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="schoolsup" id="inlineRadio2" value="0" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> No</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext">Family Educational Support  </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famsup" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Yes</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famsup" id="inlineRadio2" value="0" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> No</label>
                    </div>
                    <!--                                                                                                <div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext"> extra paid classes within the course subject  </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="paid" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Yes</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="paid" id="inlineRadio2" value="0" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> No</label>
                    </div>
                    <!--                                                                                                            <div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext"> Internet  </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="internet" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Yes</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="internet" id="inlineRadio2" value="0" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> No</label>
                    </div>
                    <!--                                                                                                                        <div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext"> quality of family relationships   </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famrel" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Very Bad</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famrel" id="inlineRadio2" value="2" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> Bad</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famrel" id="inlineRadio1" value="3" >
                        <label class="form-control-plaintext label1" for="inlineRadio1">Good</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famrel" id="inlineRadio2" value="4" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> Very Good</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="famrel" id="inlineRadio2" value="5" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> Excellent</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext"> free time after school </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="freetime" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Very low</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="freetime" id="inlineRadio2" value="2" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> low</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="freetime" id="inlineRadio1" value="3" >
                        <label class="form-control-plaintext label1" for="inlineRadio1">medium</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="freetime" id="inlineRadio2" value="4" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> high</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="freetime" id="inlineRadio2" value="5" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> very high</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext"> going out with friends  </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="goout" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Very low</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="goout" id="inlineRadio2" value="2">
                        <label class="form-control-plaintext label1" for="inlineRadio2"> low</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="goout" id="inlineRadio1" value="3">
                        <label class="form-control-plaintext label1" for="inlineRadio1">medium</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="goout" id="inlineRadio2" value="4">
                        <label class="form-control-plaintext label1" for="inlineRadio2"> high</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="goout" id="inlineRadio2" value="5">
                        <label class="form-control-plaintext label1" for="inlineRadio2"> very high</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <label class="form-control-plaintext"> current health status  </label>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="health" id="inlineRadio1" value="1" checked>
                        <label class="form-control-plaintext label1" for="inlineRadio1">Very bad</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="health" id="inlineRadio2" value="2" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> bad</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="health" id="inlineRadio1" value="3" >
                        <label class="form-control-plaintext label1" for="inlineRadio1">good</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="health" id="inlineRadio2" value="4" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> very good </label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input type="radio" name="health" id="inlineRadio2" value="5" >
                        <label class="form-control-plaintext label1" for="inlineRadio2"> Excellent</label>
                    </div>
                    <!--<div class="form-check form-check-inline">-->
                    <button type="submit" class="btn btn-primary">Save</button>
                </form>
        </body>
    </html>

