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
	<style type="text/css">
	div.contant{ 
                margin:4px,4px; 
                padding:4px; 
                height: 320px; 
                overflow: scroll;
                text-align:justify; 
            } 
	</style>
<title>Bip Bot</title>
</head>
<body>
<div class="container">
  <div style="height:600px;" class="contant">
  <h3 style="color:red;">News 1</h3>
  <h4><span style="color:blue;">Source :-</span>${news.source[0]}<br></h4>
  <h4><span style="color:blue;">Title :-</span>${news.title[0]}<br></h4>
  <h4><span style="color:blue;">Content :-</span>${news.content[0]}</h4> 
  <h3 style="color:red;">News 2</h3>
  <h4><span style="color:blue;">Source :-</span>${news.source[1]}<br></h4>
  <h4><span style="color:blue;">Title :-</span>${news.title[1]}<br></h4>
  <h4><span style="color:blue;">Content :-</span>${news.content[1]}</h4> 
  <h3 style="color:red;">News 3</h3>
  <h4><span style="color:blue;">Source :-</span>${news.source[2]}<br></h4>
  <h4><span style="color:blue;">Title :-</span>${news.title[2]}<br></h4>
  <h4><span style="color:blue;">Content :-</span>${news.content[2]}</h4> 
  <a href="/beepbotcontroller/home"><button type="button" class="btn btn-warning">Back</button></a>
  </div>
</div>
</body>
</html>