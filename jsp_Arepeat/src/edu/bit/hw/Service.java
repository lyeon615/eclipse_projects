package edu.bit.hw;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Service {
	public ArrayList<EmpDto> execute (HttpServletRequest request, HttpServletResponse response){
		
		EmpDao dao = EmpDao.getInstance();
		
		return dao.membersAll();
	}
}
