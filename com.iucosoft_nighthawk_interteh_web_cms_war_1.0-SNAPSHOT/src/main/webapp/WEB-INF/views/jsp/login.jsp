<%-- 
    Document   : login
    Created on : 16-Mar-2022, 19:52:24
    Author     : Dorina


--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<div  class="text-center" style="width: 90%; padding-left: 65%; padding-top: 16%;">
    <form class="form-signin"  action="login" method="post" modelAttribute="user" onsubmit="javascript:return validate();" >
        <%--model de imagine--%>
        <!--    <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">-->

        <h6 class="h4 mb-5 font-weight-normal">Welcome to NW INTERTEH System</h6>
        <h1 class="h4 mb-5 font-weight-normal">Please enter your username and password and sign in

        </h1>

        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" name="username" id="inputUsername" class="form-control" placeholder="Username" required autofocus></br>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign in</button>


    </form>
</div>
