<%-- 
    Document   : submenu
    Created on : 13-Feb-2022, 16:08:03
    Author     : Dorina
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">



<spring:url value="/admin/nwusers/list" var="urlUsersList"/>
<spring:url value="/admin/nwusers/showAddNewUser" var="urlAddUser" />



<a  href="${urlUsersList}">
    <button class=" btn btn-sm">Users List
        <span class="bi bi-person-lines-fill"></span>
    </button>
</a>


<a href="${urlAddUser}">

    <button class="btn btn-sm " type="button">Add User
        <span class="bi bi-plus-circle"></span>
    </button>
</a>



