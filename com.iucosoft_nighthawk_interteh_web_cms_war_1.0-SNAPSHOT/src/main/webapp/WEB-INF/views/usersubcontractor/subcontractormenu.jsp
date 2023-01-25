<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<spring:url value="/usersubcontractor/home" var="urlHome"/>
<spring:url value="/usersubcontractor/subcontrpersonaldetails/list" var="urlPersonalDetails"/>
<spring:url value="/usersubcontractor/subcontruploaddocuments/list" var="urlDocuments"/>
<spring:url value="/usersubcontractor/subcontrcontracts/list" var="urlContracts"/>
<spring:url value="//usersubcontractor/subcontrportofolio/list" var="urlPortofolio"/>



<p><a href="${urlHome}">Home Page</a></p>
<p><a href="${urlPersonalDetails}">Personal Details</a></p>
<p><a href="${urlDocuments}">Documents</a></p>
<p><a href="${urlContracts}">Contracts</a></p>
<p><a href="${urlPortofolio}">Portofolio</a></p>


