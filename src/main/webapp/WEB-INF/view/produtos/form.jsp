<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>
<base>
<meta charset="UTF-8">
</head>
<body>
	<form action="/spring-curso/produtos" method="POST">
		<div>
			<label>Titulo</label> <input type="text" name="titulo" />
		</div>

		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="descricao"></textarea>
		</div>

		<div>
			<label>Preco</label> 
			<input type="text" name="preco" />
		</div>
		
		<div>
			<label>Paginas</label>
			 <input type="text" name="paginas" />
		</div>
		<button type="submit">Gravar</button>
	</form>
</body>
</html>