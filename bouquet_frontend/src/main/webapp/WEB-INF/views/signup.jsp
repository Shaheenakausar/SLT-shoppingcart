<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow">

    <title>Signup form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style type="text/css">
    
    </style>
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'https://bootsnipp.com');
        });
    </script>
<title>Insert title here</title>
</head>
<%@include file="header.jsp"%>
<body background="resources//images/1.jpg">

    <div id="login-overlay" class="modal-dialog">
      <div class="modal-content">
          <div class="modal-header">
              <h4 class="modal-title" id="myModalLabel">Register with YaelsEverythingStore.com</h4>
              <p>Please Register to Shop at <b>Bouquet Store</b>.
                You will instantly receive hundreds of amazing shopping deals,  
                or go back to our <a href="./index.jsp">main site</a>.</p>
            </div>
          
            <div class="modal-body">
              
            
                <form id="registerForm" method="POST" >
<!---form--->           <div class="form-group">
<!---input width--->    <div class="col-xs-6">
                        <label for="InputName">First Name</label>
                        <div class="input-group">
                        <input type="text" class="form-control" name="first_name" placeholder="Enter First Name" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        </div>
                        <br>
                        <label for="InputName">Username</label>
                        <div class="input-group">
                        <input type="text" class="form-control" name="username" placeholder="Enter Username" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
<!--------------------------------------separator---------------------------------------------------------------> <hr>
                </div>
                </div>
                    <div class="form-group">
                    <div class="col-xs-6">

                        <label for="InputName">Last Name</label>
                        <div class="input-group">
                        <input type="text" class="form-control" name="last_name" placeholder="Enter Last Name" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        </div>
                    
                        <br>
                        <label for="InputPassword">Enter Password</label>
                        <div class="input-group">
                        <input type="password" class="form-control" name="password" placeholder="Enter Password" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
<!--------------------------------------separator---------------------------------------------------------------> <hr>
                </div>       
                </div> 
                
                    <div class="form-group"> 
                        <div class="col-xs-12">
                        <label for="InputEmail">Enter Email</label>
                        <div class="input-group">
                        <input type="email" class="form-control" name="email" placeholder="Enter Email" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
<!----------------------------break-------------------------------------------------------------> <br>
                     </div>
                 </div>

                        <div class="form-group">
                        <div class="col-xs-12">
                        <label for="InputStreetName">Address</label>
                        <div class="input-group">
                        <input type="text" class="form-control" name="street_name" placeholder="Enter Street Name and Number" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        </div>
<!----------------------------break-------------------------------------------------------------> <br> 
                    </div>                     
                </div>
             
                        <div class="form-group">
                        <div class="col-xs-12">
                        <label for="InputCity">City</label>
                        <div class="input-group">
                        <input type="text" class="form-control" name="city" placeholder="Enter City" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
<!----------------------------break-------------------------------------------------------------> <br> 
                    </div>
                    </div>

                        <div class="form-group">
                        <div class="col-xs-12">
                        <label for="InputProvince">Pincode</label>
                        <div class="input-group">
                        <input type="text" class="form-control" name="pincode" placeholder="Enter Pincode" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span> 
                    </div>
<!----------------------------break-------------------------------------------------------------> <br>                     
                   </div>
                </div>
                  <br>
                        <label for="PhoneNumber">Phone Number</label>
                        <div class="input-group">
                        <input type="phoneno" class="form-control" name="phoneno" placeholder="Enter Phone Number" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
<!----------------------------break-------------------------------------------------------------> <br>
                    </div>
                  <div class="form-group">
                  <div class="input-group-addon">
                  <input type="submit" name="submit" id="submit" value="Submit" class="btn btn-success pull-right">
                  
                  </div>
                </div>
                </form>
              </div><!---modal-body--->
          </div>
       </div>


<script type="text/javascript">

</script>
</body>
</html>