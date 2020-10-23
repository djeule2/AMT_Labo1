<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste produit</title>
</head>
<body>


<h2>Liste produit</h2>
    <ul>
        <c:forEach items="${produit}" var="produits">
            <li>${produits.nomProduit} : ${produits.categorie}</li>
        </c:forEach>
    </ul>
<jsp:include page="/foot.jsp"></jsp:include>
</body>
</html>
