<%-- 
    Document   : list
    Created on : 18-Feb-2022, 05:04:32
    Author     : Dorina
--%>


<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<table class="table  table-hover">
    <thead>
        <tr>
            <th>#ID </th>
            <th>#User ID </th>
            <th>Administrator Name</th>
            <th> Email Address</th>

            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>

    </thead>



    <c:forEach var="admin" items="${administratorDTOList}">
        <tr>

            <td>
                ${admin.idAdministrator}
            </td>
            <td>
                ${admin.user.idUser}
            </td>
            <td>${admin.administratorName}</td>
            <td>${admin.administratorEmail}</td>

          


                <spring:url value="/admin/personaldetails/showView/${admin.idAdministrator}" var="adminUrl" />
                <spring:url value="/admin/personaldetails/delete/${admin.idAdministrator}" var="deleteUrl" /> 
                <spring:url value="/admin/personaldetails/showEdit/${admin.idAdministrator}" var="updateUrl" />


<!--                <button class="btn btn-info" onclick="location.href = '${adminUrl}'">View</button>
                <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                        <button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button>
                <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->

            <td> <button class="bi bi-eye-fill" onclick="location.href = '${adminUrl}'"></button></td>
            <td>  <button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td> <button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>



           
        </tr>
    </c:forEach>
</table>

</div>



