package edu.bit.hw;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		Dao dao = new Dao();
		
		ArrayList<Dto> dtos = dao.list();
		req.setAttribute("list", dtos);		
	}
	
	
}
