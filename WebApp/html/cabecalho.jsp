
<div class="ttip-div-header">
	<img src="../img/tTip-LOGO.png"></img>
	<c:if test="${login == null}">
		<form method="post" action="${pageContext.request.contextPath}/login/acessar">	
			<div style="background:#EFFBF8; height: auto; float:right; margin: 1em; min-width: 19em;">
				<label>Login
					<input type="text" name="email" maxlength="150" size="20"/>
				</label>

				<label>Senha
					<input type="password" name="senha"  size="20"></input>
				</label>
				
				<label>  
					<input style="width: 7em; margin-top:1.8em;" class="ttip-botoes" id="entrar" name="ed-entrar" type="submit" value="Entrar"/>
				</label>
				
				<!-- c:if � uma TagLib, faz parte da linguagem JSTL, utilizada para programar p�ginas JSP -->
				<c:if test="${erro != null && erro != ''}">
					<br><label style="color: #F00;">${erro}</label>
				</c:if>
			</div>
		</form>
	</c:if>
	
	<c:if test="${login != null}">
		<h1>Ol�, seja bem vindo!! </h1> ${login}	
	</c:if>
</div>

