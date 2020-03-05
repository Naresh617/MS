<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>header</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <form action="UpdateServlet" method="post">
      <div class="row">
         <div class="col">
         <label for="uname"><strong>District Name</strong></label>
         <input type="text" class="form-control"  name="dname" placeholder=" Enter 33KV Feeder Name"    name="fname" required="required" >
      </div>
      <div class="col">
         <label for="uname"><strong>PTR CAPCITY @EHT LEVEL</strong></label>
         <input type="text" class="form-control"  name="ptrname" placeholder=" Enter 33KV Feeder Name"  required="required" >
      </div>
      <div class="col">
         <label for="uname"><strong>PTR CAPACTIY @33KV FEEDER</strong></label>
         <input type="text" class="form-control"  name="ptr33" placeholder=" Enter PTR CAPACTIY @33KV FEEDER" name="fname" required="required">
      </div>
      </div>
      <div class="row">
      <div class="col"><br>
         <label for="uname"><strong>PTR CAPCITY @EHT LEVEL</strong></label>
         <input type="text" class="form-control"  placeholder=" Enter PTR CAPCITY @EHT LEVEL" name="capcitylevel" required="required">
      </div>
       <div class="col"><br>
         <label for="uname"><strong>CIRCLE</strong></label>
         <input type="text" class="form-control"  placeholder=" Enter CIRCLE" name="circle" required="required">
      </div>
        <div class="col"><br>
         <label for="uname"><strong>DIVISION</strong></label>
         <input type="text" class="form-control"  name="dname" placeholder=" Enter DIVISION" name="division" required="required">
      </div>
      </div>
       <div class="row">
      	<div class="col"><br>
         <label for="uname"><strong>DATE</strong></label>
         <input type="DATE" class="form-control"  name="dname" placeholder=" Enter DIVISION" name="date" required="required">
      	</div>
      </div><br>

      <input type="submit" value="update">
      </form>
    </div>
</body>
</html>