package com.example.demo.Controlador;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.servicioUsuarios;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins="*",maxAge = 3600)
@RestController
public class ControladorUsuarios {
    servicioUsuarios servicio= new servicioUsuarios();

    @GetMapping("/listarUsuarios")
    public ArrayList<Usuario> listarUsuario(){
        return servicio.listar();
    }


    @PostMapping("/agregarUsuario")
    public String agregar(@RequestBody Usuario usuario){
        return servicio.agregarUsuario(usuario);
    }

    @GetMapping("/buscarUsuario/{code}")
    public Usuario buscarUsuario(@PathVariable("code") int id){
        return servicio.buscarUsuario(id);
    }

    @GetMapping("/actualizarUsuario/{code}")
    public int actualizarUsuario(@PathVariable("code")int id){return servicio.actualizarUsuario(id); }


    @GetMapping("/eliminarUsuario/{code}")
    public Usuario eliminarUsuario(@PathVariable("code")int id){return servicio.eliminarUsuario(id); }

}
