package com.duoc.RopaStore.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.RopaStore.models.CatalogoRopa;
import com.duoc.RopaStore.repositories.CatalogoRopaRepository;

@Service
public class CatalogoRopaServiceImpl implements CatalogoRopaService {

    private final CatalogoRopaRepository catalogoRopaRepository = new CatalogoRopaRepository();

    @Override
    public List<CatalogoRopa> getAllCatalogoRopa() {
        return catalogoRopaRepository.findAll();
    }

    @Override
    public List<CatalogoRopa> listarPorPrecioMenorAMayor() {
        return catalogoRopaRepository.listarPorPrecioAscendente();
    }

}
