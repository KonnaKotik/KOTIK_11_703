<!doctype html>

<html lang="en">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="/css/signIn.css">


<title>Analytics App</title>
</head>
<body >
<a href="/auth"> </a>
	<nav class="navbar navbar-light" style="background: #95cdf0;">
 		<a class="navbar-brand" style="color: #ffffff">Analytics App</a>
	</nav>
	<div class="container">
		<div class="loginbox" >
  			<h1 >Авторизация</h1>
  			<form action="/auth/login" method="post">
       			<p>Логин</p>
        		<input type="email" id="inputEmail" name="email" placeholder="Email address">
       			<p>Пароль</p>
        		<input type="password" id="inputPassword" name="password" placeholder="Password">
        		<input type="submit"  value="Войти" href="/" >
        		<div class="text-center">
        		<a href="/registration" style="color: #000000">Вы еще не зарегистрированы?</a>
        		</div>
    		</form>
		</div>
	</div>

	<nav class="navbar fixed-bottom navbar-expand-sm navbar-light" style="background: #adb1ed" >
	
	</nav>
	

</body>
</html>