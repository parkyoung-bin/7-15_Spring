package com.simple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;



@Repository("boardDao")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public void boardRegist(BoardVO vo) {

		String sql = "insert into board(num,name,title,content) values(board_seq.nextval,?,?,?)";
		jdbcTemplate.update(sql,new Object[] { vo.getName(),vo.getTitle(),vo.getContent() });
	}

	@Override
	public ArrayList<BoardVO> getList() {
		String sql = "select * from board order by num desc";

		List<BoardVO>list= jdbcTemplate.query(sql, new Object[] {}, new RowMapper<BoardVO>() {

			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				return vo;

			}
		});

		return (ArrayList<BoardVO>) list;
	}


	@Override
	public void boardDelete(int num) {
		System.out.println("DAOnum들오오니?"+num);
		String sql = "delete from board where num=?";
		jdbcTemplate.update(sql,new Object[] {num});
	}


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

}
