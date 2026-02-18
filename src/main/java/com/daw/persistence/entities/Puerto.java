package com.daw.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "puerto")
@Getter
@Setter
@NoArgsConstructor
public class Puerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String direccion;

    @OneToMany(mappedBy = "puerto")
    @JsonIgnore
    private List<Barco> barcos;

}
