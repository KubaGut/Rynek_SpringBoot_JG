<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<a href="/home">Home</a>
<a href="/home/shoplist">LISTA STOISK</a>
<a href="/home/findproducts">ZNAJDZ PRODUKT</a>
<a href="/home/shops">STREFA SPRZEDAWCY</a>
<a href="/home/orders">ZAMOW</a>

<div> LOG IN  </div>
<form action="/login" method="post">
    <div><label for="username">Login: <input type="username" id="username" name="username"/></label></div>
    <div><label for="password">Hasło: <input type="password" id="password" name="password"/></label></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <div><input type="submit" value="Zaloguj"/></div>
</form>

</body>
</html>
