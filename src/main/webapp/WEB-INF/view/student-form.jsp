<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        body {
            height: 800px;
            width: 1440px;
            justify-content: center;
            align-content: center;
        }

        .form-div {
            border: 2px solid blue;
            width: 500px;
            height: 500px;
            background-color: silver;
            justify-content: center;
            align-content: center;
        }
    </style>
</head>
<body>

<div class="form-div">
    <form:form action="processForm" modelAttribute="student">
        First name : <form:input path="firstName"/>
        <br><br>
        Last name : <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        Favorite language:
        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
        <br><br>
        Operating Systems:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac <form:checkbox path="operatingSystems" value="Mac OS"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</div>
</body>
</html>