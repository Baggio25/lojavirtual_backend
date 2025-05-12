package com.baggio.projeto.lojavirtual.dto;

import com.baggio.projeto.lojavirtual.model.CategoriaProduto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CategoriaProdutoDTO {
    
    private Long id;
    
    @NotBlank(message = "A [descricao] é obrigatória")
    private String descricao;

    public CategoriaProdutoDTO(CategoriaProduto categoriaProduto) {
        this.id = categoriaProduto.getId();
        this.descricao = categoriaProduto.getDescricao();
    }
}
