package br.com.etechoracio.pw2Jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "TBL_SERVICO")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Long id;

    @Column(name = "TX_DESCRICAO")
    private String descricao;

    @Column(name = "NR_VALOR")
    private double valor;
}
