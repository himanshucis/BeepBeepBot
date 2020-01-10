<!DOCTYPE html>
<%@page import="org.springframework.beans.factory.annotation.Value"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Bip Bot</title>
<style>
#myMap {
	height: 350px;
	width: 680px;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!-- google api key -->
<script
	src="https://maps.googleapis.com/maps/api/js?key=${mapkey}&sensor=false">
</script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js">
</script>
<script type="text/javascript">
	var map;
	var marker;
	var myLatlng = new google.maps.LatLng(22.754221317920024,75.86651623648368);
	var geocoder = new google.maps.Geocoder();
	var infowindow = new google.maps.InfoWindow();
	function initialize() {
		var mapOptions = {
			zoom : 18,
			center : myLatlng,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};

		map = new google.maps.Map(document.getElementById("myMap"), mapOptions);

		marker = new google.maps.Marker({
			map : map,
			position : myLatlng,
			draggable : true
		});

		geocoder.geocode({
			'latLng' : myLatlng
		}, function(results, status) {
			if (status == google.maps.GeocoderStatus.OK) {
				if (results[0]) {
					$('#latitude,#longitude').show();
					$('#address').val(results[0].formatted_address);
					$('#latitude').val(marker.getPosition().lat());
					$('#longitude').val(marker.getPosition().lng());
					infowindow.setContent(results[0].formatted_address);
					infowindow.open(map, marker);
				}
			}
		});

		google.maps.event.addListener(marker, 'dragend', function() {

			geocoder.geocode({
				'latLng' : marker.getPosition()
			}, function(results, status) {
				if (status == google.maps.GeocoderStatus.OK) {
					if (results[0]) {
						$('#address').val(results[0].formatted_address);
						$('#latitude').val(marker.getPosition().lat());
						$('#longitude').val(marker.getPosition().lng());
						infowindow.setContent(results[0].formatted_address);
						infowindow.open(map, marker);
					}
				}
			});
		});

	}
	google.maps.event.addDomListener(window, 'load', initialize);
</script>
</head>
<body>
	<div class="container">
    <c:if test="${not empty weathererror}">
	<h3 style="color:red;">${weathererror}</h3></c:if>
		<div style="background-color: silver; width: 400px;" class="contant">
			<h4 style="font-size: large; text-align: center;">Pick-Up
				Location on Google-Map</h4>
			<div id="myMap" style="width: 400px; height: 250px;"></div>
			<div class="formdiv" style="margin: opx;">
				<form action="/locationcontroller/location" method="post">
					<div class="form-group">
						<label for="name">Name :</label> <input style="width: 400px;"
							type="text" class="form-control" id="name" name="name"
							required="required" />
					</div>
					<div class="form-group">
						<label for="location">Location :</label> <input id="address"
							name="address" class="form-control" type="text"
							style="width: 400px;" required="required" /><br />
					</div>
					<div class="form-group">
						<label for="location">Latitude :</label> <input type="text"
							name="latitude" class="form-control" id="latitude"
							style="width: 400px;" placeholder="Latitude" /><br />
					</div>
					<div class="form-group">
						<label for="location">Longitude :</label> <input type="text"
							name="longitude" class="form-control" id="longitude"
							style="width: 400px;" placeholder="Longitude" />
					</div>
					<button style="margin-left: 170px;" type="submit"
						class="btn btn-success">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>