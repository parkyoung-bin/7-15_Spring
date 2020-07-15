package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;


@Repository("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDao; //어노테이션 입력값을 적는다

	@Override
	public void boardRegist(BoardVO vo) {
		boardDao.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {

		return boardDao.getList();
	}

	@Override
	public void boardDelete(int num) {
System.out.println("서비스 num"+num);
		 boardDao.boardDelete(num);

	}

}




