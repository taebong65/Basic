package com.tae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tae.domain.BoardDTO;
import org.tae.domain.Criteria;
import org.tae.domain.PageDTO;
import org.tae.service.BoardService;


@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	//  : private BoardService service = new BoarService  ���԰���
	private BoardService service;
	
	//글쓰기 화면으로
	
	@GetMapping("write") // write jsp �ҷ���
	public void write() {
		System.out.println("board/write");
	}
	//글쓰기 번틀을 클릭하면
	@PostMapping("write")
	public String writePost(BoardDTO board) {
		service.write(board);
		System.out.println("to" +board);
		
		return  "redirect:/board/list";
	}
	// 게시판 목록 리스트 
	@GetMapping("list")
	public void list(Criteria cri,Model model) {
		
		System.out.println("board/list");
		model.addAttribute("list", service.list(cri));
		int total=service.getTotalCount();
		System.out.println("total="+total);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
		
	}
	//게시판 목록 리스트에서 제목을 클릭하면...
	@GetMapping("detail")
	public void detail(BoardDTO board,Model model) {
		model.addAttribute("detail",service.detail(board));
	}
}


//BoardService service = new BoarService  ���԰���