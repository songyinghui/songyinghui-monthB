<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--支持缩放 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>修改外派加工单</title>
<link rel="stylesheet" type="text/css"
	href="/resource/bootstrap.min.css" />
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
	<form>
		联络单号:<input type="text" name="dh" value="${jiagong.dh }"> <br>制造部:<input type="text"
			name="makeDept" value="${jiagong.makeDept }"><br>制造部编号:<input type="text"
			name="makeDeptNo" value="${jiagong.makeDeptNo }"><br> 报送日期:<input type="text" name="baoTime" value="${jiagong.baoTime }">
       <br>配件名称:<select name="pid" id="s" >
         
       
       </select>
       配件编号:<input type="text" id="pj"><br>
       参考单价:<input type="text" name="oneprice" value="${jiagong.oneprice }">
       数量:<input type="text" name="num" value="${jiagong.num }">
       金额:<input type="text" name="price" value="${jiagong.price }"><br>
      技术要求:<input type="text" name="yaoqiu" value="${jiagong.yaoqiu }"><br>
      设备部编号:<input type="text" name="matchineBh" value="${jiagong.matchineBh }"><br>
      设备部:<input type="text" name="matchineDept" value="${jiagong.matchineDept }"><br>
      配件外送时间:<input type="text" name="peijian" value="${jiagong.peijian }"><br>
      审核单价:<input type="text" name="shOnePrice" value="${jiagong.shOnePrice }"><br>
      审核金额:<input type="text" name="shPrice" value="${jiagong.shPrice }"><br>
      发货确认人:<input type="text" name="people" value="${jiagong.people }"><br>
      加工单位:<input type="text" name="dw" value="${jiagong.dw }"><br>
      加工单位单价:<input type="text" name="dwdj" value="${jiagong.dwdj }"><br>
      配件送回时间:<input type="text" name="returnTime" value="${jiagong.returnTime }"><br>
      采购部报销人:<input type="text" name="bxPeople" value="${jiagong.bxPeople }"><br>
      联系人:<input type="text" name="telePeople" value="${jiagong.telePeople }"><br>
      加工单位金额:<input type="text" name="dwPrice"value="${jiagong.dwPrice }"><br>
      收获确认人:<input type="text" name="okPeople" value="${jiagong.okPeople }"><br>
      备注:<input type="text" name="beizhu" value="${jiagong.beizhu }">
      加工检验图片<input type="file" name="file"><br>
      <input type="button" value="修改" onclick="update()">
	</form>
</body>
<script type="text/javascript">
  $.ajax({
	  url:"getAll",
	  success:function(obj){
		  for ( var i in obj) {
		   $("#s").append("<option value='"+obj[i].id+"'>"+obj[i].name+" </option>")
		}
	  }  
  })
  function update(){
	   $.ajax({
		   url:"updateOne",
		   type:"post",
		   processData : false,
			// 告诉jQuery不要去设置Content-Type请求头
			contentType : false,
		   data:$("form").serialize(),
		   success:function(obj){
			   if(obj){
				   alert("修改成功")
				   location="list"
			   }
		   }
		   
	   })
  }
</script>
</html>