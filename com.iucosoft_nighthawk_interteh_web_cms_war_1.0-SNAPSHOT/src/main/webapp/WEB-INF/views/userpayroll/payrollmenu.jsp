<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<spring:url value="/userpayroll/home" var="urlHome"/>
<spring:url value="/userpayroll/payrollcompanies/list" var="urlCompanies"/>
<spring:url value="/userpayroll/payrollcontracts/list" var="urlContracts"/>
<spring:url value="/userpayroll/payrollpayments/list" var="urlPayments"/>
<spring:url value="/userpayroll/payrollsubcontractors/list" var="urlSubcontractors"/>



<p><a href="${urlHome}">Home Page</a></p>
<p><a href="${urlCompanies}">Companies</a></p>
<p><a href="${urlContracts}">Contracts</a></p>
<p><a href="${urlPayments}">Payments</a></p>
<p><a href="${urlSubcontractors}">Suncontractors</a></p>


