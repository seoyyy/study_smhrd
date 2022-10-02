<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="JoinCon" method="post">  <!-- 이 폼을 joincon이라고매핑되어있는 서블릿으로 보낼거야 / 회원가입이닌까 post방식 -->
<table>
   <tr>
      <td>ID : </td>
      <td><input type="text" name = "id"></td>
   </tr>
   <tr>
      <td>PW : </td>
      <td><input type="text" name ="pw"></td>
   </tr>
   <tr>
      <td>nick : </td>
      <td><input type="text" name = "nick"></td>
   </tr>
   <tr><td></td>
      <td align="right"><input type="submit" value="회원가입"> </td>
   </tr>
</table>

</form>



</body>
</html>