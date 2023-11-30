function memberInsert(){
	
	username = document.getElementById("username")
	password = document.getElementById("password")
	email = document.getElementById("email")
	userinfo={
		"username": username.value,
		"password": password.value,
		"email": email.value
	}
	alert(userinfo)
	
	$.ajax({
		type: "POST",
		url: "/user",
		data: JSON.stringify(userinfo)
		contentType: "application/json; charset=utf-8"
	}).done(function(response) {
		
		$('#marea').text(response);
	}).fail(function(error) {
		alert("!/js/user.js에서 에러발생: " + error.statusText);
	});
}