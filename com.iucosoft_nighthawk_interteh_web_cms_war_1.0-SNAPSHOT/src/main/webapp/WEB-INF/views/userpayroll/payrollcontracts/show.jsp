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
		<label class="col-sm-2">No. Contract</label>
		<div class="col-sm-10">${idContract}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Employer Company</label>
		<div class="col-sm-10">${contractDTO.employercompany.clientCompanyName}</div>
	</div>
        
	<div class="row">
		<label class="col-sm-2">Nighthawk Interteh</label>
		<div class="col-sm-10">${contractDTO.nighthawkinterteh.companyName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Subcontractor</label>
		<div class="col-sm-10">${contractDTO.subcontractor.subcontractorName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Contract Name</label>
		<div class="col-sm-10">${contractDTO.contractName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Contract Type</label>
		<div class="col-sm-10">${contractDTO.contractType}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Contract Description</label>
		<div class="col-sm-10">${contractDTO.contractDescription}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Contract/Project</label>
		<div class="col-sm-10">${contractDTO.contractProjectId}</div>
	</div>

