(function($) {

	$(".bg-info h3").text("250");

	$(".bg-info p").text("Current Orders");
	
	$(".bg-info").removeClass("bg-info").addClass("bg-danger");

	$("section.col-lg-7 div.card:eq(0)").remove();
	var button = "<button id='btn'>テスト</button>";
	var invisible = "<button id='ivb'>非表示</button>";
	$("h1:contains('Dashboard')").parent()
		.append(button)
		.append(invisible);
	$("#btn").on("click",function(){
		$(this).attr("value","OK!")
			.text("OK!")
			.css("background-color","Gold");
	});
	$("#ivb").on("click",function(){
		$("section.col-lg-5 div.card:eq(0)").hide(1000);
	});
	var dashboardv4 = '<li class="nav-item"><a href="./index.html" class="nav-link"><i class="far fa-circle nav-icon"></i><p>Dashboard v4</p></a></li>';
	var dashboard = $("nav ul li ul:eq(0)");
	dashboard.append(dashboardv4);
	dashboard.find("li:eq(3) > a").addClass("active").attr("href","http://google.co.jp");
	dashboard.find("li:eq(0) > a").removeClass("active");
	
	
//	$("li:eq(3)",dashboard).append("active");
   
})(jQuery);
