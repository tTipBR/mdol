<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>BEM-VINDOS AO MEU DIÁRIO ON-LINE</title> 
		
		<link rel="stylesheet" type="text/css" href="../css/estilos.css"/>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="../js/funcoes.js"></script>
		

	</head>
	
	<body>
		<%@include file="cabecalho.jsp" %>
		<div class="ttip-div-body">
		
			<div class=" ttip-div-menu-lateral">
				<ul>
					<li><a href="#" onclick="cadastrarEscola()">Configuração</a></li>
					<li><a href="#" onclick="cadastrarProfessor()">Professor</a></li>
					<li><a href="#">Alunos</a></li>
					<li><a href="#">Turmas</a></li>
					<li><a href="#">Coordenador</a></li>
				</ul>
			</div>
			
			<div id="divCadastro" >
			</div>
		</div>
		<%@include file="rodape.jsp" %>

	</body>
	
</html>