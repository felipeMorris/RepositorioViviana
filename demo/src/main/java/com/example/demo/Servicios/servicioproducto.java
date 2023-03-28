package com.example.demo.Servicios;
import com.example.demo.Entidades.producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioproducto {

    private ArrayList<producto> lista = new ArrayList<>();

    public servicioproducto() {
        lista.add(new producto(101, "Arroz", "Granos", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(102, "Papa", "Tuberculo", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(103, "Aguacate", "Fruta", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(104, "Frijol", "Granos", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(105, "Maiz", "Granos", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(105, "Lechuga", "Verdura", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(106, "Tomate", "Verdura", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(107, "Cebolla", "Verdura", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(108, "Pescado", "Crudos", 3000.0, 20, 0, 0, 0));
        lista.add(new producto(109, "Carne", "Crudos", 3000.0, 20, 0, 0, 0));
    }

    public ArrayList<producto> listar() {
        return lista;
    }

    public String agregarProducto(producto pro) {
        lista.add(pro);
        return "Ingreso de Producto Exitoso";
    }

    public producto buscarProducto(String nombre) {
        producto pro = null;
        for (producto producto : lista) {
            if (producto.getNombre() == nombre) {
                pro = producto;
            }
        }
        return pro;
    }

    public producto buscarMaxTotal(double total) {
        producto pro = null;
        double maxTotal = Double.MIN_VALUE;
        for (producto producto : lista) {
            if (producto.getTotal() == total && producto.getTotal() > maxTotal) {
                pro = producto;
                maxTotal = producto.getTotal();
            }
        }
        return pro;
    }


    public producto eliminarMaxTotal(double total) {
        producto pro = null;
        double maxTotal = Double.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < lista.size(); i++) {
            producto produ = lista.get(i);
            if (produ.getTotal() == total && produ.getTotal() > maxTotal) {
                pro = produ;
                maxTotal = produ.getTotal();
                maxIndex = i;
            }
            if (maxIndex >= 0) {
                lista.remove(maxIndex);
            }
        }
        return pro;
    }
}
