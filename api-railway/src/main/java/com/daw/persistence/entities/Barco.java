package com.daw.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "barco")
@Getter
@Setter
@NoArgsConstructor
public class Barco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String usuario;

    @Column(name = "id_puerto")
    private int idPuerto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_puerto", referencedColumnName = "id", insertable = false, updatable = false)
    private Puerto puerto;

}
