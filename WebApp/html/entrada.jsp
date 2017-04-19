<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>BEM-VINDOS AO MEU DIÁRIO ON-LINE</title> 
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css"/>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/funcoes.js"></script>

	</head>
	
	<body>
		<%@include file="cabecalho.jsp" %>
		<div class="ttip-div-body">
		
			<div class="ttip-div-carrossel">
			
				<p>carrossel</p><br>
				<p>carrossel</p><br>
				<p>carrossel</p><br>
			</div>
		
			<form class="ttip-form-pag-entrada" name="cadastro" onsubmit="return validarentrada()" method="post" action="http://kleber-ntbk:8080/br.com.ttip.mdol/login/cadastrar">
				
				<h2>Crie sua conta e comece a usar em 1 minuto!!!</h2>
				<table>
					<tr>
						<td>Escola:</td>
						<td align="left">
							<input type="text" name="nome" maxlength="150"/>
						</td>
					</tr>
					
					<tr>
						<td>E-mail:</td>
						<td align="left">
							<input type="text" name="email" maxlength="150"/>
						</td>
					</tr>
				
					<tr>
						<td>Senha:</td>
						<td align="left">
							<input type="password" name="senha" maxlength="20"/>
						</td>
					</tr>
					CAPTCHA
					<tr>
						<td align="left">
							<input name="Cadastro" type="submit" value="Cadastrar" class="ttip-botoes"/>
						</td>
						
						<!--<td>
							<c:if test="${erro != null}">
								${erro}
							</c:if>								
						</td>-->
					</tr>
				</table>	
			</form>
		</div>
		<%@include file="rodape.jsp" %>
	</body>
	
</html>