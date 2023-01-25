<%-- 
    Document   : show
    Created on : 18-Feb-2022, 13:37:26
    Author     : Dorina
--%>
<!--
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Show subcontractor details page</h1>
    </body>
</html>-->



<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

        
        
        <div class="container">

	<c:if test="${not empty msg}">
		<div class="alert alert-${css} alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<strong>${msg}</strong>
		</div>
	</c:if> 
            
  
       
        <div class="row">
		<label class="col-sm-2">ID</label>
		<div class="col-sm-10"> ${subcontractor.idSubcontractor}</div>
	</div>
        
      
        

	<div class="row">
		<label class="col-sm-2">Subcontractor Name</label>
		<div class="col-sm-10">${subcontractor.subcontractorName}</div>
	</div>
        
	<div class="row">
		<label class="col-sm-2"> Email Address</label>
		<div class="col-sm-10">${subcontractor.subcontractorEmail}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Date of Birth</label>
		<div class="col-sm-10">${subcontractor.subcontractorDateOfBirth}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">  Address</label>
		<div class="col-sm-10">${subcontractor.subcontractorAddress}</div>
	</div>

	

       