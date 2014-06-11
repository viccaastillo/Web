
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<script>
window.alert("Comienza  los ejemplos vistos en clase");
</script>

<%@include file="Copyright.jspf" %>
<%-- sintaxis para un comentario de  un jsp --%>>
<!-- Sintaxis  para  un  comentario html-->

<%= "Hola mundo "+new Date().toString()%>
<%-- La  linea 17 y la  inea 21   hacen lo mismo las  dos  son para  imprimir --%>

<% //String test=request.getParameter("test");
out.print("Hola mundo "+new Date().toString());

String[] values=new String[4];
values[0]="test";
values[1]="test1";
values[2]="test2";
values[3]="test3";
for(String value:values){
out.println("<div>"+value+"</div>");
}
%>
<script>
window.alert("Aqui termina  y  comienza  el ejercicio de tarea");
</script>
<%@include file="Copyright.jspf" %>
<script>
function validate(){
	var title = document.forms["task_form"]["titulo"].value;
	if(!title){
		alert("title empty");
		return false;
	}
	var State=document.forms["tast_form"]["State"].value;
	if(!State){
		alert("State empty")
		return false;
	}
	var State=document.forms["tast_form"]["Description"].value;
	if(!State){
		alert("Descripcion empty")
		return false;
	}
	var State=document.forms["tast_form"]["due_date"].value;
	if(!State){
		alert("La entrega is empty")
		return false;
	}
	
	return true;
}

</script>

<form name="task_form" method="POST" action="AgregarTareaServet" onsubmit="return validate()"
onsubmit="return validate()">

<table>
<%="<tr>" %>
<%="<td>Title:</td>" %>
<%= "<td>"%>
<%="<input type=\"Text\" name=\"titulo\">" %>
<%="</td>" %>
<%="</tr>" %>
<%="<td>State:</td>" %>
<%="<td>" %>
<%= "<select>"%>
<%="<option value=\"BACKLOG\" selected>Backlog</option>" %>
<%= "<option value=\"TO_DO\"> to do</option>"%>
<%="<option value=\"IN PROGRESS\"> In progress</option>" %>
<%="<option value=\"DONE\"> Done </option>" %>
<%="</select>"%>
<%="<input type=\"Text\" name=\"State\">" %>
<%= "</td>"%>
<%= "</tr>"%>
<%="<tr>" %>
<%="<td>Descripcion:</td>" %>
<%="<td>" %>
<%="<input type=\"Text\" name=\"Description\">" %>
<%="</td>" %>
<%="</tr>"%>
<%= "<tr>"%>
<%="<td>dueDate:</td>" %>
<%--<%="<td>" --%>
<%= "<td><input type=\"text\" name=\"due_date\" value=\""+ new Date() + "\"/></td>"%>
<%="</td>" %>
<%--<%"</tr>"--%>
<%="<tr>" %>
<%= "<td colspan=\"2\"><input type=\"submit\" value=\"Add\" /></td>"%>
<%="</tr>"%>
<%="</table>"%>

</form>





</body>
</html>