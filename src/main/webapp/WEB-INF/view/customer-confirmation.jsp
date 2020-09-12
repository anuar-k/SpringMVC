<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
</head>
<body>
Customer is confirmed ${customer.firstName} ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}
<br><br>
Portal Code: ${customer.portalCode}
<br><br>
Course Code: ${customer.courseCode}
</body>
</html>