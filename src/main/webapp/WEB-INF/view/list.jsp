<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--支持缩放 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/resource/bootstrap.min.css" />
	<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
<button onclick="add()">添加</button>
<form action="list">
  联络单号:<input type="text" name="dh" value="${con.dh }">
  类型:<select name="selectTj">
      <option value="makeDeptNo">制造部编号</option>
     <option value="makeDept">制造部</option>
  </select>
  内容:<input type="text" name="selectMe" value="${con.selectMe }">
  备注:<input type="text" name="beizhu" value="${con.beizhu }">
  报送日期:<input type="text" name="time1" value="${con.time1 }">-<input type="text" name="time2" value="${con.time2 }">
   <input type="submit" value="查询">
</form> 
    <table class="table table-sm">
       <tr>
        <td>报送日期</td>
        <td>联络单号</td>
        <td>制造部编号</td>
        <td>制造部</td>
        <td>配件编号</td>
        <td>配件名称</td>
        <td>参考单价</td>
        <td>数量</td>
        <td>金额</td>
        <td>设备部编号</td>
        <td>设备部</td>
        <td>技术要求</td>
       <td>审核单价</td>
       <td>审核金额</td>
       <td>配件外送时间</td>
       <td>加工检验</td>
       <td>配件送回时间</td>
       <td>操作</td>
       </tr>
     <c:forEach items="${info.list }" var="list" >
      <tr>
        <td><fmt:formatDate value="${list.baoTime }"/></td>
        <td>${list.dh }</td>
        <td>${list.makeDeptNo }</td>
        <td>${list.makeDept }</td>
        <td>${list.peijian.bh }</td>
        <td>${list.peijian.name }</td>
        <td>${list.oneprice }</td>
        <td>${list.num }</td>
        <td>${list.price }</td>
        <td>${list.matchineBh }</td>
        <td>${list.matchineDept }</td>
        <td>${list.yaoqiu }</td>
       <td>${list.shOnePrice }</td>
       <td>${list.shPrice }</td>
       <td><fmt:formatDate value="${list.waisong }"/></td>
       <td>${list.picture }</td>
       <td><fmt:formatDate value="${list.returnTime }"/></td>
       <td><button onclick="updateOne(${list.id })">修改</button></td>
       </tr>
     
     </c:forEach>
    
    </table>
    <jsp:include page="/WEB-INF/view/common/pages.jsp"></jsp:include>
</body>
<script type="text/javascript">
 function add(){
	 location="add"
 }
 function goPage(page){
	 location="list?page="+page;
 }
 function updateOne(id){
	 location="update?id="+id;
 }
</script>
</html>