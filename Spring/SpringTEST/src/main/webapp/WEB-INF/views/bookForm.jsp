<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>도서 입력</h2>

		<form action="bookInsert.do" , method="post">
			<input type="hidden" name="num" value="${book.num}">
			<div class="form-group">
				<label class="control-label col-sm-2" for="title">제목:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="title"
						value="${book.title}" name="title">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="writer">작가:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="author"
						value="${book.author}" name="author">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="content">출판사:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="company"
						value="${book.company}" name="company">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="content">ISBN:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="isbn"
						value="${book.isbn}" name="isbn">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="content">보유도서 수:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="count"
						value="${book.count}" name="count">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
	</div>
	</form>

	</div>

</body>
</html>