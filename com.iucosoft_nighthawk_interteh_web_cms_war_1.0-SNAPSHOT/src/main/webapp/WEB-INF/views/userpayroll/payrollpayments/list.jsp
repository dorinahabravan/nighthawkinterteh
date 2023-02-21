<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>





    <table class="table table-hover">
        <thead>
            <tr>
                <th>No. Payment</th>
                <th>Contract</th>
                <th>Payment Date</th>
                <th>Payment Bill</th>
                <th>Payment Type</th>
                <th>Payment  Description</th>

                <td>View</td>
                <td style="color: cornflowerblue">Edit</td>
                <td style="color: crimson">Delete</td>
            </tr>

        </thead>


        <c:forEach var="payment" items="${paymentDTOList}">
            <tr>

                <td>${payment.idPayment}</td>
                <td>${payment.contract.idContract}</td>
                <td>${payment.paymentDate}</td>
                <td>${payment.paymentBill}</td>
                <td>${payment.paymentType}</td>
                <td>${payment.paymentDescription}</td>
               
                
                
                
                 
     



                
                    <spring:url value="/userpayroll/payrollpayments/showView/${payment.idPayment}" var="paymentUrl" />
                    <spring:url value="/userpayroll/payrollpayments/delete/${payment.idPayment}" var="deleteUrl" /> 
                    <spring:url value="/userpayroll/payrollpayments/showEdit/${payment.idPayment}" var="updateUrl" />


<!--                    <button class="btn btn-info" onclick="location.href = '${contractUrl}'">View</button>
                    <button class="btn btn-primary" onclick="location.href = '${updateUrl}'">Update</button>
                    <button class="btn btn-danger" onclick="this.disabled = true;post('${deleteUrl}')">Delete</button></td>
                    <button class="btn btn-danger" onclick="location.href = '${deleteUrl}'">Delete</button>-->
                    
                    
                     <td><button class="bi bi-eye-fill" onclick="location.href = '${paymentUrl}'"></button></td>
            <td><button class="bi bi-pencil" style="color: cornflowerblue"onclick="location.href = '${updateUrl}'" ></button></td>
            <td><button class="bi bi-trash3" style="color: #d43f3a"onclick="location.href = '${deleteUrl}'"></button></td>
            </tr>
        </c:forEach>
    </table>
