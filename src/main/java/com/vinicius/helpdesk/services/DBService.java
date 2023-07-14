package com.vinicius.helpdesk.services;

import com.vinicius.helpdesk.domain.Chamado;
import com.vinicius.helpdesk.domain.Cliente;
import com.vinicius.helpdesk.domain.Tecnico;
import com.vinicius.helpdesk.domain.enums.Perfil;
import com.vinicius.helpdesk.domain.enums.Prioridade;
import com.vinicius.helpdesk.domain.enums.Status;
import com.vinicius.helpdesk.repositories.ChamadoRepository;
import com.vinicius.helpdesk.repositories.ClienteRepository;
import com.vinicius.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;


    public void instanciaDB(){
        Tecnico tec1 = new Tecnico(null, "Vinícius Diniz", "34145048717","vinicius@mail.com","12345");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null,"Linus Torvalds","805277954780","torvalds@mail.com", "1234556");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01","Primeiro chamado" ,tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
