package br.com.poo.rh;

/**
 * Gerente
 */
public class Gerente extends Funcionario implements Autenticavel {

    private boolean autenticado = false;
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    // -----------------------------------
    public void setAutenticado(boolean a) {
        this.autenticado = a;
    }

    public boolean getAutenticado() {
        return this.autenticado;
    }

    public String getSenha() {
        return this.senha;
    }

}