package com.simple.mapper;

import java.util.ArrayList;

import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;

public interface BoardMapper {

	public int boardRegist(BoardVO vo);
	public ArrayList<BoardVO> getList();//목록
	public void boardDelete(int num);//삭제
	
}
