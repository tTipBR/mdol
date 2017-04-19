package br.com.ttip.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ttip.types.TipoPessoa;

@Entity
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idPessoa;
	
	private String nome;
	private TipoPessoa tipoPessoa;
	private long cpf;
	private long cnpj;
	private boolean fgAtivo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInclusao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtAlteracao;

	public int getIdPessoa() {
		return idPessoa;
	}
	
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
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
	
	
	@PreUpdate
	@PrePersist
	private void SetUpdate() {
		setDtAlteracao(new Date());
		
		if (getDtInclusao() == null) {
			setDtInclusao(getDtAlteracao());
		}
	}

}

