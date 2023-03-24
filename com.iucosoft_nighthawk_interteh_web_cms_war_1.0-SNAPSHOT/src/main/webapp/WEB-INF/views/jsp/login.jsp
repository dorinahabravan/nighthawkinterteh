
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>




<!--<div  class="text-center" style="width: 90%; padding-left: 65%; padding-top: 16%;">
    <form class="form-signin"  action="login" method="post" modelAttribute="user" onsubmit="javascript:return validate();" >
<%--model de imagine--%>
    <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">

<h6 class="h4 mb-5 font-weight-normal">Welcome to NW INTERTEH System</h6>
<h1 class="h4 mb-5 font-weight-normal">Please enter your username and password and sign in

</h1>


<label for="inputUsername" class="sr-only">Username</label>
<input type="text" name="username" id="inputUsername" class="form-control" placeholder="Username" required autofocus></br>
<label for="inputPassword" class="sr-only">Password</label>
<input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      
<div class="checkbox mb-3">
    <label>
        <input type="checkbox" value="remember-me"> Remember me
    </label>
</div>
<button class="btn btn-lg btn-primary btn-block" type="submit" >Sign in</button>


</form>
</div>-->


<div class="text-center" style="width: 90%; padding-left: 65%; padding-top: 16%;"> 
       <sec:csrfMetaTags />
<!--    <c:url value="/login" var="loginUrl"/>  -->
    <form:form class="form-signin" action="${loginUrl}" method="post"  modelAttribute="user" onsubmit="javascript:return validate();">    
         <!--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />-->
        <c:if test="${param.error != null}">          
            <p style='color:red'>  
                Invalid username and password.  
            </p>  
        </c:if>  
        <c:if test="${param.logout != null}">         
            <p style='color:blue'>  
                You have been logged out.  
            </p>  
        </c:if>  
        <p>  

        <h6 class="h4 mb-5 font-weight-normal">Welcome to NW INTERTEH System</h6>
        <h1 class="h4 mb-5 font-weight-normal">Please enter your username and password and sign in

        </h1>
        <label for="username" class="sr-only">Username</label>
        <!--<input type="text" id="username" name="username"/>-->      
        <input type="text" name="username" id="username" class="form-control" placeholder="Username" required autofocus></br>
        </p>  
        <p>  
            <label for="password">Password</label>  
            <input type="password" name="password" id="password" class="form-control" placeholder="Password" required>
            <!--        <input type="password" id="password" name="password"/>      -->
        </p>  
<!--        <input type="hidden"                          
               name="${_csrf.parameterName}"  
               value="${_csrf.token}"/>  -->
        <!--    <button type="submit" class="btn">Log in</button>  -->
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign in</button>
    </form:form>

</div>