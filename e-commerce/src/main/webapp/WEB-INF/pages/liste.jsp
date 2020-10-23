<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="normalize.css" />
  <link rel="stylesheet" href="style.css" />
  <link
          href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
          rel="stylesheet"
  />
  <title>Asteroids | Epic Asteroids Game</title>
</head>
  <body>
    <h2>Liste contacts</h2>
    <c:if test="${empty number}">
    <ul>
      <c:forEach items="${contacts}" var="contact" >
        <li>${contact.nom} : ${contact.telephone}</li>
      </c:forEach>
    </ul>
    </c:if>
    <c:if test="${not empty number}">
    <ul>
      <c:forEach items="${contacts}" var="contact" end="${number-1}" >
        <li>${contact.nom} : ${contact.telephone}</li>
      </c:forEach>
        <li><em>${contacts[number].nom} : ${contacts[number].telephone}</em></li>
      <c:forEach items="${contacts}" var="contact" begin="${number+1}" >
        <li>${contact.nom} : ${contact.telephone}</li>
      </c:forEach>
    </ul>
    </c:if>
  </body>
</html>
