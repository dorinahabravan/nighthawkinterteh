

<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>





<table class="table table-hover">
    <thead>
        <tr>
            <th>No. Document</th>
            <th>Account Name</th>
            <th>File Name</th>
            <th>File Extension</th>
            <th>Document Content</th>
            <td>View</td>
            <td style="color: cornflowerblue">Edit</td>
            <td style="color: crimson">Delete</td>
        </tr>

    </thead>


    <c:forEach var="portofolio" items="${portofolioDTOList}">
        <tr>

            <td>
                ${portofolio.documentId}
            </td>
            <td>${portofolio.account.idAccount}</td>
            <td>${portofolio.fileName}</td>
            <td>${portofolio.fiileExtension}</td>
            <td>${portofolio.documentContent}</td>




            <spring:url value="/usersubcontractor/subcontrportofolio/showView/${portofolio.documentId}" var="portofolioUrl" />
            <spring:url value="/usersubcontractor/subcontrportofolio/delete/${portofolio.documentId}" var="deleteUrl" /> 
            <spring:url value="/usersubcontractor/subcontrportofolio/showEdit/${portofolio.documentId}" var="updateUrl" />


<!--                        <button class="btn btn-info" onclick="location.href = '${portofolioUrl}'">View</button>
                        <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                        <button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button></td>
                        <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->


            <td><button class="bi bi-eye-fill" onclick="location.href = '${portofolioUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>

        </tr>
    </c:forEach>
</table>

