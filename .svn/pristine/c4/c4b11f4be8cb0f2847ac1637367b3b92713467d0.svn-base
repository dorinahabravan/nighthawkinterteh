<%-- 
    Document   : list
    Created on : 18-Feb-2022, 04:00:09
    Author     : Dorina
--%>






<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>





<table class="table table-hover">
    <thead>
        <tr>
            <th>#ID Payroll</th>
            <th>Payroll Name</th>
            <th>Email Address</th>
            <th>Date of Birth</th>
            <th>Address</th>

            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>

    </thead>


    <c:forEach var="payroll" items="${payrollDTOList}">
        <tr>

            <td>${payroll.idPayroll}</td>
            <td>${payroll.payrollName}</td>
            <td>${payroll.payrollEmail}</td>
            <td>${payroll.payrollDateOfBirth}</td>
            <td>${payroll.payrollAddress}</td>


        
                <spring:url value="/admin/payroll/showView/${payroll.idPayroll}" var="payrollUrl" />
                <spring:url value="/admin/payroll/delete/${payroll.idPayroll}" var="deleteUrl" /> 
                <spring:url value="/admin/payroll/showEdit/${payroll.idPayroll}" var="updateUrl" />


<!--                <button class="btn btn-info" onclick="location.href = '${payrollUrl}'">View</button>
                <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                <button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button></td>
                <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->
                
                
                  <td><button class="bi bi-eye-fill" onclick="location.href = '${payrollUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>

        </tr>
    </c:forEach>
</table>





