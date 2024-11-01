<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>





<table class="table table-hover">
    <thead>
        <tr>
            <th>No. Company</th>
            <th>Company Address</th>
            <th>Company Name</th>
            <th>Company Type</th>
            <th>Company Description</th>

            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>

        </tr>



    </thead>



    <c:forEach var="employerCompany" items="${employercompanyDTOList}">
        <tr>

            <td>${employerCompany.idClientCompany}</td>
            <td>${employerCompany.clientCompanyAddress}</td>
            <td>${employerCompany.clientCompanyDescription}</td>
            <td>${employerCompany.clientCompanyName}</td>
            <td>${employerCompany.clientCompanyType}</td>



            <spring:url value="/userpayroll/payrollcompanies/showView/${employerCompany.idClientCompany}" var="employerCompanyUrl" />
            <spring:url value="/userpayroll/payrollcompanies/delete/${employerCompany.idClientCompany}" var="deleteUrl" /> 
            <spring:url value="/userpayroll/payrollcompanies/showEdit/${employerCompany.idClientCompany}" var="updateUrl" />


            <!--<td> <button class="btn btn-info" onclick="location.href = '${employerCompanyUrl}'">View</button></td>-->
            <td> <button class="bi bi-eye-fill" onclick="location.href = '${employerCompanyUrl}'"></button></td>
                <!--<button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>-->
            <td>  <button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
              <!--<button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button></td>-->
               <!--<button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->
            <td> <button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>
        </tr>
    </c:forEach>
</table>




