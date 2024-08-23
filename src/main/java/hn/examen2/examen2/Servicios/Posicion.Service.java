package hn.examen2.examen2.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen2.examen2.Repositorios.PosicionRepository;

@Service
public class Posicion.service {

    @Autowired

    private PosicionRepository posicionRepository;

    public List<Posicion> obtenerTablaPosiciones(){
        return posicionRepository.findAll();
    }
    public void actualizarPosicion(Posicion posicion){
        posicionRepository.save(posicion);
    }



    
}
