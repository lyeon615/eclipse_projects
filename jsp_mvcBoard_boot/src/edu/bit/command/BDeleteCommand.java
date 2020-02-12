package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		String bId = req.getParameter("bId");

		BDao dao = new BDao();
		
		dao.delete(bId);

	}

}
