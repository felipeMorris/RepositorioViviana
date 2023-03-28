package com.example.demo.Servicios;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioProducts {

    private ArrayList<Productos> lista = new ArrayList<>();

    public servicioProducts() {
        lista.add(new Productos(1, "Manzana", 3000.0, 50, 0, "Frutas"));
        lista.add(new Productos(1, "Lechuga", 3000.0, 30, 0, "Vegetales"));
        lista.add(new Productos(1, "Maiz", 3000.0, 12, 0, "Granos"));
        lista.add(new Productos(1, "Papa", 3000.0, 5, 0, "Vegetales"));
        lista.add(new Productos(1, "Arroz", 3000.0, 21, 0, "Granos"));
    }

    public ArrayList<Productos> mostrar() {
        return lista;
    }

    public int cantidad() {
        return lista.size();

    }

    public double actualizar() {
        double total = 0;
        double x = 0;

        for (int i = 0; i < lista.size(); i++) {
            total = lista.get(i).getCantidad() * lista.get(i).getPrecio();

            lista.get(i).setTotal(total);
            lista.set(i, lista.get(i));
            x += total;
        }
        return x;

    }

    public double total() {
        double total = 0;
        double x = 0;
        for (int i = 0; i < lista.size(); i++) {
            total = lista.get(i).getTotal();
            x += total;
        }

        return total;
    }
}


