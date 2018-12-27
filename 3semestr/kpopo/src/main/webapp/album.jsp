<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="album.css">
    <style type="text/css">

        .jumbotron {
            margin-top: 20px;
            background-image: url("https://pm1.narvii.com/6571/ea4bbf074f69d43b0f2cb9779eb1369c6ae55da2_hq.jpg");
            background-size: cover;
            color: #ffffff;

        }
    </style>
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>

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
<body style="background: #faf9f0">
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
    <div class="jumbotron">
        <br><br><br><br><br><br><br><br><br><br>
    </div>
    <br><br>
    <div class="row">
        <div class="col-md-4">
            <div class="holder">
            <img src="http://www.kpopshop.ru/images/detailed/14/valoaBTS_Vol._3__Repackage__-_Love_Yourself___'Answer'aa2.jpg" class="img-rounded m-x-auto d-block" width="200">
            <div class="block">
                <h3>BTS Album Vol. 3 - Love Yourself 結 'ANSWER' </h3>
                <p>язык : корейский
                    издание :  BigHit Entertainment

                </p>

            </div>
            <input type="image" name="" onclick="sendMerchId(1)" src="https://cdn0.iconfinder.com/data/icons/shopping-extras-set-1/512/1-512.png" width="50px">
        </div>
        </div>
        <div class="col-md-4">
            <div class="holder">
            <img src="http://www.kpopshop.ru/images/thumbnails/213/213/detailed/13/FireShot_Capture_3761_-_%EB%B0%A9%ED%83%84%EC%86%8C%EB%85%84%EB%8B%A8__BTS__-_[LOVE_YOURSELF_%E8%BD%89_'Tear'__-_http___smartstore.naver.com_staro.jpg" class="img-rounded m-x-auto d-block" width="200">
             <div class="block">
                 <h3>BTS Album Vol. 3 - Love Yourself 轉 'Tear' </h3>
                 <p>язык : корейский
                     издание :  BigHit Entertainment

                   </p>

             </div>

            <input type="image"  name="" onclick="sendMerchId(2)" src="https://cdn0.iconfinder.com/data/icons/shopping-extras-set-1/512/1-512.png" width="50px">
            </div>
        </div>
        <div class="col-md-4">
            <div class="holder">
            <img src="http://www.kpopshop.ru/images/detailed/4/7f9229d441f8c4b37250a7823b27a3a41c93bc92_hq.jpg" class="img-rounded m-x-auto d-block" width="200">
            <div class="block">
                <h3>BTS 3RD MINI ALBUM — IN THE MOOD FOR LOVE</h3>
                <p>язык : корейский
                    издание :  Loen Entertainment

                </p>

            </div>
            <input type="image"   name="" onclick="sendMerchId(3)" src="https://cdn0.iconfinder.com/data/icons/shopping-extras-set-1/512/1-512.png" width="50px">
        </div>
        </div>
    </div>
    <div id="table">
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>--%>
<%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>--%>

</body>
</html>