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
            
    
      
       
        <div class="row">
		<label class="col-sm-2">No. Payment</label>
		<div class="col-sm-10">${idPayment}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Contract</label>
		<div class="col-sm-10">${paymentDTO.contract}</div>
	</div>
        
	<div class="row">
		<label class="col-sm-2">Payment date</label>
		<div class="col-sm-10">${paymentDTO.paymentDate}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Payment Bill</label>
		<div class="col-sm-10">${paymentDTO.paymentBill}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Payment Type</label>
		<div class="col-sm-10">${paymentDTO.paymentType}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Payment Description</label>
		<div class="col-sm-10">${paymentDTO.paymentDescription}</div>
	</div>
	

        
        
    