function post(path, params, method) {
	method = method || "post"; 

	var form = document.createElement("form");
	form.setAttribute("method", method);
	form.setAttribute("action", path);

	for ( var key in params) {
		if (params.hasOwnProperty(key)) {
			var hiddenField = document.createElement("input");
			hiddenField.setAttribute("type", "hidden");
			hiddenField.setAttribute("name", key);
			hiddenField.setAttribute("value", params[key]);

			form.appendChild(hiddenField);
		}
	}

	document.body.appendChild(form);
	form.submit();
}










//function myFunctionDeactivate() {
////  var txt;
////  if (confirm("Are you sure you want to deactivate this account?!")) {
////    txt = "The account has been dezactivated!";
////  } else {
////    txt = "You pressed Cancel!";
////  }
//
// if(document.getElementById("enabled").checked == true){  
//              document.getElementById("role.enabled").disabled = true;  
//          }else{
//            document.getElementById("role.enabled").disabled = false;
//          }  
//     }  
 
 

//Datepicker Calendar
(function(){
('.datepicker').datepicker({
format: 'yyyy-MM-dd'
});
});


//User Role DropDownList
function validate(){
var username=document.form.username.value;
var password=document.form.password.value;
if(username==""){
 alert("Enter Username!");
  return false;
}
if(password==""){
 alert("Enter Password!");
  return false;
}
return true;
}