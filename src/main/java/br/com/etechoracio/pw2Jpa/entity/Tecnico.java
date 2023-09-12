package br.com.etechoracio.pw2Jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "TBL_TECNICO")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TECNICO")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "TX_AREA_FONE")
    private String areaFone;

    @Column(name = "TX_FONE")
    private String fone;

    @Column(name = "TX_TIPO_FONE")
    private String tipoFone;

    @Column(name = "TX_EMAIL")
    private String email;
}
