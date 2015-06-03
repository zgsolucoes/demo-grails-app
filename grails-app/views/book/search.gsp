<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Busca de livros</title>
</head>

<body>
<ul>
    <g:each in="${bookList}" var="book">
        <li>
            ${book.title} : ${book.year}
        </li>
    </g:each>
</ul>
</body>
</html>