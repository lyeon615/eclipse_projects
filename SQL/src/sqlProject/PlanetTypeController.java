package sqlProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlanetTypeController {
	Connection conn;

	public PlanetTypeController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection();
	}
	public ArrayList<PlanetTypeVO> selectAll() {
		ArrayList<PlanetTypeVO> list = new ArrayList<>();
		String sql = "SELECT * FROM planetType";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				PlanetTypeVO p = new PlanetTypeVO();
				p.setId(rs.getInt("id")); 
				p.setType(rs.getString("type"));
				
				list.add(p);
			}
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return list;
	} 
	public PlanetTypeVO select(int id) {
		PlanetTypeVO planetTypeVO = new PlanetTypeVO();
		String sql = "SELECT * FROM planetType WHERE id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				planetTypeVO.setId(id); 
				planetTypeVO.setType(rs.getString("type"));		
			}
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return planetTypeVO;
	}
	
}
