package br.com.etechoracio.pw2Jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "TX_NOME")
    private String name;

    @Column(name = "TX_DOCUMENTO")
    private String documento;

    @Column(name = "TX_TIPO_DOCUMENTO")
    private String tipoDocumento;

    @Column(name = "TX_AREA_FONE")
    private String areaFone;

    @Column(name = "TX_FONE")
    private String fone;

    @Column(name = "TX_TIPO_FONE")
    private String tipoFone;

    @Column(name = "TX_EMAIL")
    private String email;
}
