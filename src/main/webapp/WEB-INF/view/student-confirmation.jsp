<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title> Student confirmation</title>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
</head>
<body>

Student is confirmed ${student.lastName} ${student.firstName}
<br><br>
Country : ${student.country}
<br><br>
Favorite Language : ${student.favoriteLanguage}
<br><br>
Operating Systems :
<ul>
    <c:forEach var="item" items="${student.operatingSystems}">
        <li> ${item} </li>
    </c:forEach>
</ul>
<br><br>

</body>
</html>