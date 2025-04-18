package com.duoc.RopaStore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.RopaStore.models.CatalogoRopa;
import com.duoc.RopaStore.services.CatalogoRopaService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/catalogo")
@RequiredArgsConstructor
public class RestControllerCatalogoRopa {

    private final CatalogoRopaService catalogoRopaService;

    @GetMapping
    public ResponseEntity<List<CatalogoRopa>> listarRopa() {
        List<CatalogoRopa> ropa = catalogoRopaService.getAllCatalogoRopa();
        if (ropa.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ropa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarProducto(@PathVariable Long id) {
        CatalogoRopa ropa = catalogoRopaService.findById(id);

        if (ropa != null) {
            catalogoRopaService.deleteById(id);
            return ResponseEntity.ok("Producto eliminado exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Producto no encontrado con ID: " + id);
        }
    }


    @GetMapping("/precio")
    public ResponseEntity<List<CatalogoRopa>> listarRopaPorPrecio() {
        List<CatalogoRopa> ropa = catalogoRopaService.listarPorPrecioMenorAMayor();
        if (ropa.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ropa);
    }

    @PostMapping
    public ResponseEntity<Void> agregarPrenda(@RequestBody CatalogoRopa prenda) {
        catalogoRopaService.agregarPrenda(prenda);
        return ResponseEntity.status(201).build();
    }

}
