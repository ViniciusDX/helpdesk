package com.vinicius.helpdesk.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Tecnico extends Pessoa {
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }
}
