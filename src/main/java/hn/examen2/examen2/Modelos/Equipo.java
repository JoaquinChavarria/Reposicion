package hn.examen2.examen2.Modelos;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "equipos")
public class Equipo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int CodigoEquipo;
private String nombre;
private double ataque;
private double defensa;

@OneToOne(mappedBy = "equipo", cascade = CascadeType.ALL)
private Posicion posicion;
    
}
