package com.baggio.projeto.lojavirtual.dto;

import com.baggio.projeto.lojavirtual.model.Endereco;
import com.baggio.projeto.lojavirtual.model.enums.TipoEndereco;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class EnderecoDTO {
    
    private Long id;

    @NotBlank(message = "A [rua] é obrigatória")
    private String rua;

    @NotBlank(message = "O [cep] é obrigatório")
    private String cep;

    @NotBlank(message = "O [numero] é obrigatório")
    private String numero;
    private String complemento;

    @NotBlank(message = "O [bairro] é obrigatório")
    private String bairro;

    @NotBlank(message = "A [uf] é obrigatória")
    private String uf;

    @NotBlank(message = "A [cidade] é obrigatória")
    private String cidade;
    
    @NotBlank(message = "O [tipoEndereco] é obrigatório")
    private String tipoEndereco;

    public EnderecoDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.rua = endereco.getRua();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.uf = endereco.getUf();
        this.cidade = endereco.getCidade();
        this.tipoEndereco = endereco.getTipoEndereco().name();
    }
}
