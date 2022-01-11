package org.tae.service;

import java.util.ArrayList;

import org.tae.domain.BoardDTO;
import org.tae.domain.Criteria;

public interface BoardService {

	// 게시판 글쓰기 설계
	public void write(BoardDTO board);
	// 게시판 목록리트스 설계
	public ArrayList<BoardDTO> list(Criteria cri );
	//게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지 

	
	public BoardDTO detail(BoardDTO board);
	ArrayList<BoardDTO> list();
	
	public int getTotalCount();



	
	
	// �Խ��� ��� ����Ʈ 
	
	// �Խ��� ��������
	// �Խ��� ����������
	// �Խ��� ���� ������ 
}
