<%@  page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<!--<h3>Welcome Administrator</h3>-->





<%--<c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>Welcome : ${pageContext.request.userPrincipal.name} |
                <a href="/<c:url value="/logout" />" > Logout</a></h2> 
    </c:if>  --%>

<h3> Hello ${pageContext.request.userPrincipal.name}, </h3>  

<sec:authorize access="hasRole('ADMIN')">  

</sec:authorize>  
<a href="<c:url value='/logout' />" method="post" class="btn btn-default btn-lg active" role="button" aria-pressed="true" style='font-size: 10px'>
    <sec:csrfInput />
    <span>Log out </span></a>


    
    <%--name="${_csrf.parameterName}"
   value="${_csrf.token}--%>