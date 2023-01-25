
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>





    <table class="table table-hover">
        <thead>
            <tr>
                <th>No.</th>
                <th>Employer Company</th>
                <th>Nighthawk Interteh</th>
                <th>Subcontractor</th>
                <th>Contract Name</th>
                <th>Contract Type</th>
                <th>Contract Description</th>
                <th>Contract/Project</th>

                <td>View</td>
                <td style="color: cornflowerblue">Edit</td>
                <td style="color: crimson">Delete</td>
            </tr>

        </thead>


        <c:forEach var="contract" items="${contractDTOList}">
            <tr>

                <td>${contract.idContract}</td>
                <td>${contract.employercompany.clientCompanyName}</td>
                <td>${contract.nighthawkinterteh.companyName}</td>
                <td>${contract.subcontractor.subcontractorName}</td>
                <td>${contract.contractName}</td>
                <td>${contract.contractType}</td>
                <td>${contract.contractDescription}</td>
                <td>${contract.contractProjectId}</td>



                
                    <spring:url value="/usersubcontractor/subcontrcontracts/showView/${contract.idContract}" var="contractUrl" />
                    <spring:url value="/usersubcontractor/subcontrcontracts/delete/${contract.idContract}" var="deleteUrl" /> 
                    <spring:url value="/usersubcontractor/subcontrcontracts/showEdit/${contract.idContract}" var="updateUrl" />



                    
                    
                     <td><button class="bi bi-eye-fill" onclick="location.href = '${contractUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>
            </tr>
        </c:forEach>
    </table>





