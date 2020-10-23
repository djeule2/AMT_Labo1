<%--
  Created by IntelliJ IDEA.
  User: Lenovo T50s
  Date: 22.10.2020
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html  lang="en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>All Products </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="normalize.css" />
    <link rel="stylesheet" href="style.css" />
    <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
            rel="stylesheet"
    />

</head>
<body>
<div class="header">

    <div class="container">
        <div class="navbar">
            <div class="logo">
                <img src ="#" width="125px">
            </div>
            <nav>
                <ul id= "MenuItems">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">produit</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">Account</a></li>

                </ul>
            </nav>
            <img src="#," width="30px" height="30">
            <img src="#," class="menu-icon" onclick="menutoggle()">

        </div>
    </div>
</div>

<!-----------------------single product details--------------->

<div class="small-container single-product">
    <div class="row">
        <div class="col-2">
            <img src="#" with = "100%" id = "product-img">
            <div class="small-img-row">
                <div class= "small-img-col">
                    <img src= "#" width="100%" class="small-img">
                </div>
                <div class= "small-img-col" >
                    <img src= "#" width="100%" class="small-img">
                </div>
                <div class= "small-img-col">
                    <img src= "#" width="100%" class="small-img">
                </div>
                <div class= "small-img-col">
                    <img src= "#" width="100%" class="small-img">
                </div>
            </div>
        </div>
        <div class="col-2">
            <p>Home/T-Shirt</p>
            <h1>Red Printd T-shirt by HRX</h1>
            <h4>$50.00</h4>
            <select>
                <option>Select Size</option>
                <option>XXL</option>
                <option>XL</option>
                <option>Large</option>
                <option>Medium</option>
                <option>Small</option>
            </select>
            <input type="number" value="1">
            <a href="#" class="btn">Add To Cart</a>
            <h3>Product Details <i class ="fa fa-ident">
            </i></h3>
            <p>Give your summer wardrobe a style upgrate with the HRX
                Men' Active T-shirt. Team it with a pair of shorts for your
                morning workout or a denims for an evening out with the guys.
            </p>
        </div>


    </div>

</div>

</div>

<!------------------title--------------------->
<div class="small-container">
    <div class="row row-2">
        <h2> related Products</h2>
        <p>View More</p>
    </div>

</div>

<!----------------products------------------->

<div class="small-container">
    <div class="row">

        <div class="col-4">
            <img src="#">
            <h4>Red Printed T-Shirt</h4>
            <div class="rating">
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star-half-o"></i>

            </div>

            <p>$50.00</p>

        </div>

    </div>

</div>


<!---------------------------------footer---------------------->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="foot-col-1">
                <h3>Dowload Our App</h3>
                <p> Dowload App for Android and ios mobile phone.</p>
                <div class="app-logo">
                    <img src="#">
                    <img src="#">
                </div>
            </div>
            <div class="foot-col-2">
                <img class="#">
                <p>our purpose is to sustainably Make the Pleasure And
                    Benfits of sports accessible to the Many.
                </p>
            </div>
            <div class="foot-col-3">
                <h3>Useful Links</h3>
                <ul>
                    <li>Coupons</li>
                    <li>Blog Post</li>
                    <li>Return Policy</li>
                    <li>join Affiliate</li>
                </ul>
            </div>
            <div class="foot-col-4">
                <h3>Follow us</h3>
                <ul>
                    <li>Facebook</li>
                    <li>Twitter</li>
                    <li>Instagram</li>
                    <li>YouTude</li>
                </ul>
            </div>
        </div>
        <hr>
        <p class="copyright">copyright 2020 - Easy Tutorials</p>
    </div>
</div>
</body>
</html>