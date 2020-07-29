package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_members {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	private void getConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ours";
		String password = "ours";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// �����ͺ��̽� �ڿ��� �ݳ��ϴ� �ݱ� �޼ҵ�
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public int update(String id, String pw, String newId) {
	int cnt = 0;

	try {
		getConnection();
		String sql = "update members set id = ? where id =? and pw = ?";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, newId);
		psmt.setString(2, id);
		psmt.setString(3, pw);

		cnt = psmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}
	return cnt;
}
	
//	public VO login(VO vo) {
//		VO result = null;
//		try {
//			getConnection();
//			String sql = "select name,age from members where id =? and pw = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, vo.getId());
//			psmt.setString(2, vo.getPw());
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				String name = rs.getString(1);
//				int age = rs.getInt(2);
//				result =new VO(name, age);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return result;
//	}
//
//	// ȸ������ �޼ҵ�
//	public int insert(VO vo) {
//		int cnt = 0;
//		try {
//			getConnection();
//			String sql = "insert into members values(?,?,?,?)";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, vo.getId());
//			psmt.setString(2, vo.getPw());
//			psmt.setString(3, vo.getName());
//			psmt.setInt(4, vo.getAge());
//			cnt = psmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//
//		return cnt;
//	}
//
//	public int update(String id, String pw, String newId) {
//		int cnt = 0;
//
//		try {
//			getConnection();
//			String sql = "update members set id = ? where id =? and pw = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, newId);
//			psmt.setString(2, id);
//			psmt.setString(3, pw);
//
//			cnt = psmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return cnt;
//	}
//
//	public int delete(VO vo) {
//		int cnt = 0;
//
//		try {
//			getConnection();
//			String sql = "DELETE FROM MEMBERS WHERE id = ? and pw = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, vo.getId());
//			psmt.setString(2, vo.getPw());
//
//			cnt = psmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return cnt;
//	}
//
//	public ArrayList<VO> allSelect() {
//
//		ArrayList<VO> list = new ArrayList<VO>();
//		
//		try {
//			getConnection();
//			String sql = "SELECT * FROM MEMBERS";
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			int num = 1;
//			while (rs.next()) {
//				String id = rs.getString(1);
//				String pw = rs.getString(2);
//				String name = rs.getString(3);
//				int age = rs.getInt(4);
//				VO vo = new VO(id, pw, name, age);
//				list.add(vo);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return list;
//	}

}