package com.baggio.projeto.lojavirtual.dto;

import com.baggio.projeto.lojavirtual.model.Acesso;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class AcessoDTO {
    
    private Long id;
    
    @NotBlank(message = "A [descricao] é obrigatória")
    private String descricao;

    public AcessoDTO(Acesso acesso) {
        this.id = acesso.getId();
        this.descricao = acesso.getDescricao();
    }
}
