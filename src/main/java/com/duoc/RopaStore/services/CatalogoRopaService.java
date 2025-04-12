package com.duoc.RopaStore.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStore.models.CatalogoRopa;


@Service
public interface CatalogoRopaService {
    List<CatalogoRopa> getAllCatalogoRopa();

    List<CatalogoRopa> listarPorPrecioMenorAMayor();

    void agregarPrenda(CatalogoRopa catalogoRopa);
    
    CatalogoRopa findById(Long id); // Nuevo método

    boolean deleteById(Long id);    // Nuevo método

}
