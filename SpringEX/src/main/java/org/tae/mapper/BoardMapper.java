package org.tae.mapper;

import java.util.ArrayList;

import org.tae.domain.BoardDTO;
import org.tae.domain.Criteria;

public interface BoardMapper {
	
	//寃뚯떆�뙋 湲��벐湲곗� 愿��젴�씠 �릺�뼱 �엳�뒗 DB�옉�뾽�뿉 �꽕移�
	public void write(BoardDTO board);
	
	public ArrayList<BoardDTO> list(Criteria cri);
	//寃뚯떆�뙋 湲��벐湲곗� 愿��젴�씠 �릺�뼱 �엳�뒗 DB�옉�뾽�뿉 �꽕移�
	
	public BoardDTO detail(BoardDTO board);
	
	//게시판 목록리스트에서 제목을 클릭했을 때 조회수 
	
	public void cntupdate();
	
	//게시판 페이징에 쓰일 전체 건수
	
	public int getTotalCount();

	

}
