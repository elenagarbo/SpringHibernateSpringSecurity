<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Zona publica de noticias. Aqui tienes todas las noticias</h2>

<div class="container">

		<h2>Seccion de Noticias</h2>

<!-- 		<a href="LeerNoticias"> -->

 <% String msg = (String)session.getAttribute("servletMsg");
 	out.println(msg);
 %>

	
</div>

</body>
</html>