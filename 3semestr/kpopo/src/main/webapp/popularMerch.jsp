<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="background.css">
    <link rel="stylesheet" type="css" href="centre.css">

    <style type="text/css">

        .jumbotron {
            margin-top: 50px;
            background-image: url("https://pp.userapi.com/c850024/v850024630/ebef8/8CRqnUa1FjU.jpg");
            background-size: cover;
            color: #ffffff;

        }
    </style>

    <script>
        function sendMerchId(id) {
            $.ajax({
                type: 'post',
                url: '/album',
                data: {
                    merchId: id
                }
            }).done(function (data) {
                console.log(data);
                let contentTableHTML = "<tr>" +
                    "<th>Номер</th>" +
                    "</tr>";
                /* for (let i = 0; i < data.length; i++) {
                     contentTableHTML += "<tr>";
                     contentTableHTML += "<td>" + data[i] + "</td>";
                     contentTableHTML += "</tr>";
                 }*/
                contentTableHTML += "</table>";
                let contentTableDiv = document.getElementById("table");
                contentTableDiv.innerHTML = contentTableHTML;

            }).fail(function () {
                alert("Н в этой жизни")
            });

        }
    </script>


    <title>K-pop Shop</title>

</head>
<body style="background: #fffcfc">
<nav class="navbar navbar-expand-lg navbar-light fixed-top" style="background: #f0bcaf;">
    <a href="/Home" class="navbar-brand ">
        <img src="http://www.kpopshop.ru/images/logos/10/energot_ql20-mg.png" width="120" height="40" alt="logo">
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <div class="container">
            <ul class="navbar-nav mr-auto ">
                <div class="dropdown">
                    <button class="btn btn-link dropdown-toggle" type="button" data-toggle="dropdown"
                            style=" color: #f0bcaf">
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
                    <a href='/album' class="nav-link">Album</a>
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
                <a href='/signUp' class="btn btn-outline-light my-2 my-sm-0">SignUp</a>
            </div>
            <div class="nav-item">
                <a href='/signIn' class="btn btn-outline-light my-2 my-sm-0">SignIn</a>
            </div>
        </form>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">
        <br><br><br><br><br><br><br><br><br><br>
    </div>
    <div id="cont"></div>

<%--<div class="row">
        <div class="col-8">
            <hr>
            <br><br>
            <div class="row">
                <div class="col-3">
                    <a><img src="http://www.kpopshop.ru/images/detailed/4/7f9229d441f8c4b37250a7823b27a3a41c93bc92_hq.jpg" height="170px"></a>
                </div>
                <div class="col-3">
                    <h3>300 рублей </h3>
                    <p> <h5> N.O. </h5> </p>
                </div>
            </div>
            <br>
            <hr>
        </div>
        <div class="col-4">
        </div>
    </div>--%>
</div>
<script>
    var merch = JSON.parse('${merches}');
    var cont='';
    for (var k = 0; k < merch.length; k++) {
        cont += '<div class="row"> <div class="col-8"> <br><br> <div class="row"> <div class="col-3"> <a><img src="' + merch[k].img + '" height="170px"></a> </div> <div class="col-3"> <h3>' + merch[k].price + ' rub </h3> <p> <h5> ' + merch[k].name + ' </h5> </p></div> </div> <br> <hr> </div> <div class="col-4"> </div> </div>';
    }
    var el=document.getElementById('cont');
    el.innerHTML=cont;
    //console.log('${merches}')
</script>


<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>
</html>