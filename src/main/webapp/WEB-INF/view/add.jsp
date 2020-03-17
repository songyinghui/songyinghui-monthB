<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--支持缩放 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>外派加工单</title>
<link rel="stylesheet" type="text/css"
	href="/resource/bootstrap.min.css" />
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
	<form>
		联络单号:<input type="text" name="dh"> <br>制造部:<input type="text"
			name="makeDept"><br>制造部编号:<input type="text"
			name="makeDeptNo"><br> 报送日期:<input type="text" name="baoTime">
       <br>配件名称:<select name="pid" id="s" >
         
       
       </select>
       配件编号:<input type="text" id="pj"><br>
       参考单价:<input type="text" name="oneprice">
       数量:<input type="text" name="num">
       金额:<input type="text" name="price"><br>
      技术要求:<input type="text" name="yaoqiu"><br>
      设备部编号:<input type="text" name="matchineBh"><br>
      设备部:<input type="text" name="matchineDept"><br>
      配件外送时间:<input type="text" name="peijian"><br>
      审核单价:<input type="text" name="shOnePrice"><br>
      审核金额:<input type="text" name="shPrice"><br>
      发货确认人:<input type="text" name="people"><br>
      加工单位:<input type="text" name="dw"><br>
      加工单位单价:<input type="text" name="dwdj"><br>
      配件送回时间:<input type="text" name="returnTime"><br>
      采购部报销人:<input type="text" name="bxPeople"><br>
      联系人:<input type="text" name="telePeople"><br>
      加工单位金额:<input type="text" name="dwPrice"><br>
      收获确认人:<input type="text" name="okPeople"><br>
      备注:<input type="text" name="beizhu">
      加工检验图片<input type="file" name="file"><br>
      <input type="button" value="添加" onclick="add()">
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
 function  add(){
	  $.ajax({
			type : "post",
			url : "publish",
			// 告诉jQuery不要去处理发送的数据
			processData : false,
			// 告诉jQuery不要去设置Content-Type请求头
			contentType : false,
			data : $("form").serialize(),
			success : function(flag) {
				alert("添加成功");
			 location="list"
			}
		})
  }
</script>
</html>