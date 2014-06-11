

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
				+"<input type=\"Text\" name=\"titulo\">"
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
				+"<input type=\"Text\" name=\"State\">"
				+"</td>"
				+"</tr>"
				+"<tr>"
				+"<td>Descripcion:</td>"
				+"<td>"
				+"<input type=\"Text\" name=\"Description\">"
				+"</td>"
				+"</tr>"
				+"<tr>"
				+"<td>dueDate:</td>"
				+"<td>"
			
				+"<td><input type=\"text\" name=\"due_date\" value=\""+ new Date() + "\"/></td>"
				+"</td>"
				+"</tr>"
				+"<tr>"
			
				+"<td colspan=\"2\"><input type=\"submit\" value=\"Add\" /></td>"
				+"</tr>"
				+"</table>"
				+"</form>"
				+ "</body>"
				+"</html>"				
				);
		
		
	
	}
	Task Tarea = new Task();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		Tarea.setTitle(request.getParameter("titulo"));
		Tarea.setDescription(request.getParameter("Description"));
	Tarea.setEntrega(request.getParameter("due_date"));
	
	Tarea.setEstado((request.getParameter("State")));
	 
		/*try {
			Tarea.setState(State.valueOf(request.getParameter("State")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	

		if(confirmacion()==true){

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<html><body>" +"La Tarea se Agrego con exito"+ "</body></html>"+"<br>");
		writer.print("<html><body>" +"Con el titulo: "+ request.getParameter("titulo")+"<br>");
	writer.print("<html><body>" +"Fecha de ngreso: "+ new Date()+"<br>");
		writer.print("<html><body>" +"Fecha de Entrega: "+ request.getParameter("due_date")+"<br>" );
	
		}
	}
	
	public boolean confirmacion (){
		Programa.dashboard.add(Tarea);
		return true;
		
	}
	
}
