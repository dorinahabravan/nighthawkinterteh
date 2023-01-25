

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">


<spring:url value="/usersubcontractor/subcontrcontracts/list" var="urlList"/>
<spring:url value="/usersubcontractor/subcontrcontracts/showAddNewContract" var="urlAddContract" />


<!--Varianta veche de linkuri-->
<!--
<p>Ne aflam pe pagina Contracts</p>
<p>
    <a href="${urlList}">Contracts List</a>
    <a href="${urlAddContract}">Add Contract</a>
 
</p>-->


<a  href="${urlList}">
    <button class=" btn btn-sm">Contracts List
        <span class="bi bi-person-lines-fill"></span>
    </button>
</a>


<a href="${urlAddContract}">

    <button class="btn btn-sm " type="button">Add Contract
        <span class="bi bi-plus-circle"></span>
    </button>
</a>