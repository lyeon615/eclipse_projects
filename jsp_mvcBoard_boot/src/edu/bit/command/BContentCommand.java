package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {

		String bId = req.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		//��Ʈ�ѷ��� dto �� ����
		req.setAttribute("content_view", dto);		
	}
}
