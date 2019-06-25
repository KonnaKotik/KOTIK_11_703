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
    <div class="text-center" style="padding-top: 5px">
      <h2>Опрос "Любимые бренды"</h2>
      </div>
      <div class="row" style="padding-top: 10px" >
        <div class="col-4 text-left">
          <button href='#' class="btn btn-outline-info" style="color: #000000; border-color:#95cdf0;width: 200px "> Статитстика</button> 
        </div>
         <div class="col-4 text-center">
          <button href='#' class="btn btn-outline-success" style="color: #000000;width: 200px "> Статитстика</button> 
        </div>
        <div class="col-4 text-right">
          <button type="button" data-toggle="modal" data-target="#myModal" class="btn btn-outline-danger" style="color: #000000;width: 200px "> Удалить</button> 
        </div>
      </div>
      <div style="font-size: 20px; padding-top: 50px">
        <h3>Вопросы:</h3>
        <p>1)Введите любимый бренд смартфона.</p>
        <p>2)Введите любимый бренд одежды.</p>
      </div>
    </div>

<nav class="navbar fixed-bottom navbar-expand-sm navbar-light" style="background: #adb1ed">
  </nav>

  <div id="myModal" class="modal fade">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-body">
          <div class="text-center">
            <p>Вы уверены, что хотите</p>
            <p>удалить опрос</p>
            <p>"Любимые бренды"?</p>
          </div>
        </div>
        <div class="modal-footer">
          <div class="text-left">
          <button href='#' class="btn btn-outline-danger" style="color: #000000; "> Удалить</button> 
        </div>
        <div class="text-left">
          <button href='#' class="btn btn-outline-info" style="color: #000000;border-color:#95cdf0"> Отмена</button> 
        </div>
        </div>
      </div>
    </div>
  </div>

  <script>
  $(document).ready(function() {
    $("#myModal").modal('show');
  });
</script>


</body>
</html>