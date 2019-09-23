<%@ page language="java"
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario de Cadastro do Aluno</title>
</head>

<body>
<h1>Cadastro de Alunos
</h1>

<form:form action="salve" method="POST" modelAttribute="aluno" acceptCharset="UTF-8">
Nome : <form:input path="nome"/><form:errors path="nome"></form:errors><br/> 
Matrícula: <form:input path="matricula"/><form:errors path="matricula"></form:errors><br/> 
Data: <form:input path="dataNasc"/><form:errors path="dataNasc"></form:errors><br/>  
Código do Curso: <form:input path="curso"/><form:errors path="curso"></form:errors><br/>
CRE: <form:input path="cre"/><form:errors path="cre"></form:errors><br/>  
<input type="submit" value="Salvar"/> 
</form:form>
</body>
</html>
		 