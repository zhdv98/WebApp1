<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Расписание пар</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>



<p style="color: red;">${errorString}</p>

<table class="table table-hover">
    <tr>
        <th>№</th>
        <th>П_11</th>
        <th>П_12</th>
        <th>П_13</th>
        <th>П_14</th>
        <th>Р_11</th>
        <th>Р_12</th>
        <th>К_11</th>
        <th>К_12</th>
        <th>К_13</th>
        <th>Е_11</th>
        <th>Ф_11</th>
        <th>Д_11</th>
        <th>А_11</th>
        <th>О_11</th>
        <th>АР_11</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${lessonsList}" var="lessons" >
        <tr>
            <td>${lessons.num}</td>
            <td>${lessons.p_11}</td>
            <td>${lessons.p_12}</td>
            <td>${lessons.p_13}</td>
            <td>${lessons.p_14}</td>
            <td>${lessons.r_11}</td>
            <td>${lessons.r_12}</td>
            <td>${lessons.k_11}</td>
            <td>${lessons.k_12}</td>
            <td>${lessons.k_13}</td>
            <td>${lessons.e_11}</td>
            <td>${lessons.f_11}</td>
            <td>${lessons.d_11}</td>
            <td>${lessons.a_11}</td>
            <td>${lessons.o_11}</td>
            <td>${lessons.ar_11}</td>
            <td>
                <a href="editLessons?num=${lessons.num}">Edit</a>
            </td>
            <td>
                <a href="deleteLessons?num=${lessons.num}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>



<jsp:include page="_footer.jsp"></jsp:include>

<!-- jQuery первый, затем Tether, затем Bootstrap JS. -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js" integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU" crossorigin="anonymous"></script>
</body>
</html>