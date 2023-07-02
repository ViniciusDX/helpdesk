package com.vinicius.helpdesk.domain.enums;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    public static Status toEnum(Long cod) {
        if (cod == null) {
            return null;
        }
        for (Status x : Status.values()) {
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}