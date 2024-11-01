

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




    <div class="container">

        <c:choose>
            <c:when test="${contractDTO.idContract ==null}">
            </c:when>
            <c:otherwise>
            </c:otherwise>
        </c:choose>
        <br />

        <spring:url value="/admin/contracts/edit" var="contractActionUrl" />

        <form:form class="form-horizontal" method="post" modelAttribute="contractDTO" action="${contractActionUrl}">

            <form:hidden path="idContract" />

            <spring:bind path="employercompany.clientCompanyName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">  Employer Company Name</label>
                    <div class="col-sm-10">
                        <form:input path="employercompany.clientCompanyName" type="text" class="form-control " id="employercompany.clientCompanyName" placeholder="Employer Company Name"   />
                        <form:errors path="employercompany.clientCompanyName" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="nighthawkinterteh.companyName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Company Name</label>
                    <div class="col-sm-10">
                        <form:input path="nighthawkinterteh.companyName" type="text" class="form-control " id="nighthawkinterteh.companyName" placeholder="Your Company"   />
                        <form:errors path="nighthawkinterteh.companyName" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="subcontractor.subcontractorName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Subcontractor</label>
                    <div class="col-sm-10">
                        <form:input path="subcontractor.subcontractorName" type="text" class="form-control " id="subcontractor.subcontractorName" placeholder="subcontractor"   />
                        <form:errors path="subcontractor.subcontractorName" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="contractName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Contract Name</label>
                    <div class="col-sm-10">
                        <form:input path="contractName" type="text" class="form-control " id="contractName" placeholder="Contract Name"   />
                        <form:errors path="contractName" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="contractType">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Contract Type</label>
                    <div class="col-sm-10">
                        <form:input path="contractType" type="text" class="form-control " id="contractType" placeholder="Contract Type"   />
                        <form:errors path="contractType" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="contractDescription">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Contract Description</label>
                    <div class="col-sm-10">
                        <form:input path="contractDescription" type="text" class="form-control " id="contractDescription" placeholder="Contract Description"   />
                        <form:errors path="contractDescription" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="contractProjectId">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Contract/Project</label>
                    <div class="col-sm-10">
                        <form:input path="contractProjectId" type="text" class="form-control " id="contractProjectId" placeholder="Contract/Project"   />
                        <form:errors path="contractProjectId" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
           



            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${contractDTO.idContract ==null}">
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




