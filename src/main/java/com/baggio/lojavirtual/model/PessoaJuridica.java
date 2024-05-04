package com.baggio.lojavirtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn( name = "id")
public class PessoaJuridica extends Pessoa{
	
	@Column(nullable = false)
	private String cnpj;
	
	@Column(name = "inscricao_estadual")
	private String inscricaoEstadual;

	@Column(name = "inscricao_municipal")
	private String inscricaoMunicipal;

	@Column(name = "nome_fantasia")
	private String nomeFantasia;

	@Column(name = "razao_social")
	private String razaoSocial;
	
	@Column(name = "categoria")
	private String categoria;
}
