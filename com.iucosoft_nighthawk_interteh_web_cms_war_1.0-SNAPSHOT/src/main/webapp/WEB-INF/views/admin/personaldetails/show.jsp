<%-- 
    Document   : show
    Created on : 18-Feb-2022, 04:47:13
    Author     : Dorina
--%>



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
		<div class="col-sm-10">${admin.idAdministrator}</div>
	</div>
        
        <div class="row">
		<label class="col-sm-2"> User ID</label>
		<div class="col-sm-10">${admin.user.idUser}</div>
	</div>
        

	<div class="row">
		<label class="col-sm-2">Administrator Name</label>
		<div class="col-sm-10">${admin.administratorName}</div>
	</div>
        
	<div class="row">
		<label class="col-sm-2"> Email Address</label>
		<div class="col-sm-10">${admin.administratorEmail}</div>
	</div>

	



