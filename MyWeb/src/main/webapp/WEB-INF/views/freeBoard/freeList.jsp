﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>인덱스를 만들어 보자</title>

<link
	href="${pageContext.request.contextPath }/resources/css/bootstrap.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!--개인 디자인 추가-->
<link href="${pageContext.request.contextPath }/resources/css/style.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script>


</head>
<body>

	<%@ include file="../include/header.jsp"%>
	<!--게시판-->
	<section>
		<div class="container-fluid">
			<div class="row">
				<!--lg에서 9그리드, xs에서 전체그리드-->
				<div class="col-lg-9 col-xs-12 board-table">
					<div class="titlebox">
						<p>자유게시판</p>
					</div>
					<hr>

					<!--form select를 가져온다 -->
					
					<form>				
						<div class="search-wrap">
							<span>총 ${pageVO.total }개</span>
							<button type="button" class="btn btn-info search-btn">검색</button>
							<input type="text" class="form-control search-input"> <select
								class="form-control search-select">
								<option>제목</option>
								<option>내용</option>
								<option>작성자</option>
								<option>제목+내용</option>
							</select>
						</div>
					</form>

					<table class="table table-bordered">
						<thead>
							<tr>
								<th>번호</th>
								<th class="board-title">제목</th>
								<th>작성자</th>
								<th>등록일</th>
								<th>수정일</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="vo" items="${boardList }">

								<tr>
									<td>${vo.bno }</td>
									<td><a href="freeDetail?bno=${vo.bno }">${vo.title }</a></td>
									<td>${vo.writer }</td>
									<td><fmt:formatDate value="${vo.regdate }"
											pattern="yyyy-MM-dd hh:mm:ss" /></td>
									<td><fmt:formatDate value="${vo.updatedate }"
											pattern="yyyy-MM-dd hh:mm:ss" /></td>
								</tr>

							</c:forEach>
						</tbody>

					</table>


					<!--페이지 네이션을 가져옴-->
					<form>
						<div class="text-center">
							<hr>

							<ul class="pagination pagination-sm">

								<c:if test="${pageVO.prev }">
									<li><a
										href="freeList?pageNum=${pageVO.startPage-1}&amount=${pageVO.amount}">이전</a></li>
								</c:if>
								
								<c:forEach var="num" begin="${pageVO.startPage }" end="${pageVO.endPage }">
									<li class="${num==pageVO.pageNum ? 'active' : '' }">
									<a href="freeList?pageNum=${num }&amount=${pageVO.amount}">${num}</a>
									</li>
								</c:forEach>
								
								<c:if test="${pageVO.next }">
                        		<li><a href="freeList?pageNum=${pageVO.endPage+1 }&amount=${pageVO.amount}">다음</a></li>
                        		</c:if>
                    			
							</ul>
							<button type="button" class="btn btn-info" onclick="location.href='freeRegist'">글쓰기</button>
						</div>
					</form>

				</div>
			</div>
		</div>
	</section>
	<%@ include file="../include/footer.jsp"%>

	<script>
	window.onload = function(){ //화면 로딩이 끝난 직후에 실행
		
		//기록이 변경되었다면 ,함수 종료
		if(history.state ===''){
			return;
		}
		
		var msg='${msg}';
		if(msg !== ''){
			alert(msg);
		}
		// (추가할데이터,페이지제목,변경할주소)-기존기록을 삭제하고 새로운기록추가
		// 이렇게 추가된 데이터를 history.state 로 확인이 가능
		history.replaceState('',null,null) 
	}
	</script>
</body>









</html>

