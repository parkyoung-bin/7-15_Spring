package com.simple.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("boardDao")
public class BoardDAOImpl implements BoardDAO{


	
//	@Autowired
//	DataSource dataSource;
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Override
//	public void boardRegist(BoardVO vo) {
//		
//		String sql = "insert into board (num, writer, title, content) values (board_req.nextval, ?, ?, ?)";
//		
//		int result = jdbcTemplate.update(sql, new Object[] {vo.getName(), vo.getTitle(), vo.getContent()});
//		
//		System.out.println("결과 : " + result);
//
//	}
//	@Override
//	public ArrayList<BoardVO> getList() {	
//		
//		String sql = "select * from board order by num desc";
//		
//		List<BoardVO> list = jdbcTemplate.query(sql, new Object[] {}, new RowMapper<BoardVO>() {
//
//			@Override
//			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
//				BoardVO vo = new BoardVO();
//				
//				vo.setNum(rs.getInt("num"));
//				vo.setName(rs.getString("writer"));
//				vo.setTitle(rs.getString("title"));
//				vo.setContent(rs.getString("content"));
//
//				return vo;
//			}
//			
//		});
//
//		return (ArrayList<BoardVO>)list;
//	}
//
//	@Override
//	public void boardDelete(int num) {
//		
//		String sql = "delete from board where num = ?";
//		
//		jdbcTemplate.update(sql, new Object[] {num});
//		
//	}

	
//	//DB라고 가정
//	ArrayList<BoardVO> DB = new ArrayList<>();
//
//	@Override
//	public void boardRegist(BoardVO vo) {
//	
//		DB.add(vo);
//		
//	}
//
//	@Override
//	public ArrayList<BoardVO> getList() {
//		
//		return DB;
//	}
//
//	@Override
//	public void boardDelete(int num) {
//		
//		DB.remove(num);
//	}
	@Override
	public void boardRegist(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		
	}
}
