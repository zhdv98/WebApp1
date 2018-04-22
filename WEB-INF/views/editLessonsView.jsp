<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Lessons</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">

</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>

<h3>Редактирование пар</h3>

<p style="color: red;">${errorString}</p>

<c:if test="${not empty lessons}">
    <form method="POST" action="${pageContext.request.contextPath}/editLessons">
        <input type="hidden" name="num" value="${lessons.num}" />
        <table border="0" class="table table-hover">
            <tr>
                <td>№</td>
                <td style="color:red;">${lessons.num}</td>
            </tr>
            <tr>
                <td>П-11</td>
                <td><input type="text" name="p_11" value="${lessons.p_11}" /></td>
            </tr>
            <tr>
                <td>П-12</td>
                <td><input type="text" name="p_12" value="${lessons.p_12}" /></td>
            </tr>
            <tr>
                <td>П-13</td>
                <td><input type="text" name="p_13" value="${lessons.p_13}" /></td>
            </tr>
            <tr>
                <td>П-14</td>
                <td><input type="text" name="p_14" value="${lessons.p_14}" /></td>
            </tr>
            <tr>
                <td>Р-11</td>
                <td><input type="text" name="r_11" value="${lessons.r_11}" /></td>
            </tr>
            <tr>
                <td>Р-12</td>
                <td><input type="text" name="r_12" value="${lessons.r_12}" /></td>
            </tr>
            <tr>
                <td>К-11</td>
                <td><input type="text" name="k_11" value="${lessons.k_11}" /></td>
            </tr>
            <tr>
                <td>К-12</td>
                <td><input type="text" name="k_12" value="${lessons.k_12}" /></td>
            </tr>
            <tr>
                <td>К-13</td>
                <td><input type="text" name="k_13" value="${lessons.k_13}" /></td>
            </tr>
            <tr>
                <td>Е-11</td>
                <td><input type="text" name="e_11" value="${lessons.e_11}" /></td>
            </tr>
            <tr>
                <td>Ф-11</td>
                <td><input type="text" name="f_11" value="${lessons.f_11}" /></td>
            </tr>
            <tr>
                <td>Д-11</td>
                <td><input type="text" name="d_11" value="${lessons.d_11}" /></td>
            </tr>
            <tr>
                <td>А-11</td>
                <td><input type="text" name="a_11" value="${lessons.a_11}" /></td>
            </tr>
            <tr>
                <td>О-11</td>
                <td><input type="text" name="o_11" value="${lessons.o_11}" /></td>
            </tr>
            <tr>
                <td>АР-11</td>
                <td><input type="text" name="ar_11" value="${lessons.ar_11}" /></td>
            </tr>

            <tr>
                <td colspan = "2">
                    <input type="submit" value="Изменить" />
                    <a href="${pageContext.request.contextPath}/lessonsList">Cancel</a>
                </td>
            </tr>
        </table>
    </form>
</c:if>

<jsp:include page="_footer.jsp"></jsp:include>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js" integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU" crossorigin="anonymous"></script>
</body>
</html>