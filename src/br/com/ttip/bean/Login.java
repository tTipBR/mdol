package br.com.ttip.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	int idLogin;
	String nome;
	String eMail;
	String senha;
	boolean fgAtivo;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date dtInclusao;

	@Temporal(TemporalType.TIMESTAMP)
	Date dtAlteracao;
	
	@OneToOne
	@MapsId
	Pessoa pessoa;
	
	public int getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isFgAtivo() {
		return fgAtivo;
	}
	public void setFgAtivo(boolean fgAtivo) {
		this.fgAtivo = fgAtivo;
	}
	public Date getDtInclusao() {
		return dtInclusao;
	}
	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}
	public Date getDtAlteracao() {
		return dtAlteracao;
	}
	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@PreUpdate
	@PrePersist
	private void SetUpdate() {
		setDtAlteracao(new Date());
		
		if (getDtInclusao() == null) {
			setDtInclusao(getDtAlteracao());
		}
	}

}
