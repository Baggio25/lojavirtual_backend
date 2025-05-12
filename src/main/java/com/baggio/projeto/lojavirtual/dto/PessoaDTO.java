package com.baggio.projeto.lojavirtual.dto;

import com.baggio.projeto.lojavirtual.model.Pessoa;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public abstract class PessoaDTO {
    
    private Long id;
    
    @NotBlank(message = "O [nome] é obrigatório")
    private String nome;
    
    @NotBlank(message = "O [email] é obrigatório")
    @Email(message = "O [email] é inválido")
    private String email;
    
    @NotBlank(message = "O [telefone] é obrigatório")
    private String telefone;

    public PessoaDTO(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.telefone = pessoa.getTelefone();
    }
}
