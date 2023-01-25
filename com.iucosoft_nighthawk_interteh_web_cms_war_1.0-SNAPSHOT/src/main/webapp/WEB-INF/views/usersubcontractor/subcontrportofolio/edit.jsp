

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




    <div class="container">

        <c:choose>
            <c:when test="${portofolioDTO.documentId ==null}">
            </c:when>
            <c:otherwise>
            </c:otherwise>
        </c:choose>
        <br />

        <spring:url value="/usersubcontractor/subcontrportofolio/edit" var="portofolioActionUrl" />

        <form:form class="form-horizontal" method="post" modelAttribute="portofolioDTO" action="${portofolioActionUrl}">

            <form:hidden path="documentId" />

            <spring:bind path="account.idAccount">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Account Name</label>
                    <div class="col-sm-10">
                        <form:input path="account.idAccount" type="text" class="form-control" id="account.idAccount" placeholder="Account Name"   />
                        <form:errors path="account.idAccount" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="fileName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> FileName</label>
                    <div class="col-sm-10">
                        <form:input path="fileName" type="text" class="form-control" id="fileName" placeholder="FileName"   />
                        <form:errors path="fileName" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="fiileExtension">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Company Type</label>
                    <div class="col-sm-10">
                        <form:input path="fiileExtension" type="text" class="form-control" id="fiileExtension" placeholder="Fiile Extension"   />
                        <form:errors path="fiileExtension" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="documentContent">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Document Content</label>
                    <div class="col-sm-10">
                        <form:input path="documentContent" type="text" class="form-control" id="documentContent" placeholder="Document Content"   />
                        <form:errors path="documentContent" class="control-label"   />
                    </div>
                </div>
            </spring:bind>




            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${portofolioDTO.documentId ==null}">
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