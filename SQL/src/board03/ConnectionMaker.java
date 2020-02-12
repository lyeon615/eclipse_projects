package board03;

import java.sql.*;

public interface ConnectionMaker {
	public Connection makeConnection() throws Exception;
}
