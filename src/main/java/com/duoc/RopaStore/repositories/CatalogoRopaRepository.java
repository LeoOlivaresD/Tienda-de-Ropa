package com.duoc.RopaStore.repositories;

import java.util.ArrayList;
import java.util.List;

import com.duoc.RopaStore.models.CatalogoRopa;

public class CatalogoRopaRepository {
    // Lista donde almacenaremos nuestro catalogo
    private final List<CatalogoRopa> listaRopa = new ArrayList<>();

    // Metodo para listar ropa de manera convencional
    public List<CatalogoRopa> findAll() {
        return listaRopa;
    }

    // Metodo para listar ropa ordenada por precio de menor a mayor
    public List<CatalogoRopa> listarPorPrecioAscendente() {
        // Creamos una copia para no modificar la lista original
        List<CatalogoRopa> listaOrdenada = new ArrayList<>(listaRopa);
        listaOrdenada.sort((ropa1, ropa2) -> Integer.compare(ropa1.getPrecioPrenda(), ropa2.getPrecioPrenda()));
        return listaOrdenada;
    }

    // Metodo para agregar ropa al catalogo
    public void agregarACatalogo(CatalogoRopa catalogoRopa) {
        listaRopa.add(catalogoRopa);
    }

    public CatalogoRopaRepository() {
        listaRopa.add(new CatalogoRopa(1, "Invierno", "Adidas", "Chaqueta", 50000));
        listaRopa.add(new CatalogoRopa(2, "Deporte", "Nike", "Calcetas", 10000));
        listaRopa.add(new CatalogoRopa(3, "Verano", "Americanino", "Bermudas", 15000));
        listaRopa.add(new CatalogoRopa(4, "Mujer", "Zara", "Blusa", 20000));

    }

}
