package edu.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.command.BCommand;
import edu.bit.command.BContentCommand;
import edu.bit.command.BDeleteCommand;
import edu.bit.command.BListCommand;
import edu.bit.command.BModifyCommand;
import edu.bit.command.BReplyCommand;
import edu.bit.command.BReplyViewCommand;
import edu.bit.command.BWriteCommand;

@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BFrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo");

		request.setCharacterEncoding("EUC-KR");

		String viewPage = null;
		BCommand command = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		System.out.println("test URI : " + uri + ":" + conPath + ":" + com);

		if (com.equals("/write_view.do")) {
			viewPage = "write_view.jsp";

		} else if (com.equals("/write.do")) {

			command = new BWriteCommand();
			command.execute(request, response);

			viewPage = "list.do";
			
		} else if (com.equals("/list.do")) {

			command = new BListCommand();
			command.execute(request, response);

			viewPage = "list.jsp";

		} else if (com.equals("/content_view.do")) {

			command = new BContentCommand();
			command.execute(request, response);

			viewPage = "content_view.jsp";

		} else if (com.equals("/modify.do")) {

			command = new BModifyCommand();
			command.execute(request, response);

			viewPage = "list.do";
			
		} else if (com.equals("/delete.do")) {

			command = new BDeleteCommand();
			command.execute(request, response);

			viewPage = "list.do";
			
		} else if (com.equals("/reply_view.do")) {

			command = new BReplyViewCommand();
			command.execute(request, response);

			viewPage = "reply_view.jsp";
			
		} else if (com.equals("/reply.do")) {

			command = new BReplyCommand();
			command.execute(request, response);

			viewPage = "list.do";
			
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
