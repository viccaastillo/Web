

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgregarTarea
 */
public class AgregarTarea extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter  writer = response.getWriter();
		response.setContentType("text/html");
		writer.print("<html>"
				+"<head>"
				+"<title>Add task</title>"
				+"</head>"
				+"<body>"
				+"<form method=\"POST\">"
				+"<table>"
				+"<tr>"
				+"<td>Title:</td>"
				+"<td>"
				+"<input type=\"Text\" name\"title\">"
				+"</td>"
				+"</tr>"
				+"<td>State:</td>"
				+"<td>"
				+"<select>"
				+"<option value=\"BACKLOG\" selected>Backlog</option>"
				+"<option value=\"TO_DO\"> to do</option>"
				+"<option value=\"IN PROGRESS\"> In progress</option>"
				+"<option value=\"DONE\"> Done </option>"
				+"</select>"
				+"<input type=\"Text\" name\"State\">"
				+"</td>"
				+"</tr>"
				+"<tr>"
				+"<td>Descripcion:</td>"
				+"<td>"
				+"<input type=\"Text\" name\"Description\">"
				+"</td>"
				+"</tr>"
				+"<tr>"
				+"<td>FechaEntrega:</td>"
				+"<td>"
				+"<input type=\"Text\" name\"DueDate\">"
				+"</td>"
				+"</tr>"
				+"<tr>"
				+"<imput type=\"submit\" value=\"Add\"/>"
				+"</td>"
				+"</tr>"
				+"</table>"
				+"</form>"	
				+"</body>"
				+"</html>"
				
				);
		
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String title=request.getParameter("title");
				
				response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		writer.print("<html>"
				+"<body>"
				+"Title: "+title
				+"</body>"
				+"</html>");
	}
	
}
