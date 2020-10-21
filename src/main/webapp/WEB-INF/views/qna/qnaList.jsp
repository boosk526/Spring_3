<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootstrap.jsp"></c:import>
</head>
<body>

<c:import url="../template/header.jsp"></c:import>

  
<div class="container">
  <h3>Notice List</h3>
  <div class="row">
  <div class="col-sm-8">
  <form action="./qnaList">
  	 <div class="input-group">
    	 <select class="input-group-sm" id="sel1" name="kind">
    		<option value="tt">Title</option>
   			<option value="wr">Writer</option>
    		<option value="con">Contents</option>
  		</select>
    	<input id="msg" type="text" class="form-control" name="search" placeholder="Additional Info">
    	<div class="input-group-btn">
      		<button class="btn btn-default" type="submit">
        	<i class="glyphicon glyphicon-search"></i>
      		</button>
    	</div>
  	</div>
  	
  </form>
  </div>
  </div>
  
  <div>
  <table class="table table-hober">
  	<tr>
  		<td>Num</td>
  		<td>Title</td>
  		<td>Writer</td>
  		<td>Date</td>
  		<td>Hit</td>
  		<td>Ref</td>
  		<td>Step</td>
  		<td>Depth</td>
  	</tr>
  	<c:forEach items="${lists}" var="dto" varStatus="vs">
  		<tr>
  			<td>${dto.num}  : ${vs.first} </td>
  			<td>
  				<a href="./qnaSelect?num=${dto.num}">
  				<c:forEach begin="1" end="${dto.depth}">--</c:forEach>
  				${dto.title}
  				</a>
  			</td>
  			<td>${dto.writer}</td>
  			<td>${dto.reg_date}</td>
  			<td>${dto.hit}</td>
  			<td>${dto.ref}</td>
  			<td>${dto.step}</td>
  			<td>${dto.depth}</td>
  		</tr>
  	
  	
  	</c:forEach>
  	
  
  </table>
  </div>
  <div>
  
  	<c:if test="${pager.beforeCheck}">
  	<a href="./qnaList?curPage=${pager.startNum-1}&kind=${pager.kind}&search=${search}">[이전]</a>
  	</c:if>
  
  	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
  		<a href="./qnaList?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a>
  	</c:forEach>
  	
  	<c:if test="${pager.nextCheck}">
  	<a href="./qnaList?curPage=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}">[다음]</a>
  	</c:if>
  </div>
  


  
  <a href="./qnaWrite" class="btn btn-danger">Write</a>
  
</div>

</body>
</html>