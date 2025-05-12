package com.baggio.projeto.lojavirtual.dto;

import java.util.Date;

import com.baggio.projeto.lojavirtual.model.PessoaFisica;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisicaDTO extends PessoaDTO{
    
    @NotBlank(message = "O [cpf] é obrigatório")
    private String cpf;    
    
    private Date dataNascimento;

    public PessoaFisicaDTO(PessoaFisica pessoaFisica) {
        super(pessoaFisica.getId(), pessoaFisica.getNome(), pessoaFisica.getEmail(), pessoaFisica.getTelefone());
        this.cpf = pessoaFisica.getCpf();
        this.dataNascimento = pessoaFisica.getDataNascimento();
    }
}
