package e.b.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import e.b.dao.DDao;
import e.b.dto.DDto;

public class DListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		DDao dao = new DDao();

		ArrayList<DDto> dtos = dao.list();
		req.setAttribute("dlist", dtos);
	}
}
