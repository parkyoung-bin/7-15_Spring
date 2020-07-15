package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.mapper.BoardMapper;
import com.simple.mapper.ScoreMapper;


@Service("boardService")
public class BoardServiceImpl implements BoardService{


//	
//	@Autowired
//	private BoardDAO boardDao; //어노테이션 입력값을 적는다
//
//	@Override
//	public void boardRegist(BoardVO vo) {
//		boardDao.boardRegist(vo);
//		
//	}
//
//	@Override
//	public ArrayList<BoardVO> getList() {
//		
//		ArrayList<BoardVO> list = boardDao.getList();
//		return list;
//	}
//
//	@Override
//	public void boardDelete(int num) {
//		
//		boardDao.boardDelete(num);
//		
//	}
	
	/*
	 * 1.board관련  mybatis 인터페이스 선언, 구현체를 생성
	 * 2.xml파일에서는 아이디를 이용해서 매퍼태그를 생성
	 * 3.서비스 영역에서 매퍼 주입하고, 추상메서드를 실행. 
	 */
	@Autowired
	private BoardMapper boardMapper;

		
	@Override
	public void boardRegist(BoardVO vo) {
	int result = boardMapper.boardRegist(vo);
	System.out.println("성공실패:"+result);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return boardMapper.getList();
	}

	@Override
	public void boardDelete(int num) {
		boardMapper.boardDelete(num);
		
	}

}
