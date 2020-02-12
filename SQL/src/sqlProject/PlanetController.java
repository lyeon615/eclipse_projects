package sqlProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlanetController {
	Connection conn;

	public PlanetController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection();
	}

	public ArrayList<PlanetVO> selectAll() {
		ArrayList<PlanetVO> list = new ArrayList<>();
		String sql = "SELECT * FROM planet";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				PlanetVO p = new PlanetVO();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setGravity(rs.getFloat("gravity")); 
				p.setType(rs.getInt("type"));
				p.setCreature(rs.getString("creature"));
				p.setResource(rs.getString("resource"));
				p.setWonder(rs.getString("wonder"));
				p.setSatelliteMatch(rs.getString("satelliteMatch"));

				list.add(p);
			}
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return list;
	}


	public PlanetVO select(int id) {
		PlanetVO planetVO = new PlanetVO();
		String sql = "SELECT * FROM planet WHERE id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				planetVO.setId(id);
				planetVO.setName(rs.getString("name"));
				planetVO.setGravity(rs.getFloat("gravity")); 
				planetVO.setType(rs.getInt("type"));
				planetVO.setCreature(rs.getString("creature"));
				planetVO.setResource(rs.getString("resource"));
				planetVO.setWonder(rs.getString("wonder"));
				planetVO.setSatelliteMatch(rs.getString("satelliteMatch"));		
			}
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return planetVO;
	}
	public PlanetVO selectName(int id) {
		PlanetVO planetVO = new PlanetVO();
		String sql = "SELECT * FROM planet WHERE id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				planetVO.setId(id);
				planetVO.setName(rs.getString("name"));
			}
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return planetVO;
	}
	
	public ArrayList<PlanetVO> search(String name) {		
		ArrayList<PlanetVO> list = new ArrayList<>();
		String sql = "SELECT * FROM project.planet WHERE name LIKE ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, '%' + name + '%');
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				PlanetVO p = new PlanetVO();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
			
				list.add(p);
			}
					
		}catch (SQLException e) {
				e.printStackTrace();
		}
		return list;
	}
}



