<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">



<spring:url value="/userpayroll/payrollsubcontractors/list" var="urlList"/>
 <spring:url value="/userpayroll/payrollsubcontractors/showAddNewSubcontractor" var="urlAddSubcontractor" />





 <a  href="${urlList}">
        <button class=" btn btn-sm">Subcontractors List
        <span class="bi bi-person-lines-fill"></span>
    </button>
    </a>

    <a href="${urlAddSubcontractor}">
        
        <button class="btn btn-sm " type="button">Add Subcontractor
         <span class="bi bi-plus-circle"></span>
        </button>
    </a>

