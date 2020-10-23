<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Ajoute Produit</title>
  </head>
  <body>
    <h2>Ajoute Produit</h2>

    <form action="ajoute" method="post">
      <div id="idProduit">
        <label for="idProduit">idProduit</label>
        <input type="text" name="idProduit" value="${idProduit}"/>
      </div>
      <div id="nomProduit">
      <label for="nomProduit">nom produit</label>
      <input type="text" name="nomProduit" value="${nomProduit}">
      </div>
      <div id="prixProduit">
        <label for="prixProduit">prix produit</label>
        <input type="text" name="prxProduit" value="${prixProduit}"/>
      </div>
      <div id="categorie">
        <label for="categorie">categorie</label>
        <input type="text" name="categorie" value="${categorie}"/>
      </div>
      <div id="description">
        <label for="description">description</label>
        <input type="text" name="description" value="${description}"/>
      </div>

      <button type="submit" name="Submit">Ajoute</button>
    </form>
    <c:if test="${errors != null}">
      Errors:
      <ul>
        <c:forEach items="${errors}" var="error">
          <li>${error}</li>
        </c:forEach>
      </ul>
    </c:if>
  </body>
</html>
