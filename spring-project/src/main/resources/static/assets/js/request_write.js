function categoryChange(e) {
	var counrty_a = ["일본", "중국", "러시아", "몽골"];
	var counrty_b = ["태국", "필리핀", "베트남", "캄보디아"];
	var counrty_c = ["아프카니스탄", "우즈베키스탄"];
    var counrty_d = ["이스라엘", "사우디아라비아"];
    var counrty_e = ["불가리", "헝가리", "폴란드"];
	var counrty_f = ["영국", "스웨덴", "노르웨이", "핀란드", "덴마크"];
	var counrty_g = ["스페인", "그리스", "이탈리아", "포르투갈"];
    var counrty_h = ["프랑스", "독일", "네덜란드", "벨기에","스위스","모나코"];
	var counrty_i = ["미국", "캐나다", "멕시코", "쿠바"];
	var counrty_j = ["베네수엘라", "브라질", "아르헨티나", "페루"];
    var counrty_k = ["모로코", "이집트"];
	var counrty_l = ["마다가스타르", "케냐"];
	var counrty_m = ["호주"];
	var target = request_write.getElementById("counrty");

	if(e.value == "동북아시아") var n = new type(arguments); = counrty_a;
	else if(e.value == "동남아시아") var n = counrty_b;
	else if(e.value == "중앙아시아") var n = counrty_c;
    else if(e.value == "서아시아") var n = counrty_d;
    else if(e.value == "동유럽") var n = counrty_e;
    else if(e.value == "서유럽") var n = counrty_f;
    else if(e.value == "남유럽") var n = counrty_g;
    else if(e.value == "북유럽") var n = counrty_h;
    else if(e.value == "북아메리카") var n = counrty_i;
    else if(e.value == "남아메리카") var n = counrty_j;
    else if(e.value == "북아프리카") var n = counrty_k;
    else if(e.value == "남아프리카") var n = counrty_l;
    else if(e.value == "오스트레일리아") var n = counrty_m;

	target.options.length = 0;

	for (x in n) {
		var opt = request_write.createElement("option");
		opt.value = n[x];
		opt.innerHTML = n[x];
		target.appendChild(opt);
	}	
}

   

