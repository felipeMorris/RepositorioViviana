package com.example.demo.Controlador;

import com.example.demo.Entidades.producto;
import com.example.demo.Servicios.servicioproducto;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins="*",maxAge = 3600)
@RestController
public class controladorproducto {

    servicioproducto servicio = new servicioproducto();

    @GetMapping("/listarproduct")
    public ArrayList<producto>listar(){
        return servicio.listar();
    }

    @PostMapping("/agregarproduct")
    public String agregarProducto( producto producto){
        return servicio.agregarProducto(producto);
    }

    @GetMapping("/buscarproduct")
    public producto buscarProducto( String nombre){
        return servicio.buscarProducto(nombre);
    }

    @GetMapping("/buscarMaxTotal")
    public producto buscarMaxTotal( double total){
        return servicio.buscarMaxTotal(total);
    }

    @GetMapping("/eliminarproducto/{MaxTotal}")
    public producto eliminarMaxTotal(double total){
        return servicio.eliminarMaxTotal(total);
    }

}

