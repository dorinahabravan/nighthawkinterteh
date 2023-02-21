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
		<label class="col-sm-2">No. Document</label>
		<div class="col-sm-10">${filedocument.fileDocumentId}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Account Name</label>
		<div class="col-sm-10">${filedocument.account.idAccount}</div>
	</div>
        
	<div class="row">
		<label class="col-sm-2">File Name</label>
		<div class="col-sm-10">${filedocument.fileName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> File Extension</label>
		<div class="col-sm-10">${filedocument.fileExtenstion}</div>
	</div>
	<div class="row">
		<label class="col-sm-2"> Document Content</label>
		<div class="col-sm-10">${filedocument.documentContent}</div>
	</div>

   