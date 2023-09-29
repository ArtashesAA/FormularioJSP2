<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario</title>
</head>
<body>
    <h1>Datos Formulario</h1>
    
    <% String nombre=request.getParameter("nombre");%>
    <% String apellidos=request.getParameter("apellidos");%>
    <% String mail=request.getParameter("mail");%>
    <% String genero=request.getParameter("genero");%>
    <% String[] lenguaje=request.getParameterValues("lenguaje");%>
    <% String[] idioma=request.getParameterValues("idiomas");%>
    <% String comentario=request.getParameter("comentario");%>
    
    <!-- You can display the values here, for example: -->
    <p>Nombre: <%= nombre %></p>
    <p>Apellidos: <%= apellidos %></p>
    <p>Mail: <%= mail %></p>
    <p>Genero: <%= genero %></p>
    
    <p>Lenguajes:</p>
    <ul>
        <% if (lenguaje != null) {
            for (String l : lenguaje) { %>
                <li><%= l %></li>
            <% }
        } %>
    </ul>
    
    <p>Idiomas:</p>
    <ul>
        <% if (idioma != null) {
            for (String i : idioma) { %>
                <li><%= i %></li>
            <% }
        } %>
    </ul>
    
    <p>Comentario: <%= comentario %></p>
</body>
</html>
