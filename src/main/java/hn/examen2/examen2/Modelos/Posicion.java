package hn.examen2.examen2.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "posiciones")

public class Posicion {    

@Id
private int CodigoEquipo;
private int empates;
private int ganados;
private int perdidos;
private int golesfavor;
private int golescontra;
private int puntos;

@OneToOne
@MapsId
@JoinColumn(name = "codigoEquipo")
private Equipo equipo;
    
}
