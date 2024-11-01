<%-- 
    Document   : edit
    Created on : 18-Feb-2022, 04:44:01
    Author     : Dorina
--%>



<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




  

    <div class="container">

        <c:choose>
            <c:when test="${administratorDTO.idAdministrator == null}">
              
            </c:when>
            <c:otherwise>
            
            </c:otherwise>
        </c:choose>
        <br />

        <spring:url value="/admin/personaldetails/edit" var="adminActionUrl" />

        <form:form class="form-horizontal" method="post" modelAttribute="administratorDTO" action="${adminActionUrl}">

            <form:hidden path="idAdministrator"/>

            <spring:bind path="administratorName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Name</label>
                    <div class="col-sm-10">
                        <form:input path="administratorName" type="text" class="form-control" id="administratorName" placeholder="Name" />
                        <form:errors path="administratorName" class="control-label" />
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

            <spring:bind path="administratorEmail">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <form:input path="administratorEmail" class="form-control" id="administratorEmail" placeholder="Email" />
                        <form:errors path="administratorEmail" class="control-label" />
                    </div>
                </div>
            </spring:bind>




            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${administratorDTO.idAdministrator == null}">
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



