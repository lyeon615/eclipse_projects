package edu.bit.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembersAllService implements Service {

	@Override
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response) { 
		// DAO ��ü�� �����ؼ� �Լ��� ����.
		
		MemberDao dao = MemberDao.getInstance(); 
		// .getInstance() static �Լ�(new ���ߴµ� ��ü����)
		
		return dao.membersAll();
	}

}