package hn.examen2.examen2.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import hn.examen2.examen2.Servicios.EquipoService;
import hn.examen2.examen2.Modelos.Equipo;


@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
    @Autowired
    private EquipoService equipoService;

    @PostMapping("/crear")
    public Equipo creearEquipo(@RequestBody Equipo equipo){
        return equipoService.crearEquipo(equipo);
    }
}
    
    



    



