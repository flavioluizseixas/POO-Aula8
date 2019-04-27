package br.com.poo.rh;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return this.getClass().getName() + "@" +
            Integer.toHexString(this.hashCode()) + " - " +
            this.nome + ";" +
            this.cpf + ";R$" +
            this.salario;
    }

}
