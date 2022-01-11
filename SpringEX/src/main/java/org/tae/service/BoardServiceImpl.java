package org.tae.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tae.domain.BoardDTO;
import org.tae.domain.Criteria;
import org.tae.mapper.BoardMapper;
@Service
public class BoardServiceImpl  implements BoardService { 
			private static final Criteria Criteria = null;
		// 占쌉쏙옙占쏙옙 占쌜억옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙 占쏙옙占쏙옙 
		@Autowired
		private BoardMapper bmapper;
		public void write(BoardDTO board) {
			
		
			bmapper.write(board);
		
	}
		
		public ArrayList<BoardDTO> list(Criteria cri) {
			
			return bmapper.list(cri);
			
		}

		@Override
		public BoardDTO detail(BoardDTO board) {
			
			return bmapper.detail(board);
		}

		@Override
		public ArrayList<BoardDTO> list() {
			// TODO Auto-generated method stub
			return null;
		}
		
		// 寃뚯떆�뙋 紐⑸줉由ъ뒪�듃�뿉�꽌 �젣紐⑹쓣 �겢由��뻽�쓣 �븣 �궡�슜�씠 �굹�삤�뒗 �긽�꽭�럹�씠吏� �꽕怨꾨맂寃껋쓣 援ы쁽


//		@Transactional
//		public BoardDTO detail1(BoardDTO board) {
//	
//	
//		bmapper.cntupdate(board);
//			
//		return bmapper.detail(board);


// 게시판 페이징에 쓰일 데이터 건수 
 	public int getTotalCount() {
 	return	bmapper.getTotalCount();
 	}
 		
 	}
