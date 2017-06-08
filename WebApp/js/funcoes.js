/* (document.cadastro.nome.focus();) posição do cursor ("") quer dizer valor vazio
		focus(localizar) */
	function validarentrada(){
		
		if(document.cadastro.nome.value =="" || document.cadastro.nome.value == " "){
			alert("Campo NOME não pode estar vazio");
			document.cadastro.nome.focus();
			return false;
		}
		if(document.cadastro.email.value== "" || document.cadastro.email.value == " " || document.cadastro.email.value.indexOf('@')== -1 || document.cadastro.email.value.indexOf('.')== -1){
			alert("O e-Mail digitado não é válido");
			document.cadastro.email.focus();
			return false;
		}
		if(document.cadastro.senha.value=="" || document.cadastro.senha.value == " "){
			alert("Campo SENHA deve ser informado");
			document.cadastro.senha.focus();
			return false;
		}
	}
		
	function mudaCorCampo(campo, cor){
		/* entrada(onFocus)*/ 
		if(cor == 1){
			campo.style.backgroundColor="red";
			campo.style.color="#000000";
		}
		else if(cor == 2){ //saida(onBlur)
			campo.style.backgroundColor="#FFFFFF";
			campo.style.color="#000000";
		}
	}
	/* mascaras <> */
	function mascaraData(campoData){
        var data = campoData.value;
        if (data.length == 2){
            data = data + '/';
            campoData.value = data;
			return true;              
        }
        if (data.length == 5){
			data = data + '/';
			campoData.value = data;
            return true;
        }
	}
	function mascaraCPF(campoCPF){
        var numero = campoCPF.value;
        if (numero.length == 3){
            numero = numero + ".";
            campoCPF.value = numero;
			return true;              
        }
        if (numero.length == 7){
			numero = numero + ".";
			campoCPF.value = numero;
            return true;
        }
		if (numero.length == 11){
			numero = numero + "-";
			campoCPF.value = numero;
            return true;
		}
	}
	function mascaraCEP(campoCEP){
        var numero = campoCEP.value;
        if (numero.length == 5){
            numero = numero + "-";
            campoCEP.value = numero;
			return true;              
        }
	}
	/* mascaras </> */ 
	function BuscaNomeUF() {
		
		if (document.cadastro.siglaUF.value == "AC") {
			document.cadastro.nomeUF.value = "ACRE";
		}
		if (document.cadastro.siglaUF.value == "AL") {
			document.cadastro.nomeUF.value = "ALAGOAS";
		}
		if (document.cadastro.siglaUF.value == "AM") {
			document.cadastro.nomeUF.value = "AMAZONAS";
		}
		if (document.cadastro.siglaUF.value == "AP") {
			document.cadastro.nomeUF.value = "AMAPÁ";
		}
		if (document.cadastro.siglaUF.value == "BA") {
			document.cadastro.nomeUF.value = "BAHIA";
		}
		if (document.cadastro.siglaUF.value == "CE") {
			document.cadastro.nomeUF.value = "CEARÁ";
		}
		if (document.cadastro.siglaUF.value == "DF") {
			document.cadastro.nomeUF.value = "DISTRITO FEDERAL";
		}
		if (document.cadastro.siglaUF.value == "ES") {
			document.cadastro.nomeUF.value = "ESPIRITO SANTO";
		}
		if (document.cadastro.siglaUF.value == "GO") {
			document.cadastro.nomeUF.value = "GOIÁS";
		}
		if (document.cadastro.siglaUF.value == "MA") {
			document.cadastro.nomeUF.value = "MARANHÃO";
		}
		if (document.cadastro.siglaUF.value == "MT") {
			document.cadastro.nomeUF.value = "MATO GROSSO";
		}
		if (document.cadastro.siglaUF.value == "MS") {
			document.cadastro.nomeUF.value = "MATO GROSSO DO SUL";
		}
		if (document.cadastro.siglaUF.value == "MG") {
			document.cadastro.nomeUF.value = "MINAS GERAIS";
		}
		if (document.cadastro.siglaUF.value == "PA") {
			document.cadastro.nomeUF.value = "PARÁ";
		}
		if (document.cadastro.siglaUF.value == "PB") {
			document.cadastro.nomeUF.value = "PARAÍBA";
		}
		if (document.cadastro.siglaUF.value == "PR") {
			document.cadastro.nomeUF.value = "PARANÁ";
		}
		if (document.cadastro.siglaUF.value == "PE") {
			document.cadastro.nomeUF.value = "PERNABUCO";
		}
		if (document.cadastro.siglaUF.value == "PI") {
			document.cadastro.nomeUF.value = "PIAUÍ";
		}
		if (document.cadastro.siglaUF.value == "RJ") {
			document.cadastro.nomeUF.value = "RIO DE JANEIRO";
		}
		if (document.cadastro.siglaUF.value == "RN") {
			document.cadastro.nomeUF.value = "RIO GRANDE DO NORTE";
		}
		if (document.cadastro.siglaUF.value == "RO") {
			document.cadastro.nomeUF.value = "RONDÔNIA";
		}
		if (document.cadastro.siglaUF.value == "RS") {
			document.cadastro.nomeUF.value = "RIO GRANDE DO SUL";
		}
		if (document.cadastro.siglaUF.value == "RR") {
			document.cadastro.nomeUF.value = "RORAÍMA";	
		}
		if (document.cadastro.siglaUF.value == "SC") {
			document.cadastro.nomeUF.value = "SANTA CATARINA";
		}
		if (document.cadastro.siglaUF.value == "SE") {
			document.cadastro.nomeUF.value = "SERGIPE";
		}
		if (document.cadastro.siglaUF.value == "SP") {
			document.cadastro.nomeUF.value = "SÃO PAULO";
		}
		if (document.cadastro.siglaUF.value == "TO") {
			document.cadastro.nomeUF.value = "TOCANTINS";
		}
		if(document.cadastro.siglaUF.value=="UF"){
			document.cadastro.nomeUF.value="";
		}
	}
	/*ajax <> */
	function cadastrarProfessor(){
		var xhttp = new XMLHttpRequest();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					document.getElementById("divCadastro").innerHTML = this.responseText;
				}
			};
		xhttp.open("GET", "http://localhost:8080/mdol/html/cad-professor.jsp", true);
		xhttp.send();
		
	}
	
	function cadastrarEscola(){
		var xhttp = new XMLHttpRequest();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					document.getElementById("divCadastro").innerHTML = this.responseText;
				}
			};
		xhttp.open("GET", "http://localhost:8080/mdol/html/cad-escola.jsp", true);
		xhttp.send();
		
	}
	/* ajax </> */
	
	function buscaCep(cep){
		var xhttp = new XMLHttpRequest();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					alert(this.responseText);
				}
			};
		xhttp.open("GET", "http://kleber-ntbk:8080/br.com.ttip.mdol/endereco/consultar?cep=" + cep.value, true);
		xhttp.send();
	}