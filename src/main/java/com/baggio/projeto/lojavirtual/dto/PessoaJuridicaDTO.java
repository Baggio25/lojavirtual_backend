package com.baggio.projeto.lojavirtual.dto;

import com.baggio.projeto.lojavirtual.model.PessoaJuridica;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridicaDTO extends PessoaDTO{
    
    @NotBlank(message = "O [cnpj] é obrigatório")
    private String cnpj;    
    
    @NotBlank(message = "A [categoria] é obrigatória")
    private String categoria;
    
    @NotBlank(message = "A [inscEstadual] é obrigatória")
    private String inscEstadual; 
    
    private String inscMunicipal;    
    
    @NotBlank(message = "O [nomeFantasia] é obrigatório")
    private String nomeFantasia; 
    
    @NotBlank(message = "A [razaoSocial] é obrigatória")
    private String razaoSocial;    

    public PessoaJuridicaDTO(PessoaJuridica pessoaJuridica) {
        super(pessoaJuridica.getId(), pessoaJuridica.getNome(), pessoaJuridica.getEmail(), pessoaJuridica.getTelefone());
        this.cnpj = pessoaJuridica.getCnpj();
        this.categoria = pessoaJuridica.getCategoria();
        this.inscEstadual = pessoaJuridica.getInscEstadual();
        this.inscMunicipal = pessoaJuridica.getInscMunicipal();
        this.nomeFantasia = pessoaJuridica.getNomeFantasia();
        this.razaoSocial = pessoaJuridica.getRazaoSocial();
    }
}
