package e.b.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import e.b.dao.BDao;
import e.b.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list();		
		
		req.setAttribute("list", dtos);
	}
}
