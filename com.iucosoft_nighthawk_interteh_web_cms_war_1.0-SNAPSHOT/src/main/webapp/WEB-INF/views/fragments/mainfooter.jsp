<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<div class="container">
    <hr>
    <footer>
        
        <p>&copy;Copyright  IUCOSOFT 
         <%
      GregorianCalendar cal = new GregorianCalendar();
      out.print(cal.get(Calendar.YEAR));
    %>
        
        </p><%--code java  care v-a determina anul curent--%>
    </footer>
</div>

<script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<spring:url value="/resources/core/js/hello.js" var="coreJs" />
<spring:url value="/resources/core/js/bootstrap.min.js"
            var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>


