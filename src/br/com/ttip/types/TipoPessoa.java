package br.com.ttip.types;

public enum TipoPessoa {
	
	FISICA('F'),
	JURIDICA('J');
	
	private char value;
	
	TipoPessoa(char value) {
		this.value = value;
	}
	
	public char value() {
		return this.value;
	}
	
}
