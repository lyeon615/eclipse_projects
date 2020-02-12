package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {		
		
		String bName = req.getParameter("bName");
		String bTitle = req.getParameter("bTitle");
		String bContent = req.getParameter("bContent");
		String bId = req.getParameter("bId");

		BDao dao = new BDao();
		dao.modify(bName, bTitle, bContent, bId);
		
	}

}
