 <!doctype html>

<html lang="en">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="/css/grid.css">
	<link rel="stylesheet" type="text/css" href="/css/signIn.css">

	<title>Analytics App</title>
</head>
<body >
	<nav class="navbar navbar-light" style="background: #95cdf0;">
 		<a class="navbar-brand" style="color: #ffffff">Analytics App</a>
 		<form class="form-inline">
 			<div class="row">
 				<div class="col-3">
 					<div class="navbar-brand">
 						<a  style="color: #ffffff">Admin</a>
 					</div>
 				</div>
 				<div class="col-4">
            <div class="nav-item">
                <a  href='#' class="btn btn-outline-light" >Назад</a>
              </div>
        </div>
 				<div class="col-3">
     				<div class="nav-item">
        				<a  href='#' class="btn btn-outline-light" >Выйти</a>
      				</div>
      			</div>
      		</div>
    	</form>
	</nav>

	<div class="container">
		<div class="row" style="
  padding: 10px; margin-right: 0px ">
			<div class="col-2 text-left" style="
  padding: 15px;">
				<h4>Опрос</h4>
			</div>
			<input class="col-10 themed-grid-col" type="nameServey" name="nameServey" placeholder="Введите название опроса">
		</div>
		<div>
		<div class="row" style="
  padding: 10px;">
  			<div class="col-4 text-left">
  				<h5>Вопрос#1</h5>
  			</div>
  			<div class="col-4 text-center">
  				<a type = "typeData" href="#">Строка</a>
			</div>
			<div class="col-4 text-right">
				<a type = "delete" href="#">Удалить</a>
			</div>
		</div>
		<div class="row" style="margin-left: 7px; margin-right: 5px ">
			<input class="col-12 themed-grid-col" type="nameServey" name="nameServey" placeholder="Введите вопрос">
		</div>
	</div>
		<div class="row" style="
  padding: 10px;"> 
			<div class="col-6 text-left">
				<button href='#' class="btn btn-outline-info" style="color: #000000; border-color:#95cdf0 "> Добавить вопрос</button> 
			</div>
			<div class="col-6 text-right">
				<button href='#' class="btn btn-outline-success" style="color: #000000"> Сохранить</button> 
			</div>
		</div>
	</div>

	<nav class="navbar fixed-bottom navbar-expand-sm navbar-light" style="background: #adb1ed">
	</nav>


</body>
</html>