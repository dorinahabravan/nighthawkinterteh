<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<table class="table table-hover">
    <thead>
        <tr>
            <th>No. Subcontractor</th>
            <th>Subcontractor Name</th>
            <th>Email Address</th>
            <th>Subcontractor DateOfBirth</th>
            <th>Subcontractor Address</th>
            <th>User ID</th>

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
            <td>${subcontractor.user.idUser}</td>


           
                <spring:url value="/userpayroll/payrollsubcontractors/showView/${subcontractor.idSubcontractor}" var="subcontractorUrl" />
                <spring:url value="/userpayroll/payrollsubcontractors/delete/${subcontractor.idSubcontractor}" var="deleteUrl" /> 
                <spring:url value="/userpayroll/payrollsubcontractors/showEdit/${subcontractor.idSubcontractor}" var="updateUrl" />


<!--                <button class="btn btn-info" onclick="location.href = '${subcontractorUrl}'">View</button>
                <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                        <button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button></td>
                <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->


            <td><button class="bi bi-eye-fill" onclick="location.href = '${subcontractorUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>
        </tr>
    </c:forEach>
</table>
