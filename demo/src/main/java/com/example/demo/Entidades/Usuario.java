package com.example.demo.Entidades;

import java.time.LocalDate;

public class Usuario {

    private String pais;

    private String nombre;

    private String correo;

    private LocalDate Fecha;

    private int id;

    public Usuario(int id, String pais, String nombre, String correo, LocalDate fecha ) {
        this.id = id;
        this.pais = pais;
        this.nombre = nombre;
        this.correo = correo;
        this.Fecha = fecha;

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
