package com.duoc.RopaStore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.RopaStore.models.CatalogoRopa;
import com.duoc.RopaStore.services.CatalogoRopaService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/catalogo")
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

    @GetMapping("/precio")
    public ResponseEntity<List<CatalogoRopa>> listarRopaPorPrecio() {
        List<CatalogoRopa> ropa = catalogoRopaService.listarPorPrecioMenorAMayor();
        if (ropa.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ropa);
    }
}
