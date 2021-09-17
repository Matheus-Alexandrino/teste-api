<%@ page language="java" contentType="text/html; charset+UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    Country Name: ${country.name} <br/>
    Country Capital: ${capital.name} <br/>
    Country Population: ${country.population} <br/>
    Country Currencies: <br/>
    <c:forEach items="${country.currencies}" var="currency">
        <tr>
            <td>Currency Name: <c:out value=${"currency.name"}</td><br>
            <td>Currency Symbol: <c:out value=${"currency.symbol"}</td>
        </tr>
    </c:forEach>


</body>
</html>