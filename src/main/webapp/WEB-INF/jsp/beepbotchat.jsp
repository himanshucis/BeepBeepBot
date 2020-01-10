<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Bip Bot</title>
</head>
<body>
<div class="container">
  <div style="height:600px;" class="contant">
  <h4><span>Hii </span>${location.userName}<br></h4>
  <h4><span>Your Location -></span>${location.address}<br></h4>
  <h4><span>Location Weather -></span>${location.weather}°C</h4>
  <form action="/newscontroller/countrynews" method="post">
  <select name="cntryname" class="browser-default custom-select" required="required">
  <option selected value="">select country news</option>
  <c:forEach items="${country}" var="ctry"> 
  <option value="${ctry.country}">${ctry.country}</option>
  </c:forEach>
  <option value="Venuzuela">Others</option>
  </select>
  <button type="submit" class="btn btn-info">News</button>
  </form>
  <a href="/beepbotcontroller/home"><button type="button" class="btn btn-warning">Back</button></a>
  </div>
</div>
</body>
</html>