/**
 * 
 */
$(document).ready(function(){
	var actionForm = $("#actionForm");
// 현제 페이지 번호를 클릭하면
	$(".paginate_button a").on("click",function(e){
		e.preventDefault();
		actionForm.find("input[name='pageNum']").val($(this).attr("href"))
	    actionForm.submit();
		
	})
	
// form태그 안에 있는 값을 가져와라
})