package com.duoc.RopaStore.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esta notacion incluye metodos: Setters, Getters & toString
@AllArgsConstructor // Indicamos que la clase tendra unc ontructor con todos los parametros
@NoArgsConstructor // Indicamos que la clase tendra un constructor sin parametros
public class CatalogoRopa {
    private Long idRopa;
    private String categoriaPrenda;
    private String marcaPrenda;
    private String tipoPrenda;
    private int precioPrenda;
}
