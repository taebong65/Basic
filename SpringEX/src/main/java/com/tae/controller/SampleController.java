package com.tae.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tae.domain.SampleMemberDTO;

@Controller
@RequestMapping("sample")
public class SampleController {
	/* 
	    * GET : 속도는 빠르지만 보안 취약
	    * POST: 속도는 느리지만 보안 보장(회원가입할 시)
	    * */
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	//@RequestMapping(value="sample", method=RequestMethod.GET)
	@GetMapping("")
	public void basic(Model model) {
		logger.info("sample 실행됨.");
		// aaaa 문자열을 abcd변수에 저장하여 sample.jsp에 보내기
		model.addAttribute("abcd","aaaa");
	}
	//@RequestMapping(value="ex01", method=RequestMethod.GET)
	@GetMapping("ex01")
	public String basic1(Model model) {
		logger.info("sample/ex01 실행됨.");
		// bbbb문자열을 zzzz변수에 저장해라
		model.addAttribute("zzzz", "bbbb");
		return "ex01";
	}
	//@RequestMapping(value="index", method=RequestMethod.GET)
	@GetMapping("index")
	public String index(Model mod) {
		mod.addAttribute("yyyy", "cccc");
		return "index";
	
	
	}

	//파일을 처리하는 방법
    //@RequestMapping(value = "index",method = RequestMethod.GET)
    //public void index() {

    //}
	
	 //@RequestMapping(value="member", method=RequestMethod.GET)
	@GetMapping("member")
	   public String member(String id, String pw, String name,Model model) {
	      System.out.println("id="+id);
	      System.out.println("pw="+pw);
	      System.out.println("name="+name); 
	      
	      model.addAttribute("id",id);
	      
	      model.addAttribute("pw",pw);
	      
	      model.addAttribute("name",name);
	      
	      
	      return "member";
	 }
	 //@RequestMapping(value="memberDTO", method=RequestMethod.GET)
	 @PostMapping("memberDTO")
	   public String memberdto(SampleMemberDTO smd,Model model) {
	      System.out.println("id="+smd.getId());
	      System.out.println("pw="+smd.getPw());
	      System.out.println("name="+smd.getName());
	     
	      
	      model.addAttribute("id", smd.getName());
	      
	      //return "memberDTO";
	      //return "redirect:/";
	      return "redirect:/sample/member";
	      
	      
	 }

	
}

// 화면에서 서버로 데이터를 전송하는 2가지 방식 
// 1. get -> 장점  : post 방식보다 처리속도가 빠르다 단점 : post방식보다 보안에는 취약하다
//   문법 : <form action"서버주소"method="get">
//			id:<input type="text" name="id";
//      	pw : <input type="password" name="pw">
//      	name : <input type ="text name="name">
//		  </form> 
//      <a href ="서버주소?id=aaa&pw=1234@name=정자바"></a>

//2.post -> 장점 : get 방식보다 보안에는 강하다 단점: get 방식보다 처리속도가 느리다. 
// 문법 : <form action"서버주소"method="post">
//			id:<input type="text" name="id";
//			pw : <input type="password" name="pw">
//			name : <input type ="text name="name">	
//		</form>