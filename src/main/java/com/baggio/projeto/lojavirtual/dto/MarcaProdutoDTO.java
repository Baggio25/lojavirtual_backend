package com.baggio.projeto.lojavirtual.dto;

import com.baggio.projeto.lojavirtual.model.MarcaProduto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class MarcaProdutoDTO {
    
    private Long id;
    
    @NotBlank(message = "A [descricao] é obrigatória")
    private String descricao;

    public MarcaProdutoDTO(MarcaProduto marcaProduto) {
        this.id = marcaProduto.getId();
        this.descricao = marcaProduto.getDescricao();
    }
}
