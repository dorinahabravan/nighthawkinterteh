<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




    <div class="container">

        <c:choose>
            <c:when test="${paymentDTO.idPayment ==null}">
            </c:when>
            <c:otherwise>
            </c:otherwise>
        </c:choose>
        <br />

        <spring:url value="/userpayroll/payrollpayments/edit" var="paymentActionUrl" />

        <form:form class="form-horizontal" method="post" modelAttribute="paymentDTO" action="${paymentActionUrl}">

            <form:hidden path="idPayment" />

            <spring:bind path="contract">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">  Contract</label>
                    <div class="col-sm-10">
                        <form:input path="contract" type="text" class="form-control " id="contract" placeholder="Contract"   />
                        <form:errors path="contract" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="paymentDate">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Payment Date</label>
                    <div class="col-sm-10">
                        <form:input path="paymentDate" type="text" class="form-control " id="paymentDate" placeholder="Payment Date"   />
                        <form:errors path="paymentDate" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="paymentBill">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Payment Bill</label>
                    <div class="col-sm-10">
                        <form:input path="paymentBill" type="text" class="form-control " id="paymentBill" placeholder="Payment Bill"   />
                        <form:errors path="paymentBill" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="paymentType">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Payment Type</label>
                    <div class="col-sm-10">
                        <form:input path="paymentType" type="text" class="form-control " id="paymentType" placeholder="Payment Type"   />
                        <form:errors path="paymentType" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="paymentDescription">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label"> Contract Type</label>
                    <div class="col-sm-10">
                        <form:input path="paymentDescription" type="text" class="form-control " id="paymentDescription" placeholder="Payment Description"   />
                        <form:errors path="paymentDescription" class="control-label"   />
                    </div>
                </div>
            </spring:bind>
           


            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${paymentDTO.idPayment ==null}">
                            <button type="submit" class="btn-lg btn-primary pull-right">Add</button>
                        </c:when>
                        <c:otherwise>
                            <button type="submit" class="btn-lg btn-primary pull-right">Update</button>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>

        </form:form>
        
        </div> 


