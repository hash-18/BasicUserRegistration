<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<html>
<body>
<h2>Welcome to Home Page</h2>
<br>

<%
String name=(String)request.getAttribute("name");
// List<String> courses=(List<String>)request.getAttribute("coursesList");
%>
Hi, I am your host <b><%=name%></b>
<br>
List of courses available are :<br>
<%-- <% for(String s : courses) --%>
// {
// out.println(s);
<%-- }%> --%>
</body>
</html>
