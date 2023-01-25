<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



    <div class="container">
  

        <c:choose>
            <c:when test="${employercompanyDTO.idClientCompany ==null}">
              
            </c:when>
            <c:otherwise>
            </c:otherwise>
        </c:choose>
        <br />

        <spring:url value="/userpayroll/payrollcompanies/edit" var="companyActionUrl" />

        <form:form class="form-horizontal" method="post" modelAttribute="employercompanyDTO" action="${companyActionUrl}">

            <form:hidden path="idClientCompany" />

            <spring:bind path="clientCompanyName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Company Name</label>
                    <div class="col-sm-10">
                        <form:input path="clientCompanyName" type="text" class="form-control " id="clientCompanyName" placeholder="Name"   />
                        <form:errors path="clientCompanyName" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="clientCompanyAddress">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Company Address</label>
                    <div class="col-sm-10">
                        <form:input path="clientCompanyAddress" type="text" class="form-control " id="clientCompanyAddress" placeholder="Address"   />
                        <form:errors path="clientCompanyAddress" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="clientCompanyType">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Company Type</label>
                    <div class="col-sm-10">
                        <form:input path="clientCompanyType" type="text" class="form-control " id="clientCompanyType" placeholder="Company Type"   />
                        <form:errors path="clientCompanyType" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="clientCompanyDescription">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Company Description</label>
                    <div class="col-sm-10">
                        <form:input path="clientCompanyDescription" type="text" class="form-control " id="clientCompanyDescription" placeholder="Company Description"   />
                        <form:errors path="clientCompanyDescription" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
           



            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${employercompanyDTO.idClientCompany ==null}">
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
