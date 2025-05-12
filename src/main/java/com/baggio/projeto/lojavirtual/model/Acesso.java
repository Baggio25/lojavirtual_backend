package com.baggio.projeto.lojavirtual.model;

import org.springframework.security.core.GrantedAuthority;

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
@Table(name = "ACESSO")
@SequenceGenerator(name = "SEQ_ACESSO", sequenceName = "SEQ_ACESSO", allocationSize = 1, initialValue = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Acesso implements GrantedAuthority{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ACESSO")
    private Long id;

    /**
     * Ex.: ROLE_ADMIN, ROLE_OPERADOR
     */
    private String descricao;

    @Override
    public String getAuthority() {
        return this.descricao;
    }

}
