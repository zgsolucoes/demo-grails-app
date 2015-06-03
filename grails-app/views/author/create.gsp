<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form action="save" method="POST">
    <label for="name">Name</label><input type="text" id="name" name="name"/>
    <label for="email">Email</label><input type="email" id="email" name="email"/>

    <input type="submit"/>
</g:form>
</body>
</html>