<%--
  Created by IntelliJ IDEA.
  User: Jacopo
  Date: 17/02/2015
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="">
    <input type="text" name="MovieTitle"><br>
    <input type="submit" value="Submit">

</form>
<%
    if (request.getParameter("MovieTitle")!=null) {
        client.MovieServerInterface service = new client.MovieService().getMovieServerImplPort();
        out.println(service.getJsonFromRottenTomatoes(request.getParameter("MovieTitle")));

    }
%>
</body>
</html>
