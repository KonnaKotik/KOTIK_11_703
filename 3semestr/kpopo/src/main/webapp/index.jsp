<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="background.css">
    <link rel="stylesheet" type="css" href="centre.css">
    

    <title>K-pop Shop</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" style="background: #f0bcaf;">
      <a href="/Home" class="navbar-brand ">
        <img src="http://www.kpopshop.ru/images/logos/10/energot_ql20-mg.png" width="120" height="40" alt="logo">
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
     </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <div class="container">
        <ul class="navbar-nav mr-auto ">
          <div class="dropdown">
          <button class="btn btn-link dropdown-toggle" type="button" data-toggle="dropdown" style=" color: #f0bcaf"> 
            <span class="navbar-toggler-icon"></span>
          </button>
          <ul class="dropdown-menu text-center">
             <h6 class="dropdown-header">Boys band</h6>
      <li><a href="#" class="display-6" style="color: #a9abde">BTS</a></li>
      <li><a href="#" class="display-6" style="color: #a9abde">Exo</a></li>
      <li><a href="#" class="display-6" style="color: #a9abde">Seventeen</a></li>
    </ul>
  </div>
          <li class="nav-item">
            <a  href='/album' class="nav-link" >Album</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">Stuff</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">Dorama</a>
          </li>
            <li class="nav-item">
                <a href='/popular' class="nav-link">Popular</a>
            </li>
            <li class="nav-item">
                <a href='/basket' class="nav-link">Basket</a>
            </li>

            </ul>
        </div>
        <form class="form-inline my-2 my-lg-0">
          <div class="nav-item">
              <a  href='/signUp' class="btn btn-outline-light my-2 my-sm-0" >SignUp</a>
          </div>
          <div class="nav-item">
              <a  href='/signIn' class="btn btn-outline-light my-2 my-sm-0" >SignIn</a>
          </div>
        </form>
      </div>
    </nav>

  <div class="bg">
    <div class="container-fluid">
      <div class="container">
       <br><br><br><br><br><br>
       <h1 class="text-center display-3" style="color:#ffffff">New in!</h1>
       <br>
       <div class="row">
         <div class="col-sm-2"></div>
         <div class="col-sm-2"></div>
         <div class="col-sm-2">
            <a href="/album" class="btn btn-lg btn-outline-light block-button text-center" style="  display: block;" >View Album</a> </div>
          <div class="col-sm-2">
            <a href="#" class="btn btn-lg btn-outline-light block-button" style="  display: block;" >View Merch</a> </div>
        </div>
      </div>
    </div>
  </div>

  <aside style="height:300px; background-color:#f0b8af;">
    <br>
        <h1 class="text-center display-2" style="color: #a85d6c;">See more</h1>
       <p class="lead text-center display-4" style="color: #ffffff">"Listen more. Buy more. Live more"</p>
      </aside>

      <div class="container-fluid">
      <div class="row text-center">
          <div class="col-md-6">
            <br><br><br><br>
           <h4 class="display-4" style="color: #c78585;">BTS — Answer: Love Myself</h4>
           <p class="display-4" style="color: #ab6373;">"Honestly, let's admit what we have to admit </p>
           <p class="display-4" style="color: #ab6373;">The standards you put out are harsher on yourself"</p>
          </div>

        <div class="col-fluid-md-6">
          <a href="#"> <img src="https://i.imgur.com/z2cjbNU.png" width="950"></a>
        </div>
      </div>
    </div>

    <div class="container-fluid">
      <div class="row text-center">
        <div class="col-fluid-md-6">
          <a> <img src="https://i.ytimg.com/vi/JNla-pfXGlY/maxresdefault.jpg" width="950"></a>
        </div>
        <div class="col-md-6">
            <br><br><br><br>
           <h4 class="display-4" style="color: #ed87ba;">Seventeen: 5th mini album "You make my day"</h4>
           <br>
           <a href="#" class="btn btn-lg btn-outline-danger text-center" style= " color: #ab6373" >Buy now!</a>
        </div>
      </div>
    </div>

     <aside style="height:800px; background-color:#f0b8af;">
      <br><br><br><br>
      <div class="container">
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li class="active" data-target="#carouselExampleIndicators" data-slide-to="0"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <a href="#">
            <img src="http://www.kpopshop.ru/images/promo/14/1_BTS_Album_Vol._3_-_banner.jpg" alt="" class="d-block w-100"> </a>
          </div>
          <div class="carousel-item">
            <a href="#">
            <img src="http://www.kpopshop.ru/images/promo/14/2_banner.jpg" alt="" class="d-block w-100"> </a>
          </div>
          <div class="carousel-item">
            <a href="#">
            <img src="http://www.kpopshop.ru/images/promo/15/7__JENNIE-[SOLO]-PHOTOBOOK__890x498__2.jpg" alt="" class="d-block w-100"> </a>
        </div>
          <div class="carousel-item">
            <a href="#">
            <img src="http://www.kpopshop.ru/images/promo/14/4_banner.jpg" alt="" class="d-block w-100"> </a>
          </div>
        </div>
        <a href="#carouselExampleIndicators" class="carousel-control-prev" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a href="#carouselExampleIndicators" class="carousel-control-next" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
      </div>
    </div>
  </aside>
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>