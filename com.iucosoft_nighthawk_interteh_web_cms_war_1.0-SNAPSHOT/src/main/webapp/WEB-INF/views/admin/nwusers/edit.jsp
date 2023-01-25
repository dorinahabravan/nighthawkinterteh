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
    <h1>Edit user page !</h1>

    <c:choose>
        <c:when test="${nwUserDTO.idUser ==null}">
            <h1>Add User</h1>
        </c:when>
        <c:otherwise>
            <h1>Update User</h1>
        </c:otherwise>
    </c:choose>
    <br />

    <spring:url value="/admin/nwusers/edit" var="userActionUrl" />

    <form:form class="form-horizontal" method="post" modelAttribute="nwUserDTO" action="${userActionUrl}">

        <form:hidden path="idUser" />

        <spring:bind path="role.userRoleName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label"> Role Name</label>
                <div class="col-sm-10">
                    <form:input path="role.userRoleName" type="text" class="form-control"  placeholder="Role Name"/>

                    <form:errors path="role.userRoleName" class="control-label"   />
                </div>
            </div>

        </spring:bind>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Username</label>
                <div class="col-sm-10">
                    <form:input path="username" type="text" class="form-control"  placeholder="Username"   />

                    <%-- <form:checkboxes path="userRoleName" items="nwRoleDTO" element="label class='checkbox-inline'" />
                                        <br />--%>
                    <form:errors path="username" class="control-label"   />
                </div>
            </div>

        </spring:bind>
        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Password</label>
                <div class="col-sm-10">
                    <form:input path="password" type="text" class="form-control"  placeholder="Password"/>

                    <form:errors path="password" class="control-label"/>


                </div>
            </div>

        </spring:bind>

        <spring:bind path="active">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Active</label>
                <div class="col-sm-10">
                    <div class="checkbox">
                        <label> <form:checkbox  path="active" id="active" />

                        </label>

                        <form:errors path="active" class="control-label" />
                    </div>
                </div>

            </spring:bind>



            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${nwUserDTO.idUser==null}">
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

