<%-- 
    Document   : list
    Created on : 18-Feb-2022, 13:36:48
    Author     : Dorina
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Subcontractor personal details</h1>
        ${lista}
    </body>
</html>--%>



<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<table class="table  table-hover">
    <thead>
        <tr>
            <th> Subcontractor ID </th>
            <th>Subcontractor Name</th>
            <th> Email Address</th>
            <th> Date Of Birth </th>
            <th>  Address</th>

            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>

    </thead>



    <c:forEach var="subcontractor" items="${subcontractorDTOList}">
        <tr>

            <td>
                ${subcontractor.idSubcontractor}
            </td>
           
            <td>${subcontractor.subcontractorName}</td>
            <td>${subcontractor.subcontractorEmail}</td>
            <td>${subcontractor.subcontractorDateOfBirth}</td>
            <td>${subcontractor.subcontractorAddress}</td>

          


                <spring:url value="/usersubcontractor/subcontrpersonaldetails/showView/${subcontractor.idSubcontractor}" var="subcontractorUrl"/>
                <spring:url value="/usersubcontractor/subcontrpersonaldetails/delete/${subcontractor.idSubcontractor}" var="deleteUrl" /> 
                <spring:url value="/usersubcontractor/subcontrpersonaldetails/showEdit/${subcontractor.idSubcontractor}" var="updateUrl" />


               <!--      <button class="btn btn-info" onclick="location.href = '${subcontractorUrl}'">View</button>
                <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                        <button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button>
                <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button> -->

            <td> <button class="bi bi-eye-fill" onclick="location.href = '${subcontractorUrl}'"></button></td>
            <td>  <button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td> <button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>



           
        </tr>
    </c:forEach>
</table>

