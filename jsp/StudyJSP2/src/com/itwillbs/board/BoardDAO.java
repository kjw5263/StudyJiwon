package com.itwillbs.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	// Data Access Object : DB 데이터 처리 객체
	// => DB에 관한 모든 동작을 하는 객체!
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	
	//-----------DB 드라이버 정보--------------------
	/*final String DRIVER = "com.mysql.jdbc.Driver";
	final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
	final String DBID = "root";
	final String DBPW = "1234";*/
	
	
	private Connection getConnection() {
		// 1, 2단계 - 드라이버 로드, DB 연결
		// Connection Pool을 사용하지 않을 때, 
/*		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		
		
		// 커넥션 풀 (Connection pool) : 미리 연결정보(connection)을 생성해서 저장 후 사용(pool) -> 사용 후 반납
		// Context 객체를 생성 (현재 프로젝트 정보를 가지고 있는 객체)
		try {
			Context initCTX = new InitialContext();	 //얘는 인터페이스(부모)!인데 객체 생성(자식)-> 업캐스팅(상속)
			
			// DB 연동 정보를 불러오기 (context.xml)
			DataSource ds = (DataSource) initCTX.lookup("java:comp/env/jdbc/mysqlDB");	// 다운캐스팅
			
			conn = ds.getConnection();
			
			System.out.println("드라이버 로드, 디비 연결 성공!");
			System.out.println(conn);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		return conn;
	}
	
	
	// 자원 해제 코드
	public void closeDB() {
		// 자원 해제
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/* 글쓰기 동작 => 메소드 insertBoard() start */
	public void insertBoard(BoardBean bb) {
		int num = 0;
		// BoardBean을 받아오는 이유? -> 작성받아온 글 내용이 있어야 insert를 하니까!
		try {
			// 1드라이버 로드,  2디비연결
			conn = getConnection();
			
			// (추가) 3. sql (글번호 계산하는 구문 )
			sql = "select max(num) from itwill_board";
			pstmt = conn.prepareStatement(sql);
			
			// 4. sql 쿼리 실행
			ResultSet rs = pstmt.executeQuery();	// 아직 DB에 입력하기 전!! 번호만 받아오는 과정
			
			//5. 데이터 처리
			// max(num) - sql 함수를 실행했을 경우 커서 이동 가능여부를 확인(데이터 유무 상관없음)
			// rs는 커서를 내릴 수 잇느냐를 판단하는 것, 
			// num      - sql 컬럼의 경우 커서 이동 불가능
			if(rs.next()){
				//num = rs.getInt("max(num)")+1;
				num = rs.getInt(1)+1;       // max(num)를 받아오는 쿼리문의 결과는 1개의 값 뿐이므로, 그값+1 
			}
			
			System.out.println("글 번호 : " + num);
			//////////////////////////////////////////////////////
			// 3sql작성 (insert) & pstmt객체 생성
			sql = "insert into itwill_board"
					+ " values(?,?,?,?,?,?,?,?,?,now(),?,?)";
			// 4sql 실행
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);	// 글 번호 -> 이걸 어떻게 할까?
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
		} catch (SQLException e) {
			System.out.println("SQL 연결 실패 " + e.getMessage());
			e.printStackTrace();
		} finally {
			// 자원 해제
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}  
	/* 글쓰기 동작 => 메소드 insertBoard() end */
	
	
	/* 글쓰기 동작 => 메소드 insertBoard() start 
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
			pstmt.setInt(1, 1);	// 글 번호
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
	 글쓰기 동작 => 메소드 insertBoard() end */
	
	
	// getBoardCount(); : DB에 들어있는 글의 개수 계산 후 리턴하는 메소드
	public int getBoardCount() {
		int cnt = 0;
		
		try {
			//1,2 드라이버 로드, 디비 연결
			conn = getConnection();
			
			//3. sql 작성&pstmt 객체 생성
			sql = "select count(*) from itwill_board";
			pstmt = conn.prepareStatement(sql);
			
			//4. sql 실행
			ResultSet rs = pstmt.executeQuery();
			
			//5. 데이터 처리
			if(rs.next()){
				cnt = rs.getInt(1);	// "count(*)"
				// cnt = rs.getInt("count(*)");
			}
			
			System.out.println("SQL 구문 실행 완료");
			System.out.println("글 개수 : "+cnt + "개");
			
		} catch (Exception e) {
			System.out.println("[게시판 글 개수]_에러발생!");
			e.printStackTrace();
		} finally {
			// 자원 해제
			/*try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
			closeDB();
		}
		
		
		
		
		return cnt;
	} // getBoardCount();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
