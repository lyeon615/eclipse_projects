package edu.bit.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		
//		String id = getInitParameter("id");
//		String pw = getInitParameter("pw");
//		String path = getInitParameter("path");
		
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String path = getServletContext().getInitParameter("path");
		
		response.setContentType("text/html; charset = EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("ID: " + id + "<br />");
		writer.println("PASSWORD: " + pw + "<br />");
		writer.println("path: " + path + "<br />");
		writer.println("</body></html>");
		
		writer.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("dopost");

		req.setCharacterEncoding("EUC-KR");

		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		String[] hobby = req.getParameterValues("hobby");
		//복수니까 배열로 받기 위해 getParameterValues 메소드 사용
		String major = req.getParameter("major");
		String protocol = req.getParameter("protocol");

		res.setContentType("text/html; charset = EUC-KR");
		PrintWriter writer = res.getWriter();

		writer.println("<html><head></head><body>");
		writer.println("ID: " + id + "<br />");
		writer.println("PASSWORD: " + pw + "<br />");
		writer.println("취미: " + Arrays.toString(hobby) + "<br />");
		writer.println("전공: " + major + "<br />");
		writer.println("프로토콜: " + protocol);
		writer.println("</body></html>");
		
		writer.close();
	}
}
