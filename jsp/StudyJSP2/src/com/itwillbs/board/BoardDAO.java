package com.itwillbs.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	// Data Access Object : DB 데이터 처리 객체
	// => DB에 관한 모든 동작을 하는 객체!
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	//-----------DB 드라이버 정보--------------------
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
	final String DBID = "root";
	final String DBPW = "1234";
	
	
	/* 글쓰기 동작 => 메소드 insertBoard() start */
	public void insertBoard(BoardBean bb) {
		// BoardBean을 받아오는 이유? -> 작성받아온 글 내용이 있어야 insert를 하니까!
		
		try {
			// 1드라이버 로드
			Class.forName(DRIVER);
			// 2디비연결
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			// 3sql작성 (insert) & pstmt객체 생성
			sql = "insert into itwill_board"
					+ " values(?,?,?,?,?,?,?,?,?,now(),?,?)";
			// 4sql 실행
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, bb.getName());
			pstmt.setString(3, bb.getPass());
			pstmt.setString(4, bb.getSubject());
			pstmt.setString(5, bb.getContent());
			pstmt.setInt(6, bb.getReadcount());
			pstmt.setInt(7, bb.getRe_ref());
			pstmt.setInt(8, bb.getRe_lev());
			pstmt.setInt(9, bb.getRe_seq());
			pstmt.setString(10, bb.getIp());
			pstmt.setString(11, bb.getFile());
			
			pstmt.executeUpdate();
			System.out.println("SQL 실행 완료 : 글쓰기 성공! ");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패 " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 연결 실패 " + e.getMessage());
			e.printStackTrace();
		}

	}  
	/* 글쓰기 동작 => 메소드 insertBoard() end */
	
	
}
