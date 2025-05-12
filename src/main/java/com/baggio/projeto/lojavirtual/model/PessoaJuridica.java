package com.baggio.projeto.lojavirtual.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PESSOA_JURIDICA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;    
    private String categoria;
    
    @Column(name = "insc_estadual")
    private String inscEstadual; 

    @Column(name = "insc_municipal")
    private String inscMunicipal;    
    
    @Column(name = "nome_fantasia")
    private String nomeFantasia; 

    @Column(name = "razao_social")
    private String razaoSocial;    
    
}
