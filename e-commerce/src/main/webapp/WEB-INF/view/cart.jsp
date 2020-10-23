<%--
  Created by IntelliJ IDEA.
  User: Lenovo T50s
  Date: 23.10.2020
  Time: 00:08
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


<!-----------------------cart items details --------------->
<div class="small-container cart-page">
    <table>
        <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Subtotal</th>
        </tr>
        <tr>
            <td>
                <div class="cart-info">
                    <img src="#">
                    <div>
                        <p>Red Printed Tshirt</p>
                        <small>Price: $50.00</small>
                        <br>
                        <a href="#">Remove</a>
                    </div>
                </div>
            </td>

            <td><input type="number" value = "1"></td>
            <td>$50.00</td>
        </tr>
        <tr>
            <td>
                <div class="cart-info">
                    <img src="#">
                    <div>
                        <p>Red Printed Tshirt</p>
                        <small>Price: $50.00</small>
                        <br>
                        <a href="#">Remove</a>
                    </div>
                </div>
            </td>

            <td><input type="number" value = "1"></td>
            <td>$50.00</td>
        </tr>
        <tr>
            <td>
                <div class="cart-info">
                    <img src="#">
                    <div>
                        <p>Red Printed Tshirt</p>
                        <small>Price: $60.00</small>
                        <br>
                        <a href="#">Remove</a>
                    </div>
                </div>
            </td>

            <td><input type="number" value = "1"></td>
            <td>$70.00</td>
        </tr>
    </table>
    <div class="total-price">
        <table>
            <tr>
                <td>Subtotal</td>
                <td>$200</td>
            </tr>
            <tr>
                <td>Tax</td>
                <td>$35.00</td>
            </tr>
            <tr>
                <td>Total</td>
                <td>$200</td>
            </tr>
        </table>
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
