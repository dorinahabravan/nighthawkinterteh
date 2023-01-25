<%-- 
    Document   : edit
    Created on : 18-Feb-2022, 13:36:06
    Author     : Dorina
--%>





<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>







<div class="container">

      <c:choose>
            <c:when test="${subcontractorDTO.idSubcontractor == null}">
              
            </c:when>
            <c:otherwise>
            
            </c:otherwise>
        </c:choose>
        <br />
    <br />

    <spring:url value="/usersubcontractor/subcontrpersonaldetails/edit" var="subcontractorActionUrl" />

    <form:form class="form-horizontal" method="post" modelAttribute="subcontractorDTO" action="${subcontractorActionUrl}">

        <form:hidden path="idSubcontractor"/>

        <spring:bind path="subcontractorName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Name</label>
                <div class="col-sm-10">
                    <form:input path="subcontractorName" type="text" class="form-control" id="subcontractorName" placeholder="Name" />
                    <form:errors path="subcontractorName" class="control-label" />
                </div>
            </div>
        </spring:bind>
      
        
           <spring:bind path="user.idUser">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">User ID</label>
                    <div class="col-sm-10">
                        <form:input path="user.idUser" type="text" class="form-control" id="user.idUser" placeholder="UserID" />
                        <form:errors path="user.idUser" class="control-label" />
                    </div>
                </div>
            </spring:bind>

        <spring:bind path="subcontractorEmail">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Email</label>
                <div class="col-sm-10">
                    <form:input path="subcontractorEmail" class="form-control" id="subcontractorEmail" placeholder="Email" />
                    <form:errors path="subcontractorEmail" class="control-label" />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="subcontractorDateOfBirth">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Date of Birth</label>
                <div class="col-sm-10">
                    <label for="prefill-example">Select date</label>
                    <form:input path="subcontractorDateOfBirth" type="date" id="dateFormatP" class="form-control"  />
                    <%--<form:input path="subcontractorDateOfBirth" class="form-control" id="subcontractorDateOfBirth" placeholder="DOB" />--%>
                    <form:errors path="subcontractorDateOfBirth" class="control-label" />
                </div>
            </div>
        </spring:bind>
        <spring:bind path="subcontractorAddress">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Address</label>
                <div class="col-sm-10">
                    <form:input path="subcontractorAddress" class="form-control" id="subcontractorAddress" placeholder="Address" />
                    <form:errors path="subcontractorAddress" class="control-label" />
                </div>
            </div>
        </spring:bind>




        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <c:choose>
                    <c:when test="${subcontractorDTO.idSubcontractor == null}">
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
