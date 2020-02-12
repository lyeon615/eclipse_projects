package board03;
//Database와 통신을 담당하는 컨트롤러 클래스

//만약 DB와의 기능이 추가적으로 더 필요해진다면? 컨트롤러만 건드린다.

import java.sql.*;
import java.util.ArrayList;

public class BoardController {
	// Dependency injection 의존성 주입, setter를 이용 / 생성자를 이용 / xml을 이용하는 방법들이 있는데
	// DI와 IOC 개념이 스프링에서 도움이 될거래/우리는 오늘 interface를 이용해서 DI를 할 거란다

	// 우리는 setter이용
	Connection conn;

	// 하지만 셋터를 이용한 의존성 주입은 강제성이 떨어지기 대문에 기본생성자를 막고 파라미터가 있는 생성자를 만들기
	// ConnectionMaker가 들어와서
	// makeConnection()메소드를 통해서 Connection conn이 초기화될수 있게 만들어서 생성자를 통한 DI구현
	public BoardController(ConnectionMaker m) throws Exception {
		conn = m.makeConnection();
	}

	public ArrayList<BoardVO> selectAll() {
		ArrayList<BoardVO> list = new ArrayList<>();
		String sql = "SELECT * FROM board";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO b = new BoardVO();
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWrittenDate(rs.getDate("writtenDate"));
				b.setUpdatedDate(rs.getDate("updatedDate"));
				list.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public BoardVO select(int id) {
		BoardVO boardVO = new BoardVO();
		String sql = "SELECT * FROM board WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				boardVO.setId(id);
				boardVO.setTitle(rs.getString("title"));
				boardVO.setContent(rs.getString("content"));
				boardVO.setWrittenDate(rs.getDate("writtenDate"));
				boardVO.setUpdatedDate(rs.getDate("updatedDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardVO;
	}

	public void insert(BoardVO boardVO) {
		String sql = "INSERT INTO board(title, content, writtenDate, updatedDate) "
					+ "VALUES(?, ?, NOW(), NOW())";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getContent());
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(BoardVO boardVO) {
		String sql = "UPDATE board SET title = ?, content = ?, updatedDate = NOW() WHERE id = ? ";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getContent());
			pstmt.setInt(3, boardVO.getId());
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(int id) {
		String sql = "DELETE FROM board WHERE id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
