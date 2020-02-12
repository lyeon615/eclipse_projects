package sqlProject;

import java.sql.*;
import java.util.ArrayList;

public class MyRecordController {

	Connection conn;

	public MyRecordController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection();
	}

	public ArrayList<MyRecordVO> selectAll() {
		ArrayList<MyRecordVO> list = new ArrayList<>();
		String sql = "SELECT * FROM myRecord";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				MyRecordVO r = new MyRecordVO();
				r.setId(rs.getInt("id"));
				r.setPlanetId(rs.getInt("planetId"));
				r.setDiscoveryTime(rs.getDate("discoveryTime"));
				r.setLevel(rs.getInt("level"));
				r.setConnectingSatellite(rs.getString("connectingSatellite"));
				list.add(r);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public MyRecordVO select(int id) {
		MyRecordVO myRecordVO = new MyRecordVO();
		String sql = "SELECT * FROM myRecord WHERE id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				myRecordVO.setId(id);
				myRecordVO.setPlanetId(rs.getInt("planetId"));
				myRecordVO.setDiscoveryTime(rs.getDate("discoveryTime"));
				myRecordVO.setLevel(rs.getInt("level"));
				myRecordVO.setConnectingSatellite(rs.getString("connectingSatellite"));
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return myRecordVO;
	}
	
	public void insert(MyRecordVO myRecordVO) {
		String sql ="INSERT INTO myRecord(planetId, discoveryTime, level, connectingSatellite) "
				+ "VALUES(?, ?, ?, ?) ";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, myRecordVO.getPlanetId());
			pstmt.setDate(2, myRecordVO.getDiscoveryTime());
			pstmt.setInt(3, myRecordVO.getLevel());
			pstmt.setString(4, myRecordVO.getConnectingSatellite());
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(MyRecordVO myRecordVO) {
		String sql = "UPDATE myRecord SET level = ?, connectingSatellite = ? ";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, myRecordVO.getLevel());
			pstmt.setString(2, myRecordVO.getConnectingSatellite());
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	/*별이 있다가 없어질 수 없으니까 여기서는 삭제가 없어야 될듯?
	public void delete(int id) {
		String sql = "DELETE FROM myRecord WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	*/
}
