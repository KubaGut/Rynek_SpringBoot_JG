<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>

<a href="/home">Home</a>
<a href="/home/shoplist">LISTA STOISK</a>
<a href="/home/findproducts">ZNAJDZ PRODUKT</a>
<a href="/home/shops">STREFA SPRZEDAWCY</a>
<a href="/home/orders">ZAMOW</a>

<p> ${shop.name} WITAMY W STREFIE SPRZEDAWCY!!</p>

<div> DODAJ PRODUKT DO OFERTY </div>
<form method="post" action="/home/shops/addproduct">
    <input type="text" name="name" value="" />
    <input type="text" name="price" value=""/>
    <input type="text" name="quantity" value=""/>
    <input type="submit" value="LOG IN" />
</form>
