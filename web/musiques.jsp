<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <!-- Pas géniaux les imports mais de toute façon JSP c'est obsolète ! -->
    <c:import url="/layout/head.jsp">
        <c:param name="title" value="Musiques" />
    </c:import>
    <body>
        <c:import url="/layout/header.jsp">
            <c:param name="title" value="Musiques" />
        </c:import>
        <c:if test="${param.success}">
            <p class="success-message">
                 La musique a bien été créée !
            </p>
        </c:if>
        <p>
            <a class="btn" href="./create.jsp">Créer une musique</a>
        </p>
        <ul class="musique-ul">
            <c:forEach items="${musiqueList}" var="musique">
                <li class="musique-li">
                    <span class="musique-li-icon fas fa-music"></span>
                    <strong class="musique-li-title">${musique.titre}</strong>
                    <span class="musique-li-artiste">${musique.artiste}</span>
                    <i class="musique-li-duree">${musique.dureeAsString}</i>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
