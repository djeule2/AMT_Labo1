
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>Detail Products </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"  type="text/css">
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
            rel="stylesheet"
    />


</head>
<body>
<jsp:include page="../../head.jsp"></jsp:include>
<!-----------------------single product details--------------->

<div class="small-container single-product">
    <div class="row">
        <div class="col-2">

            <img src="img/${produit.photos}" with = "100%" id = "product-img">
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

            <p>${produit.nomProduit}</p>
            <h1>Red Printd T-shoes by HRX</h1>
            <h4>${produit.prix}</h4>

            <select>
                <option>Select Size</option>
                <option>38</option>
                <option>40</option>
                <option>42</option>
                <option>44</option>
                <option>46</option>
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
<jsp:include page="../../foot.jsp"></jsp:include>
</body>
</html>