package com.simple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.simple.command.ScoreVO;

//@Service("socrdDAO")
//@Componet
@Repository("scoreDAO")
public class ScoreDAOImpl implements ScoreDAO{

	@Override
	public void scoreRegist(ScoreVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ScoreVO> scoreList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scoreDelete(int num) {
		// TODO Auto-generated method stub
		
	}

	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//
//	@Override
//	public void scoreRegist(ScoreVO vo) {
//		
//		String sql = "insert into score (num, name, kor, eng, math) values(score_req.nextval, ?, ?, ?, ?)";
//		
//		//String[] arr = new String[] {"1",  "2", "3"};
//		
//		int result = jdbcTemplate.update(sql, new Object[] {vo.getName(), vo.getKor(), vo.getEng(), vo.getMath()});
//		
//		System.out.println("결과 : " + result);
//		
//	}
//
//
//	@Override
//	public ArrayList<ScoreVO> scoreList() {
//		String sql = "select * from score";
//		
//		List<ScoreVO> list = jdbcTemplate.query(sql, new Object[] {}, new RowMapper<ScoreVO>() {
//
//			@Override
//			public ScoreVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
//				//제네릭에는 select구문을 처리할 vo가 들어갑니다.
//				//MapRow메서드 안에서는 resultSet객체를 처리하는 구문이 들어갑니다.
//				
//				ScoreVO vo = new ScoreVO();
//				vo.setNum(rs.getInt("num"));
//				vo.setName(rs.getString("name"));
//				vo.setKor(rs.getString("kor"));
//				vo.setEng(rs.getString("eng"));
//				vo.setMath(rs.getString("math"));
//
//				return vo;
//			}
//			
//	
//		});
//		return (ArrayList<ScoreVO>) list;
//	}
//
//
//	@Override
//	public void scoreDelete(int num) {
//
//		String sql = "delete from score where num = ?";
//		
//		jdbcTemplate.update(sql, new Object[] {num});
//		
//	}






}
