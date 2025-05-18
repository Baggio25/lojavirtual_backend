package com.baggio.projeto.lojavirtual.model;


import java.util.HashSet;
import java.util.Set;

import com.baggio.projeto.lojavirtual.model.enums.TipoEndereco;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ENDERECO")
@SequenceGenerator(name = "SEQ_ENDERECO", sequenceName = "SEQ_ENDERECO", allocationSize = 1, initialValue = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ENDERECO")
    private Long id;

    private String rua;
    private String cep;
    private String numero;
    private String complemento;
    private String bairro;
    private String uf;
    private String cidade;

    @Column(name = "tipo_endereco")
    @Enumerated(EnumType.STRING)
    private TipoEndereco tipoEndereco;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_fisica")
    private PessoaFisica pessoaFisica;
    
    @ManyToOne
    @JoinColumn(name = "id_pessoa_juridica")
    private PessoaJuridica pessoaJuridica;
}
