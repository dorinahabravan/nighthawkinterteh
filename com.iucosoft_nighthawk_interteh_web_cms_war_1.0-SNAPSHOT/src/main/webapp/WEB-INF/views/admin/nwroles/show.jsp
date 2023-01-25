<%-- 
    Document   : show
    Created on : 13-Feb-2022, 16:07:15
    Author     : Dorina
--%>


<%--<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container">



	<h1>Role Details</h1>
        
	<br />

	<div class="row">
		<label class="col-sm-2 control-label">ID</label>
		<div class="col-sm-10">${role.userRoleId}</div>
	</div>
        
        
        
     

	<div class="row">
		<label class="col-sm-2">Role Name</label>
		<div class="col-sm-10">${role.userRoleName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Active</label>
		<div class="col-sm-10">${role.enabled}</div>
	</div>

	
	</div>


