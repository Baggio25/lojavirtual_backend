package com.baggio.projeto.lojavirtual.model.enums;

public enum TipoEndereco {
    COBRANCA("Cobrança"),
    ENTREGA("Entrega"),
    COMERCIAL("Comercial"),
    PRINCIPAL("Principal"),;

    private String descricao;

    private TipoEndereco(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
