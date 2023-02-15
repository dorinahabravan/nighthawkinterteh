<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">



<spring:url value="/usersubcontractor/subcontruploaddocuments/list" var="urlDocumentsList"/>
<spring:url value="/usersubcontractor/subcontruploaddocuments/showAddNewDocument" var="urlAddDocument" />



<a  href="${urlDocumentsList}">
    <button class=" btn btn-sm">Documents List
        <span class="bi bi-person-lines-fill"></span>
    </button>
</a>


<a href="${urlAddDocument}">
    <button class="btn btn-sm " type="button">Add Document
        <span class="bi bi-plus-circle"></span>
    </button>
</a>