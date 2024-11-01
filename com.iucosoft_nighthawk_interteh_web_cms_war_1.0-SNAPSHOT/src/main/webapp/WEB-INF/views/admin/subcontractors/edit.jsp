<%-- 
    Document   : edit
    Created on : 13-Feb-2022, 16:07:40
    Author     : Dorina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">





<div class="container">
    <h1>Edit subcontractor page !</h1>

    <c:choose>
        <c:when test="${subcontractorDTO.idSubcontractor ==null}">
            <h1>Add Subcontractor</h1>
        </c:when>
        <c:otherwise>
            <h1>Update Subcontractor</h1>
        </c:otherwise>
    </c:choose>
    <br />

    <spring:url value="/admin/subcontractors/edit" var="subcontractorActionUrl" />
     <spring:url value="/admin/nwusers/list" var="urlUsersList" />

    <form:form class="form-horizontal" method="post" modelAttribute="subcontractorDTO" action="${subcontractorActionUrl}">

        <form:hidden path="idSubcontractor" />

        <spring:bind path="subcontractorName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Subcontractor Name</label>
                <div class="col-sm-10">
                    <form:input path="subcontractorName" type="text" class="form-control" id="subcontractorName" placeholder="Name"   />
                    <form:errors path="subcontractorName" class="control-label"   />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="subcontractorEmail">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Email Address</label>
                <div class="col-sm-10">
                    <form:input path="subcontractorEmail" type="text" class="form-control" id="subcontractorEmail" placeholder="Email"   />
                    <form:errors path="subcontractorEmail" class="control-label"   />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="subcontractorDateOfBirth">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Subcontractor DOB</label>
                <div class=" col-sm-10">
                    <label for="prefill-example">Select date</label>
                    <form:input path="subcontractorDateOfBirth" type="date"  id="dateFormat" class="form-control"  />
                    <form:errors path="subcontractorDateOfBirth" class="control-label"  />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="subcontractorAddress">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Address</label>
                <div class="col-sm-10">
                    <form:input path="subcontractorAddress" type="text" class="form-control" id="subcontractorAddress" placeholder="Address"   />
                    <form:errors path="subcontractorAddress" class="control-label"   />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="user.idUser">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> User ID</label>
                <div class="col-sm-2">
                    <form:input path="user.idUser" type="text" class="form-control" id="user.idUser" placeholder="User ID"  />
                   

                    <a href="${urlUsersList}" >Users List
                        <span  class="bi bi-box-arrow-in-up-right"></span>
                    </a>
                    <form:errors path="user.idUser" class="control-label"   />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="user.username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Username</label>
                <div class="col-sm-10">
                    <form:input path="user.username" type="text" class="form-control" id="user.username" placeholder="Username"   />
                    <form:errors path="user.username" class="control-label"   />


                </div>
            </div>
        </spring:bind>



        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <c:choose>
                    <c:when test="${subcontractorDTO.idSubcontractor ==null}">
                        <button type="submit" class="btn-lg btn-primary pull-right">Add</button>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" class="btn-lg btn-primary pull-right">Update</button>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>

    </form:form>

</div>



