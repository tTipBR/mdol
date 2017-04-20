
<div class="ttip-div-header">
	<img src="../img/tTip-LOGO.png"></img>
	<form method="post" action="http://kleber-ntbk:8080/br.com.ttip.mdol/login/acessar">	
		
		<div style=" background:#EFFBF8; height: auto; float:right; margin: 1em; min-width: 19em;">
		
			<label>Login 
				<input type="text" name="email" maxlength="150" size="20"/>
			</label>

			<label>Senha
				<input type="password" name="senha"  size="20"></input>
			</label>
			
			<label>  
				<input style="width: 7em; margin-top:1.8em;" class="ttip-botoes" id="entrar" name="ed-entrar" type="submit" value="Entrar"/>
			</label>
			
			<!-- c:if é uma TagLib, faz parte da linguagem JSTL, utilizada para programar páginas JSP -->
			<c:if test="${msgErro != null && msgErro != ''}">
				<br><label style="color: #F00;">${msgErro}</label>
			</c:if>				
			
		</div>
				
		<!--<c:if test="${login != null}">
			<tr>
				<td class="cadastro">Nome: </td>
				<td align="left">${login.nome}</td>
			</tr>
			
			<tr>
				<td class="cadastro">Email: </td>
				<td align="left">${login.email}</td>
			</tr>
			
			<tr>
				<td align="left">
					<input id="sair" name="sair" type="submit" value="Sair" class="botoes"/>
				</td>
			</tr>
			
			<div style="height:100%; width:40%; margin0; float:right; background:#FFFF00">
		<c:if test="${login == null}">
			<div class="div-logincabecalho">Login <input type="text" name="login" maxlength="30" class="cadastrocampo"/>
			</div>
				
			<div class="div-logincabecalho">Senha <input type="password" name="senha" maxlength="30" class="cadastrocampo"></input>
			</div>
			
			<div style="float:right; margin:0;">
				<input id="entrar" name="entrar" type="submit" value="Entrar" class="ttip-botoes"/>
			</div>

		</c:if>
			
			
		</c:if>-->
	</form>
</div>

