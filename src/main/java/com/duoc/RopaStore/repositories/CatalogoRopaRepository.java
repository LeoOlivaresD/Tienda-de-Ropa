package com.duoc.RopaStore.repositories;

import java.util.ArrayList;
import java.util.List;

import com.duoc.RopaStore.models.CatalogoRopa;

public class CatalogoRopaRepository {
    // Lista donde almacenaremos nuestro catalogo
    private final List<CatalogoRopa> listaRopa = new ArrayList<>();

    // Metodo para listar ropa de manera convensional
    public List<CatalogoRopa> findAll() {
        return listaRopa;
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
