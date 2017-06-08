<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>BEM-VINDOS AO MEU DIÁRIO ON-LINE</title> 
		
		
		<link rel="stylesheet" type="text/css" href="../css/estilos.css"/>
		<link rel="stylesheet" type="text/css" href="../css/estilosbody.css"/>
		<link rel="stylesheet" type="text/css" href="../css/estilosheader.css"/>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="../js/funcoes.js"></script>
		

	</head>
	
	<body>
		<div class="ttip-div-body">
				
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Nome do aluno</label><br>
				<input type="text" name="nome" maxlength="50" size="30"/>
			</div>

			<div class="ttip-div-esquerda">
				<label class="ttip-label">CPF</label><br>
				<input type="nunber" name="cpf" maxlength="17" size="15"/>
			</div>

			<div class="ttip-div-esquerda">
				<label class="ttip-label">RG</label><br>
				<input type="nunber" name="rg" maxlength="17" size="15"/><br>
			</div>

			<div class="ttip-div-esquerda">
				<label class="ttip-label">Orgão emissor</label><br>
				<input type="nunber" name="orgaoemissor" maxlength="10" size="6"/>
			</div>				
			<div class="ttip-div-esquerda" >
				<label class="ttip-label">Gênero</label><br>
				
				<input type="radio" name="genero" />
				<label class="ttip-label" style="font-size: 0.8em">Masculino</label>
				
				<input type="radio" name="genero" />
				<label class="ttip-label" style="font-size: 0.8em">Feminino</label>
			</div>
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Data de Nascimento</label><br>
				<input type="nunber" name="datanascimento" maxlength="17" size="15"/>
			</div>
			<div class="ttip-div-esquerda">
				<label class="ttip-label">CEP</label><br>
				<input type="nunber" name="cep" maxlength="17" size="15" onblur="buscaCep(this)"/>
			</div>
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Endereço</label><br>
				<input type="nunber" name="endereco" maxlength="50" size="30"/>
			</div>
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Número</label><br>
				<input type="nunber" name="numero" maxlength="6" size="8"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Estado</label><br>
				<input type="nunber" name="estado" maxlength="50" size="15"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Cidade</label><br>
				<input type="nunber" name="cidade" maxlength="50" size="15"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Bairro</label><br>
				<input type="nunber" name="bairro" maxlength="50" size="20"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Complemento</label><br>
				<input type="nunber" name="complento" maxlength="50" size="20"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Telefone 1</label><br>
				<input type="nunber" name="telefone1" maxlength="13" size="15"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Telefone 2</label><br>
				<input type="nunber" name="telefone2" maxlength="13" size="15"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">Telefone 3</label><br>
				<input type="nunber" name="telefone3" maxlength="13" size="15"/>
			</div>
			
			<div class="ttip-div-esquerda">
				<label class="ttip-label">E-mail</label><br>
				<input type="nunber" name="email" maxlength="40" size="20"/>
			</div>
		</div>
	</body>
</html>