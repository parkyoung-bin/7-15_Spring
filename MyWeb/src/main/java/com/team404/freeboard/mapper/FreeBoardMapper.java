package com.team404.freeboard.mapper;

import java.util.ArrayList;

import com.team404.command.FreeBoardVO;
import com.team404.util.Criteria;

public interface FreeBoardMapper {

	public void regist(FreeBoardVO vo);
	public ArrayList<FreeBoardVO> getList(Criteria cri);//글목록
	public int getTotal(); //총게시글 수
	public FreeBoardVO getContent(int bno);
	public FreeBoardVO getInfo(int bno);
	public int update(FreeBoardVO vo);//변경
	public int delete(FreeBoardVO vo);//삭제
}
