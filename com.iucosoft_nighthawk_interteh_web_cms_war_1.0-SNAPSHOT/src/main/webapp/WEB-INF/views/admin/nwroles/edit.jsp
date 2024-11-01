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



<div class="container">
  

    <c:choose>
        <c:when test="${nwRoleDTO.userRoleId ==null}">
          
        </c:when>
        <c:otherwise>
        
        </c:otherwise>
    </c:choose>
    <br />

    <spring:url value="/admin/nwroles/edit" var="roleActionUrl" />

    <form:form class="form-horizontal" method="post" modelAttribute="nwRoleDTO" action="${roleActionUrl}">

        <form:hidden path="userRoleId" />

        <spring:bind path="userRoleName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Role Name</label>
                <div class="col-sm-10">
                    <form:input path="userRoleName" type="text" class="form-control"  placeholder="Name"   />

                    <%-- <form:checkboxes path="userRoleName" items="nwRoleDTO" element="label class='checkbox-inline'" />
                                        <br />--%>
                    <form:errors path="userRoleName" class="control-label"   />


                </div>

            </spring:bind>

            <spring:bind path="enabled">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Active</label>
                    <div class="col-sm-10">
                        <div class="checkbox">
                            <label> <form:checkbox  path="enabled" id="enabled" />
                                
                            </label>
                             
                            <form:errors path="enabled" class="control-label" />
                        </div>
                    </div>
                </div>
            </spring:bind>



            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${nwRoleDTO.userRoleId==null}">
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



