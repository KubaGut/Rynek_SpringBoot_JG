<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<a href="/home">Home</a>
<a href="/home/shoplist">LISTA STOISK</a>
<a href="/home/findproducts">ZNAJDZ PRODUKT</a>
<a href="/home/shops">STREFA SPRZEDAWCY</a>
<a href="/home/orders">ZAMOW</a>

<div> CREATE ACCOUNT </div>
<form method="post" action="/home/shops/login">
    <input type="text" name="Login" value="" />
    <input type="password" name="Password" value=""/>
    <input type="submit" value="LOG IN" />
</form>

</body>
</html>
