<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="background.css">

    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>

    <title>Bucket</title>
</head>
 <%--  /* function addMerch(id) {
        $.ajax({
            type: 'post',
            url: '/merch.json',
            data: {
                merchId: id
            }
        }).done(function (data) {
            let contentTableHTML = "<table>";
            contentTableHTML += "<tr>" +
                "<th>Корзина</th>" +
                "</tr>";
            for (let i = 0; i < data.length; i++) {
                contentTableHTML += "<tr>";
                contentTableHTML += "<td>" + data[i].nameMerch + "</td>" + "<td>" + data[i].countMerch + "</td>";
                contentTableHTML += "</tr>";
            }
            contentTableHTML += "</table>";
            let contentTableDiv = document.getElementById("basket");
            contentTableDiv.innerHTML = contentTableHTML;

        }).fail(function () {
            alert("Не в этой жизни")
        });
    }
    function getMerch() {
        $.ajax({
            type: 'get',
            url: '/merch.json',
            data: {

            }
        }).done(function (data) {
            let contentTableHTML = "<table>";
            contentTableHTML += "<tr>" +
                "<th>Товар</th>" +
                "</tr>";
            for (let i = 0; i < data.length; i++) {
                contentTableHTML += "<tr>";
                contentTableHTML += "<td>" + data[i].nameMerch  + "</td>";
                contentTableHTML += "</tr>";
            }
            contentTableHTML += "</table>";
            let contentTableDiv = document.getElementById("table");
            contentTableDiv.innerHTML = contentTableHTML;
        }).fail(function () {
            alert("Не в этой жизни")
        });
    }*/

/*    $.ajax({
        type: 'get',
        url: '/merch.json',
        data: {
        }
    }).done(function (data) {
        let contentTableHTML = "<table>";
        contentTableHTML += "<tr>" +
            "<th>Корзина</th>" +
            "</tr>";
        for (let i = 0; i < data.length; i++) {
            contentTableHTML += "<tr>";
            contentTableHTML += "<td>" + data[i].nameMerch + "</td>" + "<td>" + data[i].countMerch + "</td>";
            contentTableHTML += "</tr>";
        }
        contentTableHTML += "</table>";
        let contentTableDiv = document.getElementById("basket");
        contentTableDiv.innerHTML = contentTableHTML;

    }).fail(function () {
        alert("Не в этой жизни")
    });*/--%>

<body style="background: #ffffff">
<div>
    <nav class="navbar navbar-expand-md navbar-light sticky-top" style="background: #f0bcaf;">
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
                <div class="btn-group mr-2" role="group" aria-label="First group">
                    <div class="nav-item">
                        <a  href='/signUp' class="btn btn-outline-light my-2 my-sm-0" >SignUp</a>
                    </div>
                    <div class="nav-item">
                        <a  href='/signIn' class="btn btn-outline-light my-2 my-sm-0" >SignIn</a>
                    </div>
                </div>
            </form>
        </div>
    </nav>
</div>
<div class="container">
    <br><br>
    <div class="row">
        <div class="col-8">
            <div id="cont"></div>
           <%-- <div class="row">
                <div class="col-3">
                    <a><img src="http://www.kpopshop.ru/images/detailed/4/7f9229d441f8c4b37250a7823b27a3a41c93bc92_hq.jpg" height="150px"></a>
                </div>
                <div class="col-3">
                    <h3>300 рублей </h3>
                    <p> <h5> N.O. </h5> </p>
                </div>
                <div class="col-1"></div>
                <div class="col-1">
                    <a href="#" style="position: fixed; right:41%;"><img src="https://static.fjcdn.com/pictures/Which+close+button+should+i+use+i+have+this+two_e08deb_5442440.png" height="25px"></a>
                </div>
            </div>
            <hr>--%>

        </div>
        <div class="col-4">
            <a> <img src="https://pp.userapi.com/c845420/v845420081/1548d8/EHBCj5yVYIg.jpg"></a>
        </div>
    </div>

<script>
    var merch = JSON.parse('${merches}');
    var cont='';
    for (var k = 0; k < merch.length; k++) {
        cont += '<div class="row"> <div class="col-3"> <a><img src="' + merch[k].img + '" height="150px"></a> </div> <div class="col-3"> <h3>' + merch[k].price + ' rub </h3> <p> <h5> ' + merch[k].nameMerch + ' </h5> </p> <p> <h5>count: ' + merch[k].countMerch + ' </h5> </p> </div> <div class="col-1"></div> <div class="col-1"> <a href="#" style="position: fixed; right:41%;"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaUu8WnXD9MC3SKnv_6Pd0CQnLvktIL_ooj7r3RnsO-7P05W6z" height="25px"></a> </div> </div> <hr>';
    }
    var el=document.getElementById('cont');
    el.innerHTML=cont;
    //console.log('${merches}');
</script>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<%--<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>--%>
</body>
</html>