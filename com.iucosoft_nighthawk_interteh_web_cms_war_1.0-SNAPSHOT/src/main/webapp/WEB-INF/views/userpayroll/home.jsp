


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>



<!--<h3>Welcome Payroll</h3>-->


<h3> Hello ${pageContext.request.userPrincipal.name}, </h3>  
<sec:authorize access="hasRole('PAYROLL')">  

</sec:authorize>  
<a href="<c:url value='/logout' />" class="btn btn-default btn-lg active" role="button" aria-pressed="true">
          
     <sec:csrfInput/> 
    <span>Log out </span></a>


