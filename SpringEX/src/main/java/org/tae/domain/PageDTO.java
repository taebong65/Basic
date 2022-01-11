package org.tae.domain;

public class PageDTO {
	private int startPage;
	//시작 페이지번호
	private int endPage;
	// 끝 페이지번호
	private boolean prev;
	//이전페이지 유뮤
	private boolean next;
	//다음페이지 유뮤
	private int total;
	//endpage페이지를 계산하기 위한 pageNum가 필요하므로 Criteria클래스를 포함

	private Criteria cri;
	
	public PageDTO(Criteria cri, int total){
		this.cri=cri;
		this.total=total;
		// (int)(Math.ceil (현재 웹페이지 번호/10.0))*10 계산된 결과를 endPage에 저장
		this.endPage=(int)(Math.ceil(cri.getPageNum()/10.0))*10;
		//10-9=1, 20-9=11....
		this.startPage=endPage-9;
		//전체건수를 고려한 endpage -> realEnd
		//(int)(Math.ceil((전체건수*1.0/10));
		int realEnd=(int)(Math.ceil((total*10)/cri.getAmount()));
		//realEnd > endpage = > realEnd값을 endPage에 저장
		if(realEnd<endPage) {
			this.endPage=realEnd;
		}
		this.prev=this.startPage > 1;
		this.next=this.endPage < realEnd;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "PageDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", total=" + total + ", cri=" + cri + "]";
	}
}
