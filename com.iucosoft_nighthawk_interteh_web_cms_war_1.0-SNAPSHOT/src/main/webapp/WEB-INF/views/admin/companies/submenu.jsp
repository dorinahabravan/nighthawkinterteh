<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">



<spring:url value="/admin/companies/list" var="urlList"/>
<spring:url value="/admin/companies/showAddNewCompany" var="urlAddCompany" />



<a  href="${urlList}">
    <button class=" btn btn-sm">Companies List
        <span class="bi bi-person-lines-fill"></span>
    </button>
</a>

<a href="${urlAddCompany}">

    <button class="btn btn-sm " type="button">Add Company
        <span class="bi bi-plus-circle"></span>
    </button>
</a>

