package com.baggio.projeto.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MARCA_PRODUTO")
@SequenceGenerator(name = "SEQ_MARCA_PRODUTO", sequenceName = "SEQ_MARCA_PRODUTO", allocationSize = 1, initialValue = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class MarcaProduto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MARCA_PRODUTO")
    private Long id;

    private String descricao;

}
