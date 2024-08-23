package hn.examen2.examen2.Controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.examen2.examen2.Modelos.Posicion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@RestController
@RequestMapping("api/posiciones")

public class PosicionController {

private PosicionService posicionService;
@Autowired

    @GetMapping("/tabla")
    public List<Posicion> obtenerTablaPosiciones() {
    
        return posicionService.obtenerTablaPosiciones();
    }
    

    
}
