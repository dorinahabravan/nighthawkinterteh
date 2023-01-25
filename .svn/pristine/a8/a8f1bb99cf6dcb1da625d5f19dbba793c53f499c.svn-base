<%-- 
    Document   : list
    Created on : 13-Feb-2022, 16:06:41
    Author     : Dorina
--%>


<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<table class="table table-hover">
    <thead>
        <tr>
            <th>Role Status</th>
            <th>#ID</th>
            <th>Role Name</th>

            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>

    </thead>
    <c:forEach var="role" items="${nwRoleDTOList}">
        <tr>

            <td><input type="checkbox"   onclick="return false;"
                       <c:if test="${role.enabled}">checked</c:if>

                </td>
                <td>
                ${role.userRoleId}
            </td>

            <td>${role.userRoleName}</td>

           
                <spring:url value="/admin/nwroles/showView/${role.userRoleId}" var="roleUrl" />
                <spring:url value="/admin/nwroles/disable/${role.userRoleId}" var="disableUrl" />
                <spring:url value="/admin/nwroles/delete/${role.userRoleId}" var="deleteUrl" /> 
                <spring:url value="/admin/nwroles/showEdit/${role.userRoleId}" var="updateUrl" />

<!--                <button class="btn btn-info" onclick="location.href = '${roleUrl}'">View</button>
                <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->
                <%--<button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}');">Delete</button>--%>

                <%--<form:form class="form-horizontal" method="post"  action="${deleteUrl}">
                    <button class="btn btn-danger">Delete</button>
                </form:form>--%>



            <td> <button class="bi bi-eye-fill" onclick="location.href = '${roleUrl}'"></button></td>
            <td>  <button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td> <button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>

           
        </tr>
    </c:forEach>
</table>




