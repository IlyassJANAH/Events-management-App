<%-- 
    Document   : login
    Created on : 30 nov. 2018, 13:10:46
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Se connecter</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/fonts_login/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/fonts_login/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/css_login/util.css">
	<link rel="stylesheet" type="text/css" href="css/css_login/main.css">
<!--===============================================================================================-->
  <link rel="stylesheet" href="Client/assets/css/styles.css">

</head>
<body>
	
	
	<div class="container-login100" style="background-image: url('images/test.jpg');">
        ${Erreur}
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
                    <form class="login100-form validate-form" action="Login" method="post">
				<span class="login100-form-title p-b-37">
					Se connecter
				</span>

				<div class="wrap-input100 validate-input m-b-20" data-validate="Enter username or email">
					<input class="input100" type="text" name="login" placeholder="login">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-25" data-validate = "Enter password">
					<input class="input100" type="password" name="password" placeholder="mot de passe">
					<span class="focus-input100"></span>
				</div>

				<div class="container-login100-form-btn">
					<button class="login100-form-btn">
						Se connecter
					</button>
				</div>
                        Vous n'avez pas encore de compte ? <a href="inscription.html"> s'inscrire</a>
				
			</form>

			
		</div>
	</div>
	
	

	<div id="dropDownSelect1"></div>
	

<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->

<!--===============================================================================================-->
	<script src="js/js_login/main.js"></script>

</body>
</html>