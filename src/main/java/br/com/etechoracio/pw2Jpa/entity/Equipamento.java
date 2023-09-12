package br.com.etechoracio.pw2Jpa.entity;

import br.com.etechoracio.pw2Jpa.enuns.TipoEquipamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "TBL_EQUIPAMENTO")
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIPAMENTO")
    private Long id;

    @Column(name = "TX_MARCA")
    private String marca;

    @Column(name = "TX_MODELO")
    private String modelo;

    @Column(name = "TX_NUMERO_SERIE")
    private String numeroSerie;

    @Enumerated(EnumType.STRING)
    @Column(name = "TX_TIPO")
    private TipoEquipamentoEnum tipo;
}
