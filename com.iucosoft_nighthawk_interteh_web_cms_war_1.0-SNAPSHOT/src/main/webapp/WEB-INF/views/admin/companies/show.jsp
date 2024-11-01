<%-- 
    Document   : show
    Created on : 18-Feb-2022, 02:35:30
    Author     : Dorina
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


        <div class="container">

            <c:if test="${not empty msg}">
                <div class="alert alert-${css} alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <strong>${msg}</strong>
                </div>
            </c:if> 


            <h1>Show one company page</h1>


            <div class="row">
                <label class="col-sm-2">ID</label>
                <div class="col-sm-10">${idClientCompany}</div>
            </div>

            
             <div class="row">
                <label class="col-sm-2">Company Address</label>
                <div class="col-sm-10">${employercompanyDTO.clientCompanyAddress}</div>
            </div>
            
             <div class="row">
                <label class="col-sm-2"> Company Description</label>
                <div class="col-sm-10">${employercompanyDTO.clientCompanyDescription}</div>
            </div>

            <div class="row">
                <label class="col-sm-2"> Company Name</label>
                <div class="col-sm-10">${employercompanyDTO.clientCompanyName}</div>
            </div>

           


            <div class="row">
                <label class="col-sm-2"> Company Type</label>
                <div class="col-sm-10">${employercompanyDTO.clientCompanyType}</div>
            </div>
           




  

     