<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">


<spring:url value="/usersubcontractor/subcontrportofolio/list" var="urlList"/>
      <spring:url value="/usersubcontractor/subcontrportofolio/showAddNewPortofolio" var="urlAddPortofolio"/>




<a  href="${urlList}">
    <button class=" btn btn-sm">Portofolio List
        <span class="bi bi-person-lines-fill"></span>
    </button>
</a>


<a href="${urlAddPortofolio}">

    <button class="btn btn-sm " type="button">Add Portofolio
        <span class="bi bi-plus-circle"></span>
    </button>
</a>