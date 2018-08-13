      
function validateNewStudent() {
    var fullname = document.forms["addstudent"]["fullname"].value;
    var address = document.forms["addstudent"]["address"].value;


    var letters = /^[a-zA-Z ]*$/;
    var name = document.getElementById('stdfn');
    if (fullname.match(letters)) {
        debugger;
       console.log(fullname);
    }else{
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
    checkDOB();
   
}
 function checkDOB() {
        var dateString = document.getElementById('dob').value;
        var myDate = new Date(dateString);
        var today = new Date();
        if ( myDate > today ) { 
            debugger;
          document.getElementById('spndob').innerHTML = "You cannot enter a date in the future!.";
          document.getElementById('dob').focus();
            return false;
        }
        return true;
    }