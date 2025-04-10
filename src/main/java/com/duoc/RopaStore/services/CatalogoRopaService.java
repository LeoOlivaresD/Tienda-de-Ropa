package com.duoc.RopaStore.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStore.models.CatalogoRopa;

@Service
public interface CatalogoRopaService {
    List<CatalogoRopa> getAllCatalogoRopa();

    List<CatalogoRopa> listarPorPrecioMenorAMayor();
}
