<%-- 
    Document   : edit
    Created on : 18-Feb-2022, 04:44:01
    Author     : Dorina
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<h1>Edit personal details </h1>


<div class="container">

    <c:choose>
        <c:when test="${payrollDTO.idPayroll == null}">
            <h1>Add Payroll</h1>
        </c:when>
        <c:otherwise>
            <h1>Update Payroll</h1>
        </c:otherwise>
    </c:choose>
    <br />

    <spring:url value="/admin/payroll/edit" var="payrollActionUrl" />
    <spring:url value="/admin/nwusers/list" var="urlUsersList" />

    <form:form class="form-horizontal" method="post" modelAttribute="payrollDTO" action="${payrollActionUrl}">

        <form:hidden path="idPayroll"/>

        <spring:bind path="payrollName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Name</label>
                <div class="col-sm-10">
                    <form:input path="payrollName" type="text" class="form-control" id="payrollName" placeholder="Name" />
                    <form:errors path="payrollName" class="control-label" />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="payrollEmail">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Email</label>
                <div class="col-sm-10">
                    <form:input path="payrollEmail" type="text" class="form-control" id="payrollEmail" placeholder="Payroll Email" />
                    <form:errors path="payrollEmail" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="payrollDateOfBirth">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Payroll DOB</label>
                <div class="col-sm-10">
                    <label for="prefill-example">Select date</label>
                    <form:input path="payrollDateOfBirth" type="date" id="dateFormatP" class="form-control"  />
                    <form:errors path="payrollDateOfBirth" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="payrollAddress">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Address</label>
                <div class="col-sm-10">
                    <form:input path="payrollAddress" class="form-control" id="payrollAddress" placeholder="Address" />
                    <form:errors path="payrollAddress" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="user.idUser">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> User ID</label>
                <div class="col-sm-2">
                    <form:input path="user.idUser" type="text" class="form-control" id="user.idUser" placeholder="User ID"   />
                    
                    <a href="${urlUsersList}" style="width: 30%">Users List
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
                    <c:when test="${payrollDTO.idPayroll == null}">
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


