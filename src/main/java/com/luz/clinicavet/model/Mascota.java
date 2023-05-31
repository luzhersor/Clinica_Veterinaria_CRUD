
package com.luz.clinicavet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    @OneToOne
    @JoinColumn(name="id_dueno", referencedColumnName = "id_dueno")
    private Dueno unDueno;
    
    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color, Dueno unDueno) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.unDueno = unDueno;
    }
    
    
}
