package com.rubens.crud.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum CategoriaEnum {
    ELETRONICOS("eletro"),
    ALIMENTOS("alime");
    private String sigla;

    public CategoriaEnum pegaSiglaDevolveEnum(String sigla){
        return Stream.of(CategoriaEnum.values()).
                filter(categoriaEnum -> categoriaEnum.getSigla().equals(sigla)).
                findFirst().orElse(null);
    }


}
