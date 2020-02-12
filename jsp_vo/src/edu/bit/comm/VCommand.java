package edu.bit.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VCommand {
	void execute(HttpServletRequest req, HttpServletResponse res);
}
