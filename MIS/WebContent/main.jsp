<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<jsp:include page="header.jsp" />  
<div class="container">
  <form action="TrippingController" method="post">
  <br>
    <div class="row">
      <div class="col">
         <label for="uname">33KV Feeder Name</label>
        <input type="text" class="form-control" id="email" placeholder=" Enter 33KV Feeder Name" name="fname" required="required">
      </div>
      <div class="col">
        <label for="uname">EHT SS Name</label>
        <input type="password" class="form-control" placeholder="Enter EHT SS Name" name="ehtname" required="required">
      </div>
    </div><br>
    <div class="row">
     <div class="col">
        <input type="submit" class="btn btn-info" value="Submit">
      </div>
     </div>
     </form>
     <c:forEach var="tripping" items="${trippings }">
      <br>
      <div class="row">
         <div class="col">
         <label for="uname"><strong>District Name</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter 33KV Feeder Name" name="fname" required="required" value="${tripping.district}">
      </div>
      <div class="col">
         <label for="uname"><strong>PTR CAPCITY @EHT LEVEL</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter 33KV Feeder Name" name="fname" required="required" value="${tripping.ptrCapacityName}">
      </div>
      <div class="col">
         <label for="uname"><strong>PTR CAPACTIY @33KV FEEDER</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter PTR CAPACTIY @33KV FEEDER" name="fname" required="required">
      </div>
      </div>
      <div class="row">
      <div class="col"><br>
         <label for="uname"><strong>PTR CAPCITY @EHT LEVEL</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter PTR CAPCITY @EHT LEVEL" name="fname" required="required">
      </div>
       <div class="col"><br>
         <label for="uname"><strong>CIRCLE</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter CIRCLE" name="fname" required="required">
      </div>
        <div class="col"><br>
         <label for="uname"><strong>DIVISION</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter DIVISION" name="fname" required="required">
      </div>
      </div>
       <div class="row">
         <div class="col"><br>
         <label for="uname"><strong>SUBDIVISION</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter CIRCLE" name="fname" required="required">
      </div>
      <div class="col"><br>
         <label for="uname"><strong>MD</strong></label>
         <input type="text" class="form-control" id="dname" name="dname" placeholder=" Enter DIVISION" name="fname" required="required">
      </div>
      <div class="col"><br>
         <label for="uname"><strong>NATURE OF FEEDER</strong></label>
          <select
					class="form-control" id="exampleFormControlSelect1">
					<option>URBAN</option>
					<option>RURAL</option>
				</select>
			</div>
      </div>
       <div class="row">
      	<div class="col"><br>
         <label for="uname"><strong>DATE</strong></label>
         <input type="DATE" class="form-control" id="dname" name="dname" placeholder=" Enter DIVISION" name="fname" required="required">
      	</div>
      </div>
      </c:forEach>
    </div>
<%@ include file="footer.jsp" %>  