package com.example.demo.Servicios;


import com.example.demo.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuarios {
    private ArrayList<Usuario> lista = new ArrayList<>();

    public servicioUsuarios(){
        lista.add(new Usuario(01,"Inglaterra", "Julian", "julian2008@gmail.com", LocalDate.of(2008,05,13)  ));
        lista.add(new Usuario(02,"Brasil", "Daniel", "daniel2009@gmail.com", LocalDate.of(2009,3,29) ));
        lista.add(new Usuario(03,"Canada", "Andres","andres2004@gmail.com" ,LocalDate.of(2004,6,9) ));
        lista.add(new Usuario(04,"Portugal", "Luis","luis2005@gmail.com" , LocalDate.of(2005,8,5) ));
        lista.add(new Usuario(05,"Colombia", "Felipe", "felipe2004@gmail.com", LocalDate.of(2004,2,18)));
    }


    public ArrayList<Usuario>listar(){return lista; }

    public String agregarUsuario(Usuario usu){
        lista.add(usu);
        return "Registro Exitoso";
    }
    public Usuario buscarUsuario(int id){
        Usuario usu = null;
        for(Usuario us: lista){
            if(us.getId()==id){
                usu=us;
            }
        }
        return usu;
    }

    public int actualizarUsuario(int id) {
         int Id = 0;

        for (int i = 0; i < lista.size(); i++) {
            Id = lista.get(i).getId();

        }
        return Id;

    }

    public Usuario eliminarUsuario(int id) {
        Usuario usuarioEliminado = null;
        for (Usuario u : lista) {
            if (u.getId() == id) {
                usuarioEliminado = u;
                lista.remove(u);
                break;
            }
        }
        return usuarioEliminado;
    }

}
