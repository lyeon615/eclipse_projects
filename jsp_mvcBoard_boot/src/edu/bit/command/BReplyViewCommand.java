package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		String bId = req.getParameter("bId");
		
		BDao dao = new BDao();	
		BDto dto = dao.reply_view(bId);
		
		req.setAttribute("reply_view", dto);
	}

}
