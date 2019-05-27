<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <!-- Pas géniaux les imports mais de toute façon JSP c'est obsolète ! -->
    <c:import url="/layout/head.jsp">
        <c:param name="title" value="Créer une musique" />
    </c:import>
    <body>
        <c:import url="/layout/header.jsp">
            <c:param name="title" value="Créer une musique" />
        </c:import>
        <form action="./" class="form" method="POST">
            <div class="form-group">
                <label>Artiste</label>
                <input type="text" name="artiste" placeholder="Nom de l'artiste" />
            </div>
            <div class="form-group">
                <label>Titre</label>
                <input type="text" name="titre" placeholder="Nom de la musique" />
            </div>
            <div class="form-group">
                <label>Durée</label>
                <input type="number" name="duree" value="180" />
            </div>
            <input class="btn" type="submit" value="Enregistrer" />
        </form>
    </body>
</html>
