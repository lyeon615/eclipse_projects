package edu.bit.hw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet implementation class MainServlet
 
@WebServlet("*.do")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}


	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		String conPath = request.getContextPath();
		
		String command = uri.substring(conPath.length());
		
		if(command.equals("/memberInfo.do")) {
			
			response.setContentType("text/html; charset=EUC-KR");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			
			Service service = new Service();
			ArrayList<EmpDto> dtos = service.execute(request, response);
			
			writer.println("<table border=\"1\">");
			for(int i=0 ; i<dtos.size(); i++) {
				EmpDto dto = dtos.get(i);
				String eName = dto.geteName();
				String job = dto.getJob();
				String mgr = dto.getMgr();
				String hireDate = dto.getHireDate();
				String sal = dto.getSal();
				String comm = dto.getComm();
				String deptNo = dto.getDeptNo();
				
				writer.println("<tr>");
				writer.println("<td>" + eName + "</td>");
				writer.println("<td>" + job + "</td>");
				writer.println("<td>" + mgr + "</td>");
				writer.println("<td>" + hireDate + "</td>");
				writer.println("<td>" + sal + "</td>");
				writer.println("<td>" + comm + "</td>");
				writer.println("<td>" + deptNo + "</td>");
				writer.println("</tr>");
			}
			writer.println("</table>");
			
			writer.println("</body></html>");		
		}
	}
}
