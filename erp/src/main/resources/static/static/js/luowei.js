function cnmd(){
			nimabide();
		}
		function nimabide(){		//添加商品详情
			//alert("nimabide()")
			$("[name=goodskc] tbody").html("");
			var kc=$("[name=goodkuchun]").val();
			if(kc==""){
				kc=1;
			}
			$("#tab_none tbody tr").each(function(){
				var yanshe=$(this).find("input").eq(1).val();
				var yansheid=$(this).find("input").eq(1).attr("colorID");
				if(yanshe!=""){
					$.each($("[name=chimaya] a"),function(a,b){					
						if($(b).attr("name")=="noundefined"){
							
							$(this).parents("li").attr("class","cmxz");
							//alert($(this).parents("li").html());
							
							var shuijima="";
							for(var i=0;i<12;i++){
								var j=parseInt(Math.random()*10);
								if(i==0&&j==0){
									j++;
								}
								shuijima+=j;
							}
							
							$("[name=goodskc] tbody").append("<tr>" +
																"<td>" +
																	"<span colorID="+yansheid+"  name='colorID'>"+yanshe+"</span>" +
																	"<span>——</span>" +
																	"<span productCodeID="+$(b).attr("commoditySizeID")+" name='productCodeID'>"+$(b).html()+"</span>" +
																"</td>" +
																/*"<td>" +
																	"<input type='text' name='count' style='width: 137px;text-align:center;	' class='form-control spxqcount' placeholder='请输入数量'  value='1' onchange='jszsl()'> " +
																"</td>" +*/
																"<td name='commodityDetailID'>"+shuijima+"</td>" +
															"</tr>");
						}
						})
						
				}
			})
			
			
			
			jszsl()
		}
		
		
		function jszsl(){//计算总库存
			//alert("jszsl()")
			//计算总数量
			var kczs=0;
			$(".spxqcount").each(function(){
				//alert($(this).val())
				kczs=parseInt($(this).val())+parseInt(kczs);
			})
			//alert(kczs)
			$("[name=goodkuchun]").val(kczs)
		}
		
		$("#shopgoods").mouseover(function(){
			$("[name=chimaya] a").unbind("click");
			niubi();
		})
		
		function niubi(){//点击编辑尺码时
			//alert("niubi()")
			$("[name=chimaya] a").click(function(){		

				if($(this).attr("name")=="noundefined"){
					$(this).parents("li").attr("class","");
					$(this).attr("name","undefined");
					$(this).attr("style","color:black");
					nimabide();
				}else{
					$(this).attr("style","color:red");
					$(this).attr("name","noundefined");
						nimabide();
					}
			
		
			})
	
		}
			
			
		$("[name=colorbao] input").click(function(){	//点击颜色选框
			//alert("[name=colorbao] input.click")
			var color=$(this).next().find("span").eq(0).attr("style");
			var colorname=$(this).next().find("span").eq(1).html();
			var colorid=$(this).next().find("span").eq(1).attr("colorID");
			
			if($(this).attr("checked")=="checked"){
				$(this).removeAttr("checked");
				var index=0;
				$("#tab_none tbody tr").each(function(a,b){					
					index+=a;
				})
				$("#tab_none tbody tr").each(function(a,b){
					var yanshe=$(b).find("input").eq(1).val();						
					if(colorname==yanshe){	
						$(b).remove();
						
					}
				})
				
				if(index==0){
					$("#tab_none").hide();
				}
				nimabide();
			}else{
				$("#tab_none tbody").append(`
						<tr>
							<td>
								<span style="margin-left: 4px;">1</span>
								<span>.</span>
								<span style="margin-left: 4px;"><input type="checkbox" /></span>
								<span style="display: inline-block;margin-left: 4px;width: 50%;"><input type="text" onblur="cnmd()" class="form-control" placeholder="请输入颜色" value="${colorname}"  colorID="${colorid}"/></span>
								<span style="margin-left: 9px;" class="glyphicon glyphicon-remove" onclick="yichu(this)"></span>
							</td>
							<td>
								<span style="display: inline-block;width: 50%"><input style="${color}" type="text" class="form-control" disabled="disabled" /></span>
								<span><button type="button" class="btn btn-primary active">上传图片</button></span>
							</td>
						</tr>
					`);
				$("#tab_none").show();
				$(this).attr("checked","checked");
				nimabide();
			}
		})
			
			$("#addColor").click(function(){//添加颜色
				//alert("#addcolor.click")
				$("#tab_none tbody").append(`
					<tr>
						<td>
							<span style="margin-left: 4px;">1</span>
							<span>.</span>
							<span style="margin-left: 4px;"><input type="checkbox" /></span>
							<span style="display: inline-block;margin-left: 4px;width: 50%;"><input type="text" onblur="cnmd()" class="form-control" placeholder="请输入颜色"  /></span>
							<span style="margin-left: 9px;" class="glyphicon glyphicon-remove" onclick="yichu(this)"></span>
						</td>
						<td>
							<span style="display: inline-block;width: 50%"><input type="text" class="form-control" disabled="disabled" /></span>
							<span><button type="button" class="btn btn-primary active">上传图片</button></span>
						</td>
					</tr>
				`);
				$("#tab_none").show();
			});
			function sc(a){//点击删除商品尺码
				//alert("sc")
				var commoditysizeid=$(a).prev().attr("commoditysizeid");//获取尺码id
				 $.ajax({//根据尺码id删除（如此尺码被使用则提示被“占用，不能删除”）
					url:"/CommoditysizeController/deleteByPrimaryKey2",
					type:"get",
					data:"commoditysizeid="+commoditysizeid,
					dataType:"json",
					success:function(res){
						alert(res.message)
						if(res.code==1){
//							删除尺码
							var name=$(a).prev().html();
							$(a).parent().remove();
							nimabide();
//							删除尺码
						}
					}
				}) 
				
				
			}
			
			function enen(){//点击编辑尺码按钮
				//alert("enen")
				var name=$("[name=bjcm]").html();
				if(name=="编辑尺码"){
					$("[name=chima]").show();
					$(".fpsize").append(`
						<li><input name="lw" style="width: 147.33px; height: 34px;"></li>
					`);
					$("[name=bjcm]").html("保存修改");
					$("[name=chimaya] a").unbind("click");
					niubi();
				}else{
					var nima=$("[name=lw]").val();//新添加的尺码名
					$(".fpsize input").parent().remove();
					$("[name=bjcm]").html("编辑尺码");
					if(nima!=""){
					$(".fpsize").append("<li><a href='javascript:;'>"+nima+"</a><span style='float: right;' name='chima' class='glyphicon glyphicon-remove' onclick='sc(this)'></span></li>");
					$("[name=chimaya] a").unbind("click");
					niubi();
					}
					$("[name=chima]").hide();
					
					var obj={commoditysize:nima}
					 $.ajax({//新增尺码
						 url:'/CommoditysizeController/insertSelective',
							type:"post",
						  	data : JSON.stringify(obj),
						  	dataType:'json',	
						  	contentType : "application/json;charset=utf-8",
							success:function(res){
								alert(res.message)
							}
						}) 
				}
				
			}
			
			function yichu(a){//删除颜色
				//alert("yichu")
				var tr = $(a).parent().parent();
				var inpu=tr.find("input").eq(1).val();
				$("[name=colorbao] input").each(function(a,b){
				
					if($(b).next().find("span").eq(1).html()==inpu){
						$(this).removeAttr("checked");
					}
				})
				var index=0;
				$("#tab_none tbody tr").each(function(a,b){					
					index+=a;
				})
				tr.remove();
				if(index==0){
					$("#tab_none").hide();
				}
				nimabide();
			}
		