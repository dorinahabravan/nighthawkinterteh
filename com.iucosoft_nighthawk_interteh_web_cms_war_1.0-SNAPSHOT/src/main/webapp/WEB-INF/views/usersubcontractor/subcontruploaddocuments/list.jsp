<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>





<table class="table table-hover">
    <thead>
        <tr>
            <th>No.</th>
            <th>Filename</th>
            <th>Account</th>
            <th>File Extenstion</th>
            <th>Document Content</th>
            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>
    </thead>


    <c:forEach var="filedocument" items="${filedocumentDTOList}">
        <tr>

            <td>${filedocument.fileDocumentId}
            </td>
            <td>${filedocument.fileName}</td>
            <td>${filedocument.account.idAccount}</td>
            <td>${filedocument.fileExtenstion}</td>
            <td>${filedocument.documentContent}</td>






            <spring:url value="/usersubcontractor/subcontruploaddocuments/showView/${filedocument.fileDocumentId}" var="filedocumentUrl" />
            <spring:url value="/usersubcontractor/subcontruploaddocuments/delete/${filedocument.fileDocumentId}" var="deleteUrl" /> 
            <spring:url value="/usersubcontractor/subcontruploaddocuments/showEdit/${filedocument.fileDocumentId}" var="updateUrl" />





            <td><button class="bi bi-eye-fill" onclick="location.href = '${filedocumentUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>
        </tr>
    </c:forEach>
</table>

