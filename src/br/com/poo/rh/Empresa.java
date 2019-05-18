package br.com.poo.rh;

import java.util.*;
import br.com.poo.exceptions.*;

/**
 * Empresa
 */
public class Empresa {

    private String nome;
    private final List<Funcionario> funcionarios = new LinkedList<>();
    
    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void admitir(Funcionario f) {
        funcionarios.add(f);
    }

    public void demitir(Funcionario f) {
        if (funcionarios.contains(f)) {
            funcionarios.remove(f);
        }
        else {
            throw new ObjectNotFoundException("Funcionario não encontrado!");
        }
    }

    public void listar() {

        Collections.sort(funcionarios);
/*
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.println(f);
        }
*/
        for(Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
}