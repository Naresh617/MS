<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html lang="en">
<head>
  <title>MIS Planning Application</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
  .card {
  box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);
}
body{
background-color: #82E0AA 
}
h1{
color: white
}
  </style>
</head>
<body >
<div class="container">
<h1 class="text-center mt-5">Welcome MIS Planning Application</h1>
<div class="container pt-3">
  <div class="row justify-content-sm-center">
    <div class="col-sm-10 col-md-6">
      <div class="card border-info">
        <div class="card-header">PLANNING MIS</div>
        <div class="card-body">
          <div class="row">
            <div class="col-md-6 text-center">
              <img src="https://www.apspdcl.in/img/apple-touch-icon.png">
              <h4 class="text-center">Login</h4>
            </div>
            <div class="col-md-6">
              <form class="form-signin">
                <input type="text" class="form-control mb-2" placeholder="Enter User Name" required autofocus>
                <input type="password" class="form-control mb-2" placeholder="Password" required>
                <button class="btn btn-lg btn-primary btn-block mb-1" type="submit">Sign in</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
</body>
</html>
