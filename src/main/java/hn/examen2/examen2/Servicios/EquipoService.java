package hn.examen2.examen2.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.examen2.examen2.Modelos.Equipo;
import hn.examen2.examen2.Repositorios.EquipoRepository;;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository EquipoRepository;
    public static Equipo crearEquipo(Equipo equipo){
        return EquipoRepository.save(equipo);

    }

    public static void eliminarEquipo(int codigoEquipo)
    {

    EquipoRepository.deleteById(codigoEquipo);

    }

    
}
