<%-- 
    Document   : show
    Created on : 18-Feb-2022, 04:00:48
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
            
    
        <h1>Show one payroll page</h1>
       
        <div class="row">
		<label class="col-sm-2">ID</label>
		<div class="col-sm-10">${payroll.idPayroll}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Payroll Name</label>
		<div class="col-sm-10">${payroll.payrollName}</div>
	</div>
        
	<div class="row">
		<label class="col-sm-2"> Email Address</label>
		<div class="col-sm-10">${payroll.payrollEmail}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Date of Birth</label>
		<div class="col-sm-10">${payroll.payrollDateOfBirth}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Address</label>
		<div class="col-sm-10">${payroll.payrollAddress}</div>
	</div>

	


