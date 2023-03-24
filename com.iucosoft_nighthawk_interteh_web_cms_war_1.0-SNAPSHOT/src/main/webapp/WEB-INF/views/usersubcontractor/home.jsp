

<%@ page language="java" contentType="text/html; charset=UTF-8"  
         pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   
    "http://www.w3.org/TR/html4/loose.dtd">  
<html>  





    <!--Subcontractor-->

    <h3> Hello ${pageContext.request.userPrincipal.name}, </h3> 
    <sec:authorize access="hasRole('SUBCONTRACTOR')">  

    </sec:authorize>  
    <a href="<c:url value='/logout' />" class="btn btn-default btn-lg active" role="button" aria-pressed="true" type="hidden"   />
    
    <sec:csrfInput/> 
    <span>Log out </span></a>
