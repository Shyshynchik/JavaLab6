<%--
  Created by IntelliJ IDEA.
  User: igork
  Date: 18.04.2022
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>

    <form action="set-data" method="post">
        <div class="container">
            <h1>Введите данные</h1>
            <p>Пожайлуста, зполните следующие данные</p>
            <hr>

            <label><b>Имя</b></label>
            <input type="text" placeholder="Введите имя" name="name" required>

            <label><b>Фамилия</b></label>
            <input type="text" placeholder="Введите фамилию" name="lastName" required>

            <label><b>Отчество</b></label>
            <input type="text" placeholder="Введите отчество" name="patronymic" required>

            <label><b>Наименование дисциплины</b></label>
            <input type="text" placeholder="Введите дисциплину" name="subject" required>

            <label><b>Выберите оценку</b></label><br>
            <span class="custom-dropdown big">
                <select name="mark">
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </span>
            <hr>

            <button type="submit" class="registerbtn">Отправить</button>
        </div>
    </form>
</body>
</html>
