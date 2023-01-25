<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">


<spring:url value="/userpayroll/payrollpayments/list" var="urlList"/>
<spring:url value="/userpayroll/payrollpayments/showAddNewPayment" var="urlAddPayment" />





<a  href="${urlList}">
    <button class=" btn btn-sm">Payments List
        <span class="bi bi-person-lines-fill"></span>
    </button>
</a>


<a href="${urlAddPayment}">

    <button class="btn btn-sm " type="button">Add Payment
        <span class="bi bi-plus-circle"></span>
    </button>
</a>


