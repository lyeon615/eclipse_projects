package edu.bit.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ContextListenerEx
 */
@WebListener
public class ContextListenerEx implements ServletContextListener {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextListenerEx() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    	System.out.println("contextDestroyed");
    }
    
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
    	System.out.println("contextInitialized");
    }
}
