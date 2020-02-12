
$(".navlists>ul>li:nth-child(1)").addClass("current-item")
$(".navlists>ul>li").click(function(){
	$(".navlists>ul>li").removeClass("current-item")
	$(this).addClass("current-item")
})