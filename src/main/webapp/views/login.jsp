<!DOCTYPE html>
<html lang="pt-BR" dir="ltr">
<head>
<link rel="stylesheet" type="text/css" href="assest/css/login.css">
<link href="https://fonts.googleapis.com/css?family=Tangerine" rel="Stylesheet">
<meta charset="utf-8">
<title>Tela de Login</title>
</head>
<body>
	<div class="login">
	<img src="assest/img/usuario.png" class="usuario">
		<h1>
			Prime Systems
			<h1>
				<form method="post" action="LoginController">
					<p>Usuario</p>
					<input type="text" name="uname" placeholder="Insira seu nome de usuario" value="">
					<p>Senha</p>
					<input type="password" name="password" placeholder="Insira sua senha">
					<input type="submit"  value="login"> 
					<a href="#">Esqueceu sua senha ?</a><br> 
					<a href="#">Entre aqui e se Cadastre</a><br>
				</form>
	</div>
</body>
</html>