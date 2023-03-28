package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProducts {

    servicioProducts servicio = new servicioProducts();

    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar() {
    return servicio.mostrar();
    }

    @GetMapping("/MostrarProductos")
    public int mostrar(){
        return servicio.cantidad();
    }

    @GetMapping("/TotalPrecios")
    public double actualizar(){
        return servicio.actualizar();
    }



}
