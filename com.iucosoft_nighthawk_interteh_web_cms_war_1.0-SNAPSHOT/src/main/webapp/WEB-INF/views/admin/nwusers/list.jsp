<%-- 
    Document   : list
    Created on : 13-Feb-2022, 16:06:41
    Author     : Dorina
--%>


<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<table class="table  table-hover ">
    <thead>
        <tr>

            <th style="background-color: background">User Status</th>
            <th>Username</th>
            <th>Password</th>
            <th>Role Name</th>
            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>

    </thead>
    <c:forEach var="user" items="${nwUserDTOList}">
        <tr>

            <td><input type="checkbox"   onclick="return false;"
                       <c:if test="${user.active}">checked </c:if>></td>
                <td>
                ${user.username}
            </td>

            <td>${user.password}</td>
            <td>${user.role.userRoleName}</td>



            <spring:url value="/admin/nwusers/showView/${user.idUser}" var="userUrl" />
            <spring:url value="/admin/nwusers/disable/${user.idUser}" var="disableUrl" />
            <spring:url value="/admin/nwusers/delete/${user.idUser}" var="deleteUrl" /> 
            <spring:url value="/admin/nwusers/showEdit/${user.idUser}" var="updateUrl" />

<!--                <button class="btn btn-info" onclick="location.href = '${userUrl}'">View</button>
                <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->
            <%--<button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}');">Delete</button>--%>

            <%--<form:form class="form-horizontal" method="post"  action="${deleteUrl}">
                <button class="btn btn-danger">Delete</button>
            </form:form>--%>


            <td><button class="bi bi-eye-fill" onclick="location.href = '${userUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>


        </tr>
    </c:forEach>
</table>




